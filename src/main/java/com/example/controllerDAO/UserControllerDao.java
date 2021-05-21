package com.example.controllerDAO;

import org.springframework.data.repository.CrudRepository;

import com.example.model.User;  

public interface UserControllerDao extends CrudRepository<User, Integer> {

}
