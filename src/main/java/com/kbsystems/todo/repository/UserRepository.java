package com.kbsystems.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbsystems.todo.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
