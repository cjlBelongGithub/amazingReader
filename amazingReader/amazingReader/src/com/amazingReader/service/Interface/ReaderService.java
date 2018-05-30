package com.amazingReader.service.Interface;

import java.util.List;

import com.amazingReader.entity.Book;
import com.amazingReader.entity.Chapter;
import com.amazingReader.entity.Comment;
import com.amazingReader.entity.Reader;
import com.amazingReader.entity.ReportChapter;
import com.amazingReader.entity.ReportComment;

public interface ReaderService {
	/**
	 * 返回值指示是否登录成功
	 * @param reader
	 * @return
	 */
	boolean login(Reader reader);
	/**
	 * 
	 * @param reader
	 * @return
	 */
	boolean alterInfo(Reader reader);
	/**
	 * 返回注册得到的账号
	 * 若返回-1则标识注册失败
	 * @param reader
	 * @return 
	 */
	int register(Reader reader);
	/**
	 * 直接阅读使用这个方法
	 * 		返回传入书籍ID的首章
	 * @param bookID
	 * @return
	 */
	Chapter readFirstChapterBy(int bookID,int readerId);
	/**
	 * 
	 * 比对用户输入手机号和注册手机号
	 * 控制control端的验证码发送
	 * @param telNum
	 * @param reader
	 * @return
	 */
	boolean forgetPassword(String telNum ,int readerId);
	/**
	 * readerId 必须给定
	 * @param comment
	 * @return
	 */
	boolean comment(Comment comment);
	/**
	 * 通过章节ID获得章节内容
	 * 该方法会修改书籍阅读记录至请求章节号位置
	 * @param chapterId
	 * @return
	 */
	Chapter read(int chapterId,int readerId);
	/**
	 * 通过书籍号和章节号获得章节内容
	 * 该方法会修改书籍阅读记录至请求章节号位置
	 * @param bookId
	 * @param chapterNum
	 * @return
	 */
	Chapter readBy(int bookId,int chapterNum,int readerId);
//	/**
//	 * 通过书架看书
//	 */
//	Chapter readBy(ReaderBookRelation readerBookRelation);
	/**
	 * 给出书籍号和读者信息（从session拿）
	 * 把书籍存入书架，章节默认值为1
	 * @param bookID
	 * @param reader
	 * @return
	 */
	boolean addBookToBookShelf(int bookId,int readerId);
	/**
	 * 传入被举报评论ID，当前读者ID，举报类型ID，以及原因
	 * 其他字段留空
	 * @param reportComment
	 * @return
	 */
	boolean reportComment(ReportComment reportComment);
	/**
	 * 传入被举报章节ID，当前读者ID，举报类型ID，以及原因
	 * 其他字段留空
	 * @param reportComment
	 * @return
	 */
	boolean reportChapter(ReportChapter reportChapter);
	/**
	 * 获得当前读者发出的评论
	 * @param self
	 * @return
	 */
	List<Comment> readCommentsSendBy(int readerId);
	/**
	 * 获得评论当前读者发出的评论的回复
	 * @param readerId
	 * @return
	 */
	List<Comment> readCommentsTo(int readerId);
	
	/**
	 * 充值
	 * 返回充值后余额
	 */
	double recharge(double num, int readerId);
	/**
	 * 获得该用户的首页定制化推荐
	 * @param readerId
	 * @return
	 */
	List<Book> getFirstPageBooks(int readerId);
	/**
	 * 获得活动书籍
	 */
	List<Book> getActivityBooks();
}
