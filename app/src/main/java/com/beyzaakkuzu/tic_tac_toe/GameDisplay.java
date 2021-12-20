package com.beyzaakkuzu.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_display);
    }
    public void HomeButtonClick(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void PlayAgainButtonClick(View view){

    }

}