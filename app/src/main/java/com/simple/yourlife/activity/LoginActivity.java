package com.simple.yourlife.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

import com.simple.yourlife.BaseActivity;
import com.simple.yourlife.R;

public class LoginActivity extends BaseActivity {

    EditText etUser,etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUser = findViewById(R.id.et_user);
        etPass = findViewById(R.id.et_pass);
        if (TextUtils.isEmpty(etUser.getText().toString())){
            showToast("请输入用户名");
            return;
        }
        if (TextUtils.isEmpty(etPass.getText().toString())){
            showToast("请输入密码");
            return;
        }

    }
}
