package com.example.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserRest {
	
	@Autowired  
	UserService userService;
	
	@GetMapping("/get")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/create")
	public String create(@RequestBody User user) {
		try {
			userService.createUser(user);
			return "Transaccion Correcta";
		} catch (Exception e) {
			return e.getMessage();
		}
			
			
		
	}
	
	@PutMapping("/edit")
	public String edit(@RequestBody List<User> users) {
		try {
			for (User user : users) {
				userService.editUser(user);
			}
			return "Transaccion Correcta";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
