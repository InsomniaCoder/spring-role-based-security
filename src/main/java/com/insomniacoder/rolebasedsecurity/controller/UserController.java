package com.insomniacoder.rolebasedsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String anonymous(Principal principal){
        return "Anonymous "+principal.getName();
    }

    @GetMapping("/user")
    public String getUser(Principal principal){
        return "User "+principal.getName();
    }

    @GetMapping("/admin")
    public String getAdmin(Principal principal){
        return "Admin "+principal.getName();
    }
}
