package org.academiadecodigo.converters;

import org.academiadecodigo.command.UserDto;
import org.academiadecodigo.model.User;
import org.academiadecodigo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDTO extends AbstractConverter<User, UserDto> {

    private UserService userService;

    @Autowired
    public void setFreakService(UserService userService) {
        this.userService = userService;
    }

    public UserDto convert(User user) {

        UserDto userDto = new UserDto();

        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        userDto.setName(user.getName());
        userDto.setAge(user.getAge());
        userDto.setLocation(user.getLocation());
        userDto.setPicture(user.getPicture());
        userDto.setAboutMe(user.getAboutMe());
        userDto.setRating(user.getRating());

        return userDto;
    }
}
