package org.academiadecodigo.model;

import java.util.LinkedList;
import java.util.List;


public class ProfilesBootstrap {

    private static List<User> profilesList;

    public List<User> getProfilesList() {
        return profilesList;
    }

    public ProfilesBootstrap() {
        profilesList = new LinkedList<>();

        User p1 = new User();
        p1.setUsername("tibu_voodoo");
        p1.setName("Tiburcio");
        p1.setAge(35);
        p1.setPassword("amen-1");
        p1.setPicture("");
        p1.setLocation("");
        p1.setAboutMe("I am the unfortunate underdog looking for my freaky soulmate. \n" +
                "Ready to jump over any freaky obstacles together!");
        p1.addKink("Counting fireflies in the moonlight");
        p1.addKink("Fetish with cuddly toys");
        p1.addKink("Hunting Gambuzinos");
        p1.addTurnoff("Overpositive people");
        p1.addTurnoff("Hot Woman");
        p1.setRating(3.4);

        User p2 = new User();
        p2.setUsername("raDoTino69");
        p2.setName("Tino de Rã");
        p2.setAge(28);
        p2.setPassword("amen-2");
        p2.setPicture("");
        p2.setLocation("");
        p2.setAboutMe("I am a crazy person and right now you witness my best personality!\n" +
                "The upside is: you never get bored of me. The downside: I will probably ruin your life.\n" +
                "If you want some fun in your boring stagnated uninteresting life, call me ASAP!!!!!!");
        p2.addKink("Rodeo with wild boars");
        p2.addKink("Eating meat in front of vegans");
        p2.addKink("Cover speed cameras");
        p2.addTurnoff("Frogs");
        p2.addTurnoff("Candles");
        p2.setRating(5);

        User p3 = new User();
        p3.setUsername("corneliana95");
        p3.setName("Cornelia");
        p3.setAge(52);
        p3.setPassword("amen-3");
        p3.setPicture("");
        p3.setLocation("");
        p3.setAboutMe("Hey there Freakies. I'm looking for my freaky<partner> of crime to do a lot exciting and irresponsivel shit. MUAHAHAHAH. " +
                "If you are not freaky enough don´t bother because I am the freakiest of them all!!! ");
        p3.addKink("Stalk random people");
        p3.addKink("Crash Funerals");
        p3.addKink("Dance gangnam style naked on the back of truck");
        p3.addTurnoff("Crash Weddings");
        p3.addTurnoff("Play card games");
        p3.setRating(4.7);

        User p4 = new User();
        p4.setUsername("boniBranco");
        p4.setName("Bonifacio");
        p4.setAge(23);
        p4.setPassword("amen-4");
        p4.setPicture("");
        p4.setLocation("");
        p4.setAboutMe("Hello my name is Bonifacio but you can call me Boni. I'm looking for someone to go with me on a " +
                "downhill cheese-chase, because running after a yellow ball of fermented milk is great, but doing it with " +
                "another freak is awesome.");
        p4.addKink("Typical Russian dance");
        p4.addKink("Give books without the final pages");
        p4.addKink("Downhill Cheese-Chasing");
        p4.addTurnoff("Don't like cheese");
        p4.addTurnoff("Upside down slippers");
        p4.setRating(2.6);

        User p5 = new User();
        p5.setUsername("grey");
        p5.setName("Maria");
        p5.setAge(30);
        p5.setPassword("amen-5");
        p5.setPicture("");
        p5.setLocation("");
        p5.setAboutMe("I am highly spiritual but my friends call me crazy. If you want to call me a freak, message RIGHT NOW! I won't be on this astral plane forever!");
        p5.addKink("Changing sugar for salt");
        p5.addKink("Tantric sex with a tree");
        p5.addKink("Be polyglot in one sentence");
        p5.addTurnoff("Shaved legs");
        p5.addTurnoff("Cruella de Vile style");
        p5.setRating(4.1);

        User p6 = new User();
        p6.setUsername("pedrinho");
        p6.setName("Pedro");
        p6.setAge(24);
        p6.setPassword("amen-6");
        p6.setPicture("");
        p6.setLocation("");
        p6.setAboutMe("Brace yourself, for I am your shooting star from outer space! \"Wait, really from outer space?!\" \n" +
                "Yes, match with me and give me a bouquet of kittens to talk more about the underwear fashion on Mars " +
                "and the digusting industry of lightspeed travel. Waiting for you!");
        p6.addKink("CarCrash");
        p6.addKink("Humans");
        p6.addKink("Only bread with bread sandwiches");
        p6.addTurnoff("Lightspeed travel");
        p6.addTurnoff("Comercial lightspeed travel");
        p6.setRating(2.4);

        User p7 = new User();
        p7.setUsername("anninha");
        p7.setName("Anna");
        p7.setAge(70);
        p7.setPassword("amen-7");
        p7.setPicture("");
        p7.setLocation("");
        p7.setAboutMe("A lady completely not associated with any Russian intelligence " +
                "services is looking for a remote stalker that would be willing to earn extra cash iykwim.");
        p7.addKink("Back-End");
        p7.addKink("Dressing up like Mr. Putin");
        p7.addKink("Waxing hairy men");
        p7.addTurnoff("Heroku");
        p7.addTurnoff("Bad memes");
        p7.setRating(5);

        User p8 = new User();
        p8.setUsername("sarinha");
        p8.setName("Sara");
        p8.setAge(100);
        p8.setPassword("amen-8");
        p8.setPicture("");
        p8.setLocation("");
        p8.setAboutMe("I am vampire and really sleepy. If you are willing to donate blood, please come, I just can't make an effort anymore without caffeine.");
        p8.addKink("Stay stuck in traffic");
        p8.addKink("A plant for each year of life");
        p8.addKink("Use springs of the same color to extend clothes");
        p8.addTurnoff("Germs");
        p8.addTurnoff("Fake rock concert");
        p8.setRating(4);

        User p9 = new User();
        p9.setUsername("inezinha");
        p9.setName("Inês");
        p9.setAge(15);
        p9.setPassword("amen-9");
        p9.setPicture("");
        p9.setLocation("");
        p9.setAboutMe("Teenage girl with a dark secret. Could you ever imagine that this sweet face belongs to a notorious stalker? Have a stalky night, byee!");
        p9.addKink("King size lolipups");
        p9.addKink("Run a marathon by car");
        p9.addKink("Having wet socks");
        p9.addTurnoff("Cold");
        p9.addTurnoff("Birds singing");
        p9.setRating(3.7);


        profilesList.add(p1);
        profilesList.add(p2);
        profilesList.add(p3);
        profilesList.add(p4);
        profilesList.add(p5);
        profilesList.add(p6);
        profilesList.add(p7);
        profilesList.add(p8);
        profilesList.add(p9);
    }
}
