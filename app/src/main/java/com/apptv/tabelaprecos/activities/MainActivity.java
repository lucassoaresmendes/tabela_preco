package com.apptv.tabelaprecos.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.apptv.tabelaprecos.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main, new HomeFragment())
                    .commitNow();
        }
    }
}
