package com.amazingReader.service.Interface;

import java.util.List;

import com.amazingReader.entity.Comment;

public interface CommentService {
	/**
	 * 章节下发帖
	 * comment的commented——reader_ID字段留空
	 * @param post
	 * @return
	 */
	boolean post(Comment post);
	/**
	 * 帖子下评论
	 * comment的tId字段为当前帖子Id
	 * @param comment
	 * @return
	 */
	boolean comment(Comment comment);
	/**
	 * 开关方式控制点赞
	 * 用boolean值返回是否点了赞
	 * @param commentId
	 */
	boolean like(int commentId,int readerId);
	
	void removeComment(int commentId);
	
	List<Comment> getAllPostOf(int chapterId);
	
	List<Comment> getAllPostOf(int bookId,int chapterNum);
	/**
	 * 通过帖子号获得其下的评论
	 * @param tId
	 * @return
	 */
	List<Comment> getAllCommentsOfPost(int tId);
}
