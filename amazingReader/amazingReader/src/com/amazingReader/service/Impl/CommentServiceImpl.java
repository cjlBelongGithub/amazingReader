package com.amazingReader.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazingReader.entity.Comment;
import com.amazingReader.entity.CommentLikeRecord;
import com.amazingReader.mapper.ChapterMapper;
import com.amazingReader.mapper.CommentLikeRecordMapper;
import com.amazingReader.mapper.CommentMapper;
import com.amazingReader.service.Interface.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private CommentLikeRecordMapper commentLikeRecordMapper;
	@Autowired
	private ChapterMapper chapterMapper;
	
	@Override
	public boolean comment(Comment comment) {
		return commentMapper.add(comment);
	}

	@Override
	public boolean like(int commentId,int readerId) {
		CommentLikeRecord like = new CommentLikeRecord();
		like.setCommentID(commentId);
		like.setReaderID(readerId);
		if(commentLikeRecordMapper.isLiked(readerId, commentId)==0){
			commentLikeRecordMapper.addCommentLike(like);
			return true;
		}else{
			commentLikeRecordMapper.removeLike(like);
			return false;
		}
	}

	@Override
	public void removeComment(int commentId) {
		commentMapper.removeByCommentId(commentId);
	}

	@Override
	public boolean post(Comment post) {
		return commentMapper.add(post);
	}

	@Override
	public List<Comment> getAllPostOf(int chapterId) {
		return commentMapper.getTieZiByChapterId(chapterId);
	}

	@Override
	public List<Comment> getAllPostOf(int bookId, int chapterNum) {
		int chapterId = chapterMapper.getChapterIdBy(bookId, chapterNum);
		return commentMapper.getTieZiByChapterId(chapterId);
	}

	@Override
	public List<Comment> getAllCommentsOfPost(int tId) {
		return commentMapper.getCommentsByTieZiId(tId);
	}

}
