package com.rockers.StudentDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String addDB(User user){
        userRepo.save(user);
        return "User Added Successfully!";
    }
    public User getDB(int id){
        User user = userRepo.findById(id).get();
        return user;
    }
}
