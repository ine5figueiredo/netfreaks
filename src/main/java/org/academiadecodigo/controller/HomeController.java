package org.academiadecodigo.controller;

import org.academiadecodigo.command.SignInDto;
import org.academiadecodigo.command.UserDto;
import org.academiadecodigo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    private LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public ResponseEntity homePage() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/login"})
    public ResponseEntity doLogIn(@RequestBody SignInDto signInDto) {

        boolean authenticate = loginService.authenticate(signInDto.getUsername(), signInDto.getPassword());

        if (authenticate != true) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(HttpStatus.OK);
    }


}
