package com.youtube.impl;

import com.youtube.model.Comment;

// 팀 과제는 이 방식으로 진행하기
public interface CommentImpl {

	public void addComment(String id, String password, Comment comment);
	public Comment viewComment(int index);
	public void updateComment(int index, Comment comment);
	public void deleteComment(int index);
	
}
