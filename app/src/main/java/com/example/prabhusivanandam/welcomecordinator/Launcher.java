package com.example.prabhusivanandam.welcomecordinator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Prabhu Sivanandam on 04-May-17.
 */

public class Launcher extends AppCompatActivity {
    ViewPager pagger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher_home);
        pagger=(ViewPager)findViewById(R.id.viewpager);
        Adapter adapter=new Adapter(this);
        pagger.setAdapter(adapter);
    }
}
