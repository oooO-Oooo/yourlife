package com.simple.yourlife;

import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    public void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    public void navigateTo(Class cls){
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }
}
