package org.academiadecodigo.command;

import java.util.Set;

public class FreakDTO {

    private String name;
    private Integer age;
    private String location;
    private Set<String> kinks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<String> getKinks() {
        return kinks;
    }

    public void setKinks(Set<String> kinks) {
        this.kinks = kinks;
    }
}
