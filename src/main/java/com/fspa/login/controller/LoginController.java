package com.fspa.login.controller;

import com.fspa.login.request.LoginRegRequestDTO;
import com.fspa.login.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value= "/api/v1/auth")
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @PostMapping(value = '/login')
    public ResponseEntity<> login(@RequestBody LoginRegRequestDTO request){
        try{

        }
        catch(AuthenticationException exception){
             return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

}
