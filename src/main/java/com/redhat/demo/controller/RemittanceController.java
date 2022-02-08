package com.redhat.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.demo.entity.User;
import com.redhat.demo.usecase.UserService;

@RestController
@RequestMapping("/remittance")
public class RemittanceController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "inward", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }


}
