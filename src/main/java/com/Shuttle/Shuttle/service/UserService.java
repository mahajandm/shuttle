package com.Shuttle.Shuttle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shuttle.Shuttle.entity.UserEntity;
import com.Shuttle.Shuttle.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public void signupServiceMethod(UserEntity user) {
		userRepo.save(user);
	}

	public String loginServiceMethod(UserEntity user) {
		// TODO Auto-generated method stub
		String result = null;
		if (user.getEmail() != null) {
			user = userRepo.findByEmailAndPassword(user.getEmail(),user.getPassword());
			if (user != null)
				result = user.toString();
		} else {
			user = userRepo.findByMobileAndPassword(user.getMobile(),user.getPassword());
			if (user != null)
				result = user.toString();
		}
		return result;
	}
}
