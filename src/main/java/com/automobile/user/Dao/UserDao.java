package com.automobile.user.Dao;

import com.automobile.user.model.UserModel;
import com.automobile.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    @Autowired
    UserRepository userRepository;

   /* public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/


   public String saveUser(UserModel userModel){
        userRepository.save(userModel);
        return "saved";
    }
}
