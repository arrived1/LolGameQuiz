package com.lolgamequiz.my;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        GameSounds sounds = new GameSounds(this);
        sounds.welcome();

        addListenerOnButtonSkillQuiz();
        addListenerOnButtonHeroQuiz();
        addListenerOnButtonScoreBoard();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    private void addListenerOnButtonSkillQuiz() {
        final Button button = (Button)findViewById(R.id.skillQuiz);
        button.setOnClickListener(new ButtonOnClickListenerSkillGameModePicker(this));
    }

    private void addListenerOnButtonHeroQuiz() {
        final Button button = (Button)findViewById(R.id.heroQuiz);
        button.setOnClickListener(new ButtonOnClickListenerHeroGameModePicker(this));
    }

    private void addListenerOnButtonScoreBoard() {
        final Button button = (Button)findViewById(R.id.scoreBoard);
        button.setOnClickListener(new ButtonOnClickListenerScoreBoard(this));
    }
}
