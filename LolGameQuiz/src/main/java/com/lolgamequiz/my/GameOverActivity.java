package com.lolgamequiz.my;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class GameOverActivity extends Activity {
    private Animations animations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        GameSounds sounds = new GameSounds(this);
        sounds.gameOver();

        Bundle extras = getIntent().getExtras();
        int points = extras.getInt("SCORE");
        String timeTxt = extras.getString("TIME");
        String heroName = extras.getString("HERO");

        DataBase base = new DataBase();
        Hero hero = base.find(heroName);

        animations = new Animations(this);

        ImageView gameOverImage = (ImageView)findViewById(R.id.logo);
        gameOverImage.setAnimation(animations.getAnimFadein());
        gameOverImage.setImageResource(hero.getPic());

        ImageView skill0 = (ImageView)findViewById(R.id.skill0);
        skill0.setImageResource(hero.getSkill(0));

        ImageView skill1 = (ImageView)findViewById(R.id.skill1);
        skill1.setImageResource(hero.getSkill(1));

        ImageView skill2 = (ImageView)findViewById(R.id.skill2);
        skill2.setImageResource(hero.getSkill(2));

        ImageView skill3 = (ImageView)findViewById(R.id.skill3);
        skill3.setImageResource(hero.getSkill(3));

        ImageView skill4 = (ImageView)findViewById(R.id.skill4);
        skill4.setImageResource(hero.getSkill(4));

        TextView score = (TextView)findViewById(R.id.scoreRes);
        score.setAnimation(animations.getRightLeft());
        score.setText(Integer.toString(points));

        TextView time = (TextView)findViewById(R.id.timeRes);
        time.setAnimation(animations.getRightLeft());
        time.setText(timeTxt);

        LinearLayout layout = (LinearLayout)findViewById(R.id.skills);
        layout.setAnimation(animations.getAnimFadein());

        TextView gameOverTxt = (TextView)findViewById(R.id.gameOverTxt);
        gameOverTxt.setAnimation(animations.getAnimFadein());
    }
}
