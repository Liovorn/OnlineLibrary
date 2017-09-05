package com.hotmail.solntsev_igor.Service;

import com.hotmail.solntsev_igor.Model.UserModel;

/**
 * Created by solncevigor on 8/12/17.
 */
public interface UserService {
    UserModel getUser(String login);
}
