package com.doomhopes.gameswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag);


    }

    private TextView getCellByCoord(int i, int j)
    {
        return findViewById(getResources().getIdentifier("c"+i+j,"id",getPackageName()));
    }
}