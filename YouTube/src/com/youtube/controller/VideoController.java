package com.youtube.controller;

import com.youtube.model.User;
import com.youtube.model.Video;

public class VideoController implements UserControllerImpl {

	@Override
	public boolean login() {
		return false;
	}

	@Override
	public boolean signUp() {
		return false;
	}

	@Override
	public User viewProfile() {
		return null;
	}

	@Override
	public User updateProfile() {
		return null;
	}

	@Override
	public boolean deleteProfile() {
		return false;
	}

}
