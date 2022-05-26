package com.furkansahan.springlogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

    @Controller
    public class loginController {

        @GetMapping("/login")
        public String login() {


            return "login";
        }
    }
}