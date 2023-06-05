package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<Music>();
	
	public boolean addList(Music music) {
		return list.add(music);
	}
	
	public boolean addAtZero(Music music) {
		try {
			list.add(0, music);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	public ArrayList<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().contains(title)) {
				return music;
			}
		}
		return null;
	}
	
	public  Music remobeMusic(String title) {
		
// 1번째 방법 (boolean / 객체로 조회하는 방법)
//		for(Music music : list) {
//			if(music.getTitle().equals(title)) {
//				list.remove(music);
//				return music;
//			}
//		}
		
// 2번째 방법 (index / 인덱스로 조회하는 방법)
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return list.set(list.indexOf(m), music);
			}
		}
		
		return null;
	}
	
	public ArrayList<Music> ascTitle() {
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		// 오름차순
		Collections.sort(list, new TitleAscending());
		return list;
	}
	
	public ArrayList<Music> descArist() {
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		// 내림차순
		Collections.sort(list, new ArtistAscending().reversed());
		return list;
	}
	
}
