package by.abelski.boxagent.service;

import by.abelski.boxagent.entities.User;
import by.abelski.boxagent.service.errors.UserNotFound;

import java.util.List;

public interface UserService {
    void save(User user);

    User findByUsername(String username) throws UserNotFound;

    User findById(String userId) throws UserNotFound;

    List<User> findAll();

    User getCurrentUser();
}
