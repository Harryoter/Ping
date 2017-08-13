package com.example.hasee.ping.Utils;

import android.os.AsyncTask;

/**
 * Created by hasee on 2017/8/12.
 */

public class DownloadAsync<P, S , T> extends AsyncTask<P, S , T> {

    private int mDataType;
    private Exception ex;
    private OnDownloadListener mOnDownloadListener;

    public OnDownloadListener getmOnDownloadListener() {
        return mOnDownloadListener;
    }

    public void setmOnDownloadListener(OnDownloadListener mOnDownloadListener) {
        this.mOnDownloadListener = mOnDownloadListener;
    }

    public DownloadAsync(int DataType){
        super();
        this.mDataType = DataType;
        mOnDownloadListener = new OnDownloadListener() {
            @Override
            public void onStart() {

            }

            @Override
            public Object doInWorkerThread(int DataType, Object[] params) throws Exception {
                return null;
            }

            @Override
            public void onShowProgress(Object[] objects) {

            }

            @Override
            public void onLoadFailed() {

            }

            @Override
            public void onLoadSuccess() {

            }

            @Override
            public void onLoadFinish() {

            }
        };
    }

    @Override
    protected T doInBackground(P... ps) {
        try {
            return (T) mOnDownloadListener.doInWorkerThread(mDataType,ps);
        } catch (Exception e) {
            e.printStackTrace();
            ex = e;
            return null;
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mOnDownloadListener.onStart();
    }

    @Override
    protected void onProgressUpdate(S... values) {
        super.onProgressUpdate(values);
        mOnDownloadListener.onShowProgress(values);
    }

    @Override
    protected void onPostExecute(T t) {
        super.onPostExecute(t);
        if (ex != null){
            mOnDownloadListener.onLoadFailed();
        }else {
            mOnDownloadListener.onLoadSuccess();
        }
        mOnDownloadListener.onLoadFinish();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        mOnDownloadListener.onLoadFinish();
    }


    public interface OnDownloadListener<P, S, T>{

        void onStart();

        T doInWorkerThread(int DataType, P... params) throws Exception;

        void onShowProgress(S... ses);

        void onLoadFailed();

        void onLoadSuccess();

        void onLoadFinish();

    }
}
