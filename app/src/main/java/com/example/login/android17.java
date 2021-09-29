package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class android17<pubic> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android17);
    }

     public void toDaftar(View view){
        Intent myintent = new Intent(this,loginn.class);
        startActivity(myintent);
    }
}