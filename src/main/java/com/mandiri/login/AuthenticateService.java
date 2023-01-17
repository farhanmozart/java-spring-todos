package com.mandiri.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {

    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("farhanmozart");
        boolean isValidPassword = password.equalsIgnoreCase("Mandiri");
        return isValidUsername && isValidPassword;
    }
}
