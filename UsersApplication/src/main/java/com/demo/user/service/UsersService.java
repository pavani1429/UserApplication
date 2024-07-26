package com.demo.user.service;

import java.util.List;
import java.util.Optional;

import com.demo.user.entity.Users;

public interface UsersService {
	List<Users> getAllUsers();

    Optional<Users> getUserById(Long id);

    Users createUser(Users user);

    Users updateUser(Long id, Users userDetails);

   
}
