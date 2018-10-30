package com.kebiiii.mvp.Model;

import android.text.TextUtils;

import com.kebiiii.mvp.Presenter.Presenter;
import com.kebiiii.mvp.View.LoginView;

public class PresentImplement implements Presenter {

    private LoginView loginView;
    private LoginView loginVieswss;

    private LoginView dfdfh;



    public PresentImplement (LoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void performLog(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            loginView.loginValidations();
        }else {
            if (username.equals("hossam") && password.equals("hossam")){
                loginView.loginSuccess();
            }else {
                loginView.loginError();
            }
        }
    }
}
