package org.academiadecodigo.service;


import org.academiadecodigo.model.User;

public interface MatchService {

    void createMatch(User receivedLike);

    void createMutualMatch(User user2);
}
