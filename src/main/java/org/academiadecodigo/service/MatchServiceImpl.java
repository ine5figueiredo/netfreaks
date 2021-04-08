package org.academiadecodigo.service;


import org.academiadecodigo.model.Profile;

public class MatchServiceImpl implements MatchService {


    @Override
    public void createMatch(Profile gaveLike, Profile receivedLike) {
        gaveLike.addLike(receivedLike);

    }

    @Override
    public void createMutualMatch(Profile profile1, Profile profile2) {
        profile1.addMatch(profile2);
        profile2.addMatch(profile1);
    }
}
