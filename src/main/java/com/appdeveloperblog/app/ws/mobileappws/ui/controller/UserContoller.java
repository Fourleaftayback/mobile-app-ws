package com.appdeveloperblog.app.ws.mobileappws.ui.controller;

import com.appdeveloperblog.app.ws.mobileappws.ui.model.request.UserDetailRequestModel;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("users")
public class UserContoller {
    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public String createUser(@RequestBody UserDetailRequestModel userDetails) {

        return "create user was called";
    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}


