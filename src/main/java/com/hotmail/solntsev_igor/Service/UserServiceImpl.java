package com.hotmail.solntsev_igor.Service;

import com.hotmail.solntsev_igor.Model.UserModel;

/**
 * Created by solncevigor on 8/12/17.
 */
public class UserServiceImpl implements UserService {

    public UserModel getUser(String login) {
        UserModel user = new UserModel();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }
}
