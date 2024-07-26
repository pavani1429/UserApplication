package com.demo.user.controller;
	import com.demo.user.entity.Users;
	import com.demo.user.service.UsersServiceImpl;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/users")
	public class UsersController {

	    @Autowired
	    private UsersServiceImpl userService;

	    @GetMapping
	    public List<Users> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    @GetMapping("/{id}")
	    public Users getUserById(@PathVariable Long id) {
	        return userService.getUserById(id).orElseThrow(() -> new RuntimeException("User not found"));
	    }

	    @PostMapping
	    public Users createUser(@RequestBody Users user) {
	        return userService.createUser(user);
	    }

	    @PutMapping("/{id}")
	    public Users updateUser(@PathVariable Long id, @RequestBody Users user) {
	        return userService.updateUser(id, user);
	    }

	    @DeleteMapping("/{id}")
	    public  ResponseEntity deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	         return ResponseEntity .ok("User Deleted");
	    }
	}


