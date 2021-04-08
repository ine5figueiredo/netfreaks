package org.academiadecodigo.service;

import org.academiadecodigo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(User user) {
        loginService.getUserList().remove(user);

    }

    @Override
    public User getUser(String username) {

        User theUser = loginService.getUserList().stream().filter(user -> username.equals(user.getUsername()))
                .findAny().orElse(null);

        return theUser;
    }
}
