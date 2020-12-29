package com.practice.spring.security.service;


import com.practice.spring.security.model.User;

import java.util.Optional;

public interface UserCrudService {

  User save(User user);

  Optional<User> find(String id);

  Optional<User> findByUsername(String username);
}
