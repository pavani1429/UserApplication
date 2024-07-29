package com.demo.user.service;

import com.demo.user.entity.User;
import com.demo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> updateUser(String email, User userDetails) {
        User existingUser = userRepository.findByEmail(email);
        if (existingUser != null) {
            existingUser.setName(userDetails.getName());
            existingUser.setMobile(userDetails.getMobile());
            userRepository.save(existingUser);
            return Optional.of(existingUser);
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteUser(String email) {
    	boolean flag = false ;
        User existingUser = userRepository.findByEmail(email);
        if (existingUser != null) {
            System.out.println("Deleting user with email: " + email);
            userRepository.delete(existingUser);
            flag = true ;
        } else {
            System.out.println("User not found with email: " + email);
            throw new RuntimeException("User not found with email: " + email);
        }
        return flag;
		
    }
}
