package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This annotation makes a class as a rest controller or a spring controller.
@RequestMapping("/user")
public class UserController {
	
	//Controller is the dependent and service is the dependency.
	//Customer is dependent and shop is the dependency. 
	@Autowired //Tells spring that when this code will run, create an object of user service and assign it to the object service.
	UserService service; // Dependency injection.
	
	
	@PostMapping
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		service.save(user);
	}
	
	@GetMapping
	List<User> getUsers() {
		return service.getAllUsers();
	}
	
	@GetMapping("/name/{name}")
	List<User> getUserFromName(@PathVariable String name) {
		return service.getUserByName(name);
	}
	
	@GetMapping("age/{age}")
	List<User> getUserFromAge(@PathVariable int age) {
		return service.getUserByAge(age);
	}
}
