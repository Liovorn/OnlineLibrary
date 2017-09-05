package com.hotmail.solntsev_igor.Model;

/**
 * Created by solncevigor on 8/12/17.
 */

public class UserModel {
    private String login;
    private String password;

    public UserModel(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserModel() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
