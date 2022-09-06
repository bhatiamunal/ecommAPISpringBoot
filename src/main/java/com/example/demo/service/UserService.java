package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	 @Autowired
	 private UserRepository repository;
	 public User saveUser(User user) {
	        return repository.save(user);
	    }

	    public List<User> saveUser(List<User> user) {
	        return repository.saveAll(user);
	    }

	    public List<User> getUser() {
	        return repository.findAll();
	    }

	    public User getUserById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public User getUserByName(String name) {
	        return repository.findByName(name);
	    }
	    
//	    public ResponseEntity<?> validateUser(User userData) {
//	    	User data = repository.findByUserId( userData.getId() ) ;
//	    	if(data.getPassword().equals(userData.getPassword())) {
//	    		return ResponseEntity.ok(data);
//	    	}
//	    	return (ResponseEntity<?>) ResponseEntity.internalServerError();
////	    	User user = repository.findByUserId( userData.getId() );
////	    	return user; 
////	        return repository.validateUserByemail(userData);
//	    }
	    public String deleteUser(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }

	    public User updateUser(User user) {
	        User existingUser = repository.findById(user.getId()).orElse(null);
	        existingUser.setName(user.getName());
	        existingUser.setAddress(user.getAddress());
	        existingUser.setEmail(user.getEmail());
	        existingUser.setpNumber(user.getpNumber());
	        existingUser.setPassword(user.getPassword());
	        return repository.save(existingUser);
	    }
}
