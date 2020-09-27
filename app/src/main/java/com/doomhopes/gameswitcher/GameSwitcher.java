package com.doomhopes.gameswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameSwitcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_switcher);
    }

    public void onClickTicTacToe(View view) {
        Intent intent = new Intent(GameSwitcher.this, TicTacToeActivity.class);
        startActivity(intent);
    }

    public void onClickTag(View view) {
        Intent intent = new Intent(GameSwitcher.this, TagActivity.class);
        startActivity(intent);
    }
}