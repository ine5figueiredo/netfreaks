package org.academiadecodigo.service;


import org.academiadecodigo.model.Profile;

public interface MatchService {

    void createMatch(Profile receivedLike);

    void createMutualMatch(Profile profile2);
}
