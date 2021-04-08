package org.academiadecodigo.service;


import org.academiadecodigo.model.User;

public class MatchServiceImpl implements MatchService {

    private LoginService loginService;

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void createMatch(User receivedLike) {
        loginService.getCurrentUser().addLike(receivedLike);
        if (receivedLike.getLikes().contains(loginService.getCurrentUser())) {
            createMutualMatch(receivedLike);
        }

    }

    @Override
    public void createMutualMatch(User user2) {
        loginService.getCurrentUser().addMatch(user2);
        user2.addMatch(loginService.getCurrentUser());
    }
}
