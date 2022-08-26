package com.fspa.login.controller;

import com.fspa.login.request.LoginRegRequestDTO;
import com.fspa.login.service.ILoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value= "/api/v1/auth")
public class LoginController {

    private final Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    private OtpService otpService;

    @Autowired
    private AuthenticationManager authenticationManager;

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
