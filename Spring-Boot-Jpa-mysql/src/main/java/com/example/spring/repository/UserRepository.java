package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spring.bean.User;
public interface UserRepository extends CrudRepository<User, Long>
{
	

}
