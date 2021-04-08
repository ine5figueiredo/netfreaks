package org.academiadecodigo.controller;

import org.academiadecodigo.command.UserDto;
import org.academiadecodigo.converters.UserDtoToUser;
import org.academiadecodigo.converters.UserToUserDTO;
import org.academiadecodigo.model.User;
import org.academiadecodigo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.academiadecodigo.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/home")
public class UserController {

    private LoginService loginService;
    private UserService userService;
    private UserToUserDTO userToUserDTO;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserToUserDTO(UserToUserDTO userToUserDTO) {
        this.userToUserDTO = userToUserDTO;
    }

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/feed/{username}"})
    public ResponseEntity<List<UserDto>> feed(@PathVariable String username) {

        if (!loginService.getCurrentUser().getUsername().equals(username)) {
            new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        List<UserDto> userDtoList = loginService.getUserList().stream().map(user -> userToUserDTO.convert(user))
                .collect(Collectors.toList());

        return new ResponseEntity(userDtoList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/{username}/", "/{username"})
    public ResponseEntity<UserDto> profilePage(@PathVariable String username) {

        if (!loginService.getCurrentUser().getUsername().equals(username)) {
            new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        UserDto userDto = userToUserDTO.convert(userService.getUser(username));

        return new ResponseEntity(userDto, HttpStatus.OK);
    }

}
