package com.example.hasee.ping.Login;

/**
 * Created by hasee on 2017/7/31.
 */

public interface LoginModel {

    interface OnLoginFinishedListener{
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);

}
