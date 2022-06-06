package com.wesleysouza.course.repositories;

import com.wesleysouza.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {



}
