package org.academiadecodigo;

import org.academiadecodigo.model.ProfilesBootstrap;

public class Main {

    public static void main(String[] args) {
        ProfilesBootstrap profilesBootstrap = new ProfilesBootstrap();
        profilesBootstrap.getProfilesList().stream().forEach(i -> System.out.println(i.getUsername()));


    }
}
