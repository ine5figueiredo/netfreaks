package org.academiadecodigo.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class User {

    private String username;
    private String password;
    private String name;
    private int age;
    private String location;
    private String picture;
    private String aboutMe;
    private double rating;
    private Set<String> kinks = new HashSet<>();
    private Set<String> turnOffs = new HashSet<>();
    private List<User> likes = new LinkedList<>();
    private List<User> matches = new LinkedList<>();

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Set<String> getKinks() {
        return kinks;
    }

    public Set<String> getTurnOffs() {
        return turnOffs;
    }

    public String getPicture() {
        return picture;
    }

    public List getMatches() {
        return matches;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void addLike(User user) {
        likes.add(user);
    }

    public void addMatch(User user) {
        matches.add(user);
    }

    public void addKink(String kink) {
        kinks.add(kink);
    }

    public void addTurnoff(String turnoff) {
        turnOffs.add(turnoff);
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

}
