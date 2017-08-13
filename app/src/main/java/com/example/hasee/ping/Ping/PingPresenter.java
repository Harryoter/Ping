package com.example.hasee.ping.Ping;

import java.util.List;

/**
 * Created by hasee on 2017/7/31.
 */

public interface PingPresenter {

    void addMessage(Object object);

    void initialMessages(List<Object> objects);

    void deleteMessage(int n);

    void sendMessage(Object object);
}
