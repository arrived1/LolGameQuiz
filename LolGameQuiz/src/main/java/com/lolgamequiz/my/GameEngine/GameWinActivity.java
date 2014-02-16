package com.lolgamequiz.my.GameEngine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.lolgamequiz.my.R;


public class GameWinActivity extends Activity {
    private Animations animations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_win);

        GameSounds sounds = new GameSounds(this);
        sounds.gameWin();

        Bundle extras = getIntent().getExtras();
        int points = extras.getInt("SCORE");
        String timeTxt = extras.getString("TIME");

        animations = new Animations(this);

        ImageView gameOverImage = (ImageView)findViewById(R.id.logo);
        gameOverImage.setAnimation(animations.getAnimFadein());
        gameOverImage.setImageResource(R.drawable.logo);

        TextView score = (TextView)findViewById(R.id.scoreRes);
        score.setAnimation(animations.getRightLeft());
        score.setText(Integer.toString(points));

        TextView time = (TextView)findViewById(R.id.timeRes);
        time.setAnimation(animations.getRightLeft());
        time.setText(timeTxt);

        TextView gameWinTxt = (TextView)findViewById(R.id.gameWinTxt);
        gameWinTxt.setAnimation(animations.getAnimFadein());
    }
}
