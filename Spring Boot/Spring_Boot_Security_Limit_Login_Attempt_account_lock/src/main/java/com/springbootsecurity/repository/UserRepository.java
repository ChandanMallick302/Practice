package com.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springbootsecurity.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
	
	public User findByVerificationCode(String verificationCode);
	
	@Query("update User u set u.failedAttempt=?1 where u.email=?2")
	@Modifying
	public void updatefailedAttempt(int attempt,String email);
}
