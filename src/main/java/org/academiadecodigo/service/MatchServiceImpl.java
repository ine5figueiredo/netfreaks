package org.academiadecodigo.service;


import org.academiadecodigo.model.Profile;

public class MatchServiceImpl implements MatchService {

    private LoginService loginService;

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void createMatch(Profile receivedLike) {
        loginService.getCurrentUser().addLike(receivedLike);
        if (receivedLike.getLikes().contains(loginService.getCurrentUser())) {
            createMutualMatch(receivedLike);
        }

    }

    @Override
    public void createMutualMatch(Profile profile2) {
        loginService.getCurrentUser().addMatch(profile2);
        profile2.addMatch(loginService.getCurrentUser());
    }
}
