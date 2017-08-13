package com.example.hasee.ping.Login;

/**
 * Created by hasee on 2017/7/31.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestory();
}

