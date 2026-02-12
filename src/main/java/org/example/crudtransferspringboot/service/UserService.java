package org.example.crudtransferspringboot.service;

import org.example.crudtransferspringboot.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void removeUserById(Long id);
}