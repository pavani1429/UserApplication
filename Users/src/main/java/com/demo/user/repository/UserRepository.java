package com.demo.user.repository;
import com.demo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    void deleteByEmail(String email);
}
