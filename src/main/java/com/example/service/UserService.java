package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controllerDAO.UserControllerDao;
import com.example.model.User;

@Service
public class UserService {
	@Autowired
	UserControllerDao userControllerDao;
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		userControllerDao.findAll().forEach(user->users.add(user));
		return users;
	}
	
	public boolean createUser(User user){
		boolean response = false;
		try {
			userControllerDao.save(user);
			response = true;
			return response;
		} catch (Exception e) {
			return response;
		}
	}
	
	public boolean editUser(User user){
		boolean response = false;
		try {
			User newUser = userControllerDao.findById(user.getId()).get();
			newUser.setProcesado(true);
			userControllerDao.save(newUser);
			response = true;
			return response;
		} catch (Exception e) {
			return response;
		}
	}
}
