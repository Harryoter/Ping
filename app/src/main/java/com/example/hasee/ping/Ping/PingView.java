package com.example.hasee.ping.Ping;

import java.util.List;

/**
 * Created by hasee on 2017/7/31.
 */

public interface PingView {

    void showLoading();

    void hideLoading();

    void showNetError();

    void showMessages(List<Object> messages);

    void showNewMessage(Object object);

}
