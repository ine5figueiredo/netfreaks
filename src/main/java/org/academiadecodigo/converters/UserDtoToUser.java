package org.academiadecodigo.converters;

import org.academiadecodigo.command.UserDto;
import org.academiadecodigo.model.User;
import org.academiadecodigo.service.LoginService;
import org.academiadecodigo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class UserDtoToUser implements Converter<UserDto, User> {

    private UserService userService;
    private LoginService loginService;

    @Autowired
    public void setFreakService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public User convert(UserDto userDTO) {

        User user = (userDTO.getUsername()) != null ? loginService.getCurrentUser() : new User();

        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        user.setLocation(userDTO.getLocation());
        user.setPicture(userDTO.getPicture());
        user.setAboutMe(userDTO.getAboutMe());
        user.setRating(userDTO.getRating());

        return user;
    }
}
