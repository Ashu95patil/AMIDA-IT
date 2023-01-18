package com.AMIDAIt.JobPortel_MiniProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AMIDAIt.JobPortel_MiniProject.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
