package com.demo.user.service;

import com.demo.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> updateUser(String email, User userDetails);
    boolean deleteUser(String email);
}
