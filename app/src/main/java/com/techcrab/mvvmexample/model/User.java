package com.techcrab.mvvmexample.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by ganeshshetty on 11,October,2018
 * for MVVMExample
 */
public class User {
    @NonNull
    private String mEmail;

    @NonNull
    private String mPassword;

    public User(@NonNull String mEmail, @NonNull String mPassword) {
        this.mEmail = mEmail;
        this.mPassword = mPassword;
    }

    @NonNull
    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(@NonNull String mEmail) {
        this.mEmail = mEmail;
    }

    @NonNull
    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(@NonNull String mPassword) {
        this.mPassword = mPassword;
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getmEmail()) && Patterns.EMAIL_ADDRESS.matcher(getmEmail()).matches() && getmPassword().length() > 5;
    }
}
