package com.lolgamequiz.my;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class GameActivity extends Activity {
    private Animations animations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        GameSounds sounds = new GameSounds(this);
        sounds.welcome();

        animations = new Animations(this);

        addListenerOnButtonSkillQuiz();
        addListenerOnButtonHeroQuiz();
        addListenerOnButtonScoreBoard();

        RateUs.showRateDialog(this, null);

        ImageView image = (ImageView)findViewById((R.id.logo));
        image.setAnimation(animations.getAnimFadein());
    }

    private void addListenerOnButtonSkillQuiz() {
        final Button button = (Button)findViewById(R.id.skillQuiz);
        button.setAnimation(animations.getLeftRight());
        button.setOnClickListener(new ButtonOnClickListenerSkillGameModePicker(this));
    }

    private void addListenerOnButtonHeroQuiz() {
        final Button button = (Button)findViewById(R.id.heroQuiz);
        button.setAnimation(animations.getRightLeft());
        button.setOnClickListener(new ButtonOnClickListenerHeroGameModePicker(this));
    }

    private void addListenerOnButtonScoreBoard() {
        final Button button = (Button)findViewById(R.id.scoreBoard);
        button.setAnimation(animations.getDownTop());
        button.setOnClickListener(new ButtonOnClickListenerScoreBoard(this));
    }
}
