package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.Comment;

public interface CommentMapper {
	public int getMaxTID();
	
	public boolean add(Comment comment);
	public boolean alter(Comment comment);
	public boolean removeByCommentTid(int commentTid);
	public boolean removeByCommentId(int commentId);

	public Comment getCommentBy(int commentId);
	/**
	 * 获得章节下评论
	 * @param chapterId
	 * @return
	 */
	public List<Comment> getTieZiByChapterId(int chapterId);
	/**
	 * 获得评论下回复
	 * @param TieZiId
	 * @return
	 */
	public List<Comment> getCommentsByTieZiId(int tId);
	/**
	 * 获得某用户发出的所有评论
	 * @param readerId
	 * @return
	 */
	public List<Comment> getCommentsByReaderId(int readerId);
	/**
	 * 获得发给某用户的所有评论
	 * @param readerId
	 * @return
	 */
	public List<Comment> getCommentsToReaderId(int readerId);
	
}
