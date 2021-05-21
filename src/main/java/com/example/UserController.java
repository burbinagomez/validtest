package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@Controller
public class UserController {
		
	@GetMapping("/")
	public String newUser( Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@GetMapping("/tabla")
	public String tabla( Model model) {
		return "tabla";
	}

}