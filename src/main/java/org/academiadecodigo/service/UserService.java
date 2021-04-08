package org.academiadecodigo.service;

import org.academiadecodigo.model.User;

public interface UserService {

    User add(User user);
    User update(User user);
    void delete(User user);
    User getUser(String username);
}
