package org.academiadecodigo.service;

import org.academiadecodigo.model.Profile;

public interface LoginService {

    boolean authenticate(String freakAname, String password);

    Profile getCurrentUser();

}
