package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.User;
import com.example.demo.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "showReg")
	public String showRegistrationPage() {
		return "registerUser";
	}
 
	@RequestMapping(value = "registerUser")
	public String register(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "login";
	}

	@RequestMapping(value = "showLogin")
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap modelMap) {
		User user = userRepository.findByEmail(email);
		if (user.getPassword().equals(password)) {
			return "findFlights";
		} else {
			modelMap.addAttribute("msg", "Invalid user id or password");
		}
		return "login";
	}

}
