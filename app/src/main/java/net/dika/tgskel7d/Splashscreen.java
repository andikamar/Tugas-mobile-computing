package net.dika.tgskel7d;

//Created by andika.mar

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
        Intent intent = new Intent(Splashscreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}, 4000);
    }
}