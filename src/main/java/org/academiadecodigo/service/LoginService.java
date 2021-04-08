package org.academiadecodigo.service;

import org.academiadecodigo.model.User;

import java.util.List;

public interface LoginService {

    boolean authenticate(String freakAname, String password);

    User getCurrentUser();

    List<User> getUserList();

    void logout();

}
