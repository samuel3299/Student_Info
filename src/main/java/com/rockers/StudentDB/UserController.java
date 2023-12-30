package com.rockers.StudentDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/add")
    public String addDB(@RequestBody User user){
        return service.addDB(user);
    }
    @GetMapping("/get")
    public User getDB(@RequestParam int id){
        return service.getDB(id);
    }
}
