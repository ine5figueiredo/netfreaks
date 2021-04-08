package service;

import model.Profile;

public interface MatchService {

    void createMatch(Profile gaveLike, Profile receivedLike);

    void createMutualMatch(Profile profile1, Profile profile2);
}
