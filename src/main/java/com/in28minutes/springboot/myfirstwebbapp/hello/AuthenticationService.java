package com.in28minutes.springboot.myfirstwebbapp.hello;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("in28minutes");
        boolean isValidUserPassword = password.equalsIgnoreCase("dummy");
        return isValidUserName && isValidUserPassword;
    }
}
