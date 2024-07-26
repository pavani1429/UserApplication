package com.demo.user.service;

import com.demo.user.entity.Users;
import com.demo.user.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService  {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> getUserById(Long id) {
        return usersRepository.findById(id);
    }

    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

    public Users updateUser(Long id, Users userDetails) {
        Users user = usersRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return usersRepository.save(user);
    }

    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }
}

