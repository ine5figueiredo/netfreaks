package org.academiadecodigo.controller;

import org.academiadecodigo.command.SignInDto;
import org.academiadecodigo.command.UserDto;
import org.academiadecodigo.model.User;
import org.academiadecodigo.service.LoginService;
import org.academiadecodigo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private LoginService loginService;
    private UserService userService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/", "/home"})
    public ResponseEntity homePage() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/home/login"})
    public ResponseEntity doLogIn(@RequestBody SignInDto signInDto) {

        boolean authenticate = loginService.authenticate(signInDto.getUsername(), signInDto.getPassword());

        if (authenticate) {
            return new ResponseEntity(HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }


}
