package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This annotation makes a class as a rest controller or a spring controller.
@RequestMapping("/user")
public class UserController {
	
	List<User> users = new ArrayList<>();
	
	@PostMapping
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		users.add(user);
		System.out.println("User Saved.");
	}
	
	@GetMapping
	List<User> getUsers() {
		return users;
	}
}
