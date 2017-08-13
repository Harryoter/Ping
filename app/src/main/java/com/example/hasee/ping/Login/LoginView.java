package com.example.hasee.ping.Login;

/**
 * Created by hasee on 2017/7/31.
 */

public interface LoginView {

    void setUsernameError();

    void setPasswordError();

    void showProgress();

    void hideProgress();

    void navigateToHome();
}
