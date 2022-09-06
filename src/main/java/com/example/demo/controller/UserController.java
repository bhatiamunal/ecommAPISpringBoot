package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	 	@Autowired
	    private UserService service;

	    @CrossOrigin(origins="http://localhost:4200/")
	    @PostMapping("/addUser")
	    public List<User> addUser(@RequestBody List<User> user) {
	        return service.saveUser(user);
	    }

	    @CrossOrigin(origins="http://localhost:4200/")
	    @GetMapping("/user")
	    public List<User> findAllUser() {
	        return service.getUser();
	    }

	    @GetMapping("/userById/{id}")
	    public User findUserById(@PathVariable int id) {
	        return service.getUserById(id);
	    }

	    @GetMapping("/user/{name}")
	    public User findUserByName(@PathVariable String name) {
	        return service.getUserByName(name);
	    }

	    @PutMapping("/updateUser")
	    public User updateUser(@RequestBody User user) {
	        return service.updateUser(user);
	    }
	    @CrossOrigin(origins="http://localhost:4200/")
	    @DeleteMapping("/deleteUser/{id}")
	    public String deleteUser(@PathVariable int id) {
	        return service.deleteUser(id);
	    }
}
