package org.academiadecodigo.model;

import java.util.LinkedList;
import java.util.List;

public class ProfilesBootstrap {

    private static List<Profile> profilesList;

    public List<Profile> getProfilesList() {
        return profilesList;
    }

    public ProfilesBootstrap() {
        profilesList = new LinkedList<>();

        Profile p1 = new Profile();
        p1.setFreakAname("luigi");
        p1.setName("Luigi Mario");
        p1.setAge(31);
        p1.setPassword("iamluigi");
        p1.setPicture("");
        p1.setLocation("Italy");
        p1.addKink("mustache");
        p1.addKink("extortion");
        p1.setAboutMe("I am the unfortunate underdog looking for my soulmate Bowser. \n" +
                "Ready to jump over any freaky obstacles together!");
        p1.addTurnoff("Comic Sans");
        p1.addTurnoff("overachievers");
        p1.setFreakaRating(3.4);

        Profile p2 = new Profile();
        p2.setFreakAname("freakazoid");
        p2.setName("Freako Peaky");
        p2.setAge(16);
        p2.setAboutMe("I am a crazy person and right now you witness my best personality!\n" +
                "The upside is: you never get bored of me. The downside: I will probably ruin your life.\n" +
                "If you want some fun in your boring stagnated uninteresting life, call me ASAP!!!!!!");
        p2.addKink("hot blondes");
        p2.addKink("CODING");
        p2.addKink("electrocuting fish");
        p2.addTurnoff("whiners");
        p2.addTurnoff("normality");
        p2.setFreakaRating(5);

        profilesList.add(p1);
        profilesList.add(p2);
    }
}
