package com.automobile.user.userController;

import com.automobile.user.model.UserModel;
import com.automobile.user.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping (path = "/user", method = RequestMethod.POST)
    public String user(){

        UserModel user = new UserModel();
        user.setUserID(1);
        user.setFirstName("asda");
        user.setLastName("sdasda");
        user.setPhoneNumber(231241241);
        userDao.saveUser(user);

        return "success";
    }
}
