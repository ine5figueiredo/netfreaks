package org.academiadecodigo.command;

import model.Profile;

import java.util.List;
import java.util.Set;

public class UserDTO {

    private String freakAname;
    private String password;
    private String location;
    private String name;
    private int age;
    private Set<String> kinks;
    private Set<String> turnOffs;
    private String picture;
    private List<model.Profile> likes;
    private List<model.Profile> matches;

    public String getFreakAname() {
        return freakAname;
    }

    public void setFreakAname(String freakAname) {
        this.freakAname = freakAname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getKinks() {
        return kinks;
    }

    public void setKinks(Set<String> kinks) {
        this.kinks = kinks;
    }

    public Set<String> getTurnOffs() {
        return turnOffs;
    }

    public void setTurnOffs(Set<String> turnOffs) {
        this.turnOffs = turnOffs;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<Profile> getLikes() {
        return likes;
    }

    public void setLikes(List<Profile> likes) {
        this.likes = likes;
    }

    public List<Profile> getMatches() {
        return matches;
    }

    public void setMatches(List<Profile> matches) {
        this.matches = matches;
    }
}
