package org.academiadecodigo.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Profile {

    private String freakAname;
    private String password;
    private String location;
    private String name;
    private int age;
    private Set<String> kinks = new HashSet<>();
    private Set<String> turnOffs = new HashSet<>();
    private String picture;
    private String aboutMe;
    private List<Profile> likes = new LinkedList<>();
    private List<Profile> matches = new LinkedList<>();
    private double freakaRating;

    public double getFreakaRating() {
        return freakaRating;
    }

    public void setFreakaRating(double freakaRating) {
        this.freakaRating = freakaRating;
    }

    public String getFreakAname() {
        return freakAname;
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

    public List<Profile> getLikes() {
        return likes;
    }

    public void setFreakAname(String freakAname) {
        this.freakAname = freakAname;
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

    public void addLike(Profile profile) {
        likes.add(profile);
    }

    public void addMatch(Profile profile) {
        matches.add(profile);
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
