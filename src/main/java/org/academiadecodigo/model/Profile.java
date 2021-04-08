package model;

import java.util.List;
import java.util.Set;

public class Profile {

    private String freakAname;
    private String password;
    private String location;
    private String name;
    private int age;
    private Set<String> kinks;
    private Set<String> turnOffs;
    private String picture;
    private List<Profile> likes;
    private List<Profile> matches;

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
}
