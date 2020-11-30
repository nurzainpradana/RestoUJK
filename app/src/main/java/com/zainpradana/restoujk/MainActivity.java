package com.zainpradana.restoujk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kePaketA(View view) {
        Intent i = new Intent(MainActivity.this, PaketA.class);
        startActivity(i);
    }

    public void kePaketB(View view) {
        Intent i = new Intent(MainActivity.this, PaketB.class);
        startActivity(i);
    }

    public void kePaketC(View view) {
        Intent i = new Intent(MainActivity.this, PaketC.class);
        startActivity(i);
    }

    public void kePaketD(View view) {
        Intent i = new Intent(MainActivity.this, PaketD.class);
        startActivity(i);
    }

    public void kePaketE(View view) {
        Intent i = new Intent(MainActivity.this, PaketE.class);
        startActivity(i);
    }

    public void kePaketF(View view) {
        Intent i = new Intent(MainActivity.this, PaketF.class);
        startActivity(i);
    }
}