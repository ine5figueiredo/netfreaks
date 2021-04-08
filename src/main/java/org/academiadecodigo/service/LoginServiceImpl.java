package org.academiadecodigo.service;

import org.academiadecodigo.model.User;
import org.academiadecodigo.model.ProfilesBootstrap;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImpl implements LoginService {

    private User currentFreak;
    private List<User> usersList;

    public LoginServiceImpl() {
        ProfilesBootstrap profilesBootstrap = new ProfilesBootstrap();
        usersList = profilesBootstrap.getProfilesList();
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public User getCurrentFreak() {
        return currentFreak;
    }

    @Override
    public boolean authenticate(String username, String password) {

        for (User user : usersList) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                currentFreak = user;
                return true;
            }
        }
        return false;
    }

    @Override
    public User getCurrentUser() {
        return currentFreak;
    }

    @Override
    public List<User> getUserList() {
        return usersList;
    }

    @Override
    public void logout() {
        currentFreak = null;
    }


}
