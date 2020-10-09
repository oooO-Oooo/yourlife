package com.simple.yourlife;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.simple.yourlife.activity.LoginActivity;
import com.simple.yourlife.activity.RegisterActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    void initView() {
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                navigateTo(LoginActivity.class);
                break;
            case R.id.btn_register:
                navigateTo(RegisterActivity.class);
                break;
        }
    }
}
