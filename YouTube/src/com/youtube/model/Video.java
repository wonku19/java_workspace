package com.youtube.model;

import java.util.Date;
import java.util.List;

public class Video {
	
	// Create : 추가
	// Read : 읽기 (1개, 목록)
	// Update : 수정
	// Delete : 삭제
	// CRUD > Create / Read / Update / Delete 로 거의 모든 기능을 찾아낼 수 있음
	
	private String title;
	private Date uploadAt;
	private int views;
	private String imgUrl; 
	private String fileUrl;
	private String desc;
	private char kind; // short & video 둘 중 하나

	private List<Comment> comments;
	private Category category;
}
