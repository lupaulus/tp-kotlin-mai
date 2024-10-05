package com.mathinfo.androidtpnote;

import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    // Generate the main activity
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.toolbar));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
