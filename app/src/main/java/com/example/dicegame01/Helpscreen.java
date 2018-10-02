package com.example.dicegame01;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class Helpscreen extends Activity{

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.helpscreen);

        DisplayMetrics helpt = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(helpt);

        int width = helpt.widthPixels;
        int height = helpt.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));
    }
}
