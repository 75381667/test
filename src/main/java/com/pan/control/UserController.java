package com.pan.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pan.model.User;
import com.pan.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/listUser")
	public String listUser(Model model) {
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "listUser";
	}

}
