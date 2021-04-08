package org.academiadecodigo.service;

import org.academiadecodigo.model.Profile;
import org.academiadecodigo.model.ProfilesBootstrap;

import java.util.List;

public class LoginServiceImpl implements LoginService {

    private Profile currentFreak;
    private List<Profile> usersList;

    public LoginServiceImpl() {
        ProfilesBootstrap profilesBootstrap = new ProfilesBootstrap();
        usersList = profilesBootstrap.getProfilesList();
    }

    public void setUsersList(List<Profile> usersList) {
        this.usersList = usersList;
    }

    public Profile getCurrentFreak() {
        return currentFreak;
    }

    @Override
    public boolean authenticate(String freakAname, String password) {

        for (Profile user : usersList) {
            if (freakAname.equals(user.getFreakAname()) && password.equals(user.getPassword())) {
                currentFreak = user;
                return true;
            }
        }
        return false;

    }

    @Override
    public Profile getCurrentUser() {
        return currentFreak;
    }

    @Override
    public void logout() {
        currentFreak = null;
    }


}
