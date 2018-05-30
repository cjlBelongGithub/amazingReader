package com.amazingReader.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazingReader.entity.Book;
import com.amazingReader.entity.Chapter;
import com.amazingReader.entity.Comment;
import com.amazingReader.entity.Reader;
import com.amazingReader.entity.ReaderBookRelation;
import com.amazingReader.entity.ReaderReadingRecord;
import com.amazingReader.entity.Recharge;
import com.amazingReader.entity.ReportChapter;
import com.amazingReader.entity.ReportComment;
import com.amazingReader.mapper.BookMapper;
import com.amazingReader.mapper.ChapterMapper;
import com.amazingReader.mapper.CommentMapper;
import com.amazingReader.mapper.ReaderBookRelationMapper;
import com.amazingReader.mapper.ReaderMapper;
import com.amazingReader.mapper.ReaderOrderDetailMapper;
import com.amazingReader.mapper.ReaderReadingRecordMapper;
import com.amazingReader.mapper.RechargeMapper;
import com.amazingReader.mapper.ReportChapterMapper;
import com.amazingReader.mapper.ReportCommentMapper;
import com.amazingReader.service.Interface.ReaderService;

public class ReaderServiceImpl implements ReaderService{
	@Autowired
	private ReaderMapper readerMapper;
	@Autowired
	private ChapterMapper chapterMapper;
	@Autowired
	private RechargeMapper rechargeMapper;
	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private ReaderReadingRecordMapper readerReadingRecordMapper; 
	@Autowired
	private ReaderBookRelationMapper readerBookRelationMapper;
	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private ReaderOrderDetailMapper readerOrderDetailMapper;
	@Autowired
	private ReportChapterMapper reportChapterMapper;
	@Autowired
	private ReportCommentMapper reportCommentMapper;
	/**
	 * 		传入reader时，若登录框中输入数字将其存入readerId，否则存入readerNeckName
	 */
	@Override
	public boolean login(Reader reader) {
		if(reader!=null){
			//login with readerId
			Reader trueReader = readerMapper.getReader(reader.getReaderId());
			if(trueReader!=null){
				if(trueReader.getReaderPassword().equals(reader.getReaderPassword())){
					return true;
				}
			}else{
				//login with readerName
				Reader trueReader0 = readerMapper.getReaderByName(reader.getReaderNeckName());
				if(trueReader0!=null){
					if(trueReader0.getReaderPassword().equals(reader.getReaderPassword())){
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean alterInfo(Reader reader) {
		if(reader.getReaderId() == 0){
			return readerMapper.alter(reader);
		}
		return false;
	}

	@Override
	public int register(Reader reader) {
		if(reader != null){
			readerMapper.add(reader);
			return readerMapper.getReaderByName(reader.getReaderNeckName()).getReaderId();
		}
		return -1;
	}
	
	@Override
	public Chapter readFirstChapterBy(int bookID,int readerId) {
		int chapterId = chapterMapper.getFirstChapterIdOf(bookID);
		Chapter chapter = this.readChapter(chapterId, readerId);
		return chapter;
	}
	/**
	 * 该方法默认书籍活动状态中，限时免费标记为1，读者会员状态标记为2 ，
	 * @param chapterId
	 * @param readerId
	 * @return
	 */
	private Chapter readChapter(int chapterId,int readerId){
		Chapter chapter = chapterMapper.getChapterById(chapterId);//拿到章节数据
		
			if (bookMapper.getBookById(chapter.getChapterBookId()).getBookActivityStatu()  ||//书籍活动状态
					chapter.getChapterStatu() ||//章节活动状态
					readerMapper.getReader(readerId).getReaderStatuId() == 2  ||//用户会员状态
					isReaderGotChapter(chapterId, readerId)//用户是否购买
				) {
				ReaderReadingRecord readerReadingRecord = new ReaderReadingRecord();
				readerReadingRecord.setBookId(chapter.getChapterBookId());
				readerReadingRecord.setChapterNum(chapter.getChapterNum());
				readerReadingRecord.setReaderId(readerId);
				readerReadingRecord.setRecordTime(new Date());
				ReaderReadingRecord readerReadingRecord2 = readerReadingRecordMapper.getByBookIdAndReaderId(readerId,
						chapter.getChapterBookId());
				if (readerReadingRecord2 == null) {
					//不存在该阅读记录
					readerReadingRecordMapper.add(readerReadingRecord);//添加阅读记录
				} else {
					readerReadingRecord.setRecordId(readerReadingRecord2.getRecordId());
					readerReadingRecordMapper.alter(readerReadingRecord);
				}
				chapterMapper.click(chapterId);//点击数++
			}else{
				
			}
		return chapter;
	}
	
	private boolean isReaderGotChapter(int chapterId,int readerId){
		if(readerOrderDetailMapper.get(readerId, chapterId) == null){
			return false;
		};
		return true;
		
	}
	
	@Override
	public boolean forgetPassword(String telNum, int readerId) {
		Reader reader =  readerMapper.getReader(readerId);
		if(telNum!=null&&!"".equals(telNum.trim())&&telNum.equals(reader.getReaderTel())){
			return true;//允许发送验证码
		}
		//不允许发送验证码
		return false;
	}

	@Override
	public boolean comment(Comment comment) {
		return commentMapper.add(comment);
	}

	@Override
	public Chapter read(int chapterId, int readerId) {
		return this.readChapter(chapterId, readerId);
	}

	@Override
	public Chapter readBy(int bookId, int chapterNum, int readerId) {
		int chapterId = chapterMapper.getChapterIdBy(bookId, chapterNum);
		return this.readChapter(chapterId, readerId);
	}

	@Override
	public boolean addBookToBookShelf(int bookId, int readerId) {
		ReaderBookRelation readerBookRelation = new ReaderBookRelation();
			readerBookRelation.setReaderBookAddTime(new Date());
			readerBookRelation.setReaderBookBookId(bookId);
			readerBookRelation.setReaderId(readerId);
			readerBookRelation.setReaderBookReadingChapterNum(1);
			
		return readerBookRelationMapper.add(readerBookRelation);
	}

	@Override
	public boolean reportComment(ReportComment reportComment) {
		return reportCommentMapper.add(reportComment);
	}

	@Override
	public boolean reportChapter(ReportChapter reportChapter) {
		return reportChapterMapper.add(reportChapter);
	}

	@Override
	public List<Comment> readCommentsSendBy(int readerId) {
		return commentMapper.getCommentsByReaderId(readerId);
	}

	@Override
	public List<Comment> readCommentsTo(int readerId) {
		return commentMapper.getCommentsToReaderId(readerId);
	}

	@Override
	public double recharge(double num, int readerId) {
		//添加充值记录
		Recharge recharge = new Recharge();
		recharge.setRechargePrice(null);
		recharge.setRechargeReaderId(readerId);
		recharge.setRechargeTime(new Date());
		rechargeMapper.add(recharge);
		//修改余额
		Reader reader = readerMapper.getReader(readerId);
		reader.setReaderBalance(reader.getReaderBalance()+num);
		readerMapper.alter(reader);
		
		return reader.getReaderBalance();
	}

	@Override
	public List<Book> getFirstPageBooks(int readerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getActivityBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
