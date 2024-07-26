package com.demo.user.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.user.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
