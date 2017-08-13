package com.example.hasee.ping.Utils;

import com.squareup.okhttp.internal.DiskLruCache;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by hasee on 2017/8/13.
 */

public class BitmapUtils {

    private static final long DISK_CACHE_SIZE = 1024 * 1024 * 50;


    private void saveToDiskLruCache(String url){
        String key = hashKeyFormUrl(url);
        DiskLruCache.Editor editor = 
    }

    private String hashKeyFormUrl(String url){
        String cacheKey;
        try {
            final MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(url.getBytes());
            cacheKey = bytesToHexString(mDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            cacheKey = String.valueOf(url.hashCode());
        }
        return cacheKey;
    }

    private String bytesToHexString(byte[] bytes){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < bytes.length; i++){
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1){
                builder.append('0');
            }
            builder.append(hex);
        }
        return builder.toString();
    }


}
