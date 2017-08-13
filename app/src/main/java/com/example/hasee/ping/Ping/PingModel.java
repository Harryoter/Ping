package com.example.hasee.ping.Ping;

/**
 * Created by hasee on 2017/7/31.
 */

public interface PingModel {

    interface onErrorListener{
        void onNetError();

        void onSuccess();
    }

    void saveMessage(Object message);

    void deleteMessage();

    void sendMessageToPeople(Object message);

    void loadMessageFromCache();

    void refreshMessage();

}
