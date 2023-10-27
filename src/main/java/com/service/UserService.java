package com.service;

import com.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findOne(long id);

    void save(User user);

    void update(long id, User updeteUser);

    void delete(long id);
}
