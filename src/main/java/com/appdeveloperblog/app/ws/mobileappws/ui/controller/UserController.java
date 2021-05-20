package com.appdeveloperblog.app.ws.mobileappws.ui.controller;

import com.appdeveloperblog.app.ws.mobileappws.service.UserService;
import com.appdeveloperblog.app.ws.mobileappws.shared.dto.UserDto;
import com.appdeveloperblog.app.ws.mobileappws.ui.model.request.UserDetailRequestModel;
import com.appdeveloperblog.app.ws.mobileappws.ui.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService; // this was added
    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailRequestModel userDetails) {

        UserRest returnValue = new UserRest(); // creates the userRest object
        UserDto userDto = new UserDto(); // creates the userDto object

        BeanUtils.copyProperties(userDetails, userDto); // this copies the userDetails object to userDto
        UserDto createUser = userService.createUser(userDto); //this will create the user in the DB
        BeanUtils.copyProperties(createUser, returnValue); // then will copy the values to the return value so we can send to the client
        return returnValue;

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


