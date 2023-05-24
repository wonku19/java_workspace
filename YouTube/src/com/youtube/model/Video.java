package com.youtube.model;

import java.util.Date;

public class Video {
	
	public String title;
	public String comment;
	public Date uploadAt;
	public int count;
	public String imgUrl; 
	public String fileUrl;


	// Create : 추가
	// Read : 읽기 (1개, 목록)
	// Update : 수정
	// Delete : 삭제
	// CRUD > Create / Read / Update / Delete 로 거의 모든 기능을 찾아낼 수 있음
	
	public Video upload () { // 동영상 업로드
		return null;
	}
	
	public Video[] videoList() { // 동영상 목록
		return null;
	}
	
	public Video viewVideo() { // 동영상 1개 보기
		return null;		
	}

	public Video updateVideo() { // 동영상 수정
		return null;		
	}

	public boolean deleteVideo() {
		return false;
		
	}
	
}
