package com.zhuimeng.servicebestpractice;

/**
 * Created by zhuimeng on 2017/9/19.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
