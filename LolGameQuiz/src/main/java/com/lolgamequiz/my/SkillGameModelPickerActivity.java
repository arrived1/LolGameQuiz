package com.lolgamequiz.my;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class SkillGameModelPickerActivity extends Activity {
    private Animations animations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_picker);

        animations = new Animations(this);
        setAnim();

        addListenerOnButtonSkillQuizNoRepead();
        addListenerOnButtonSkillQuizNoRepeadHardcore();
        addListenerOnButtonSkillQuizDeadMatch();
        addListenerOnButtonSkillQuizDeadMatchHardcore();
    }

    private void addListenerOnButtonSkillQuizNoRepead() {
        final Button button = (Button)findViewById(R.id.ModePick1);
        button.setOnClickListener(new ButtonOnClickListeneSkillNoRepead(this, 3));
    }

    private void addListenerOnButtonSkillQuizNoRepeadHardcore() {
        final Button button = (Button)findViewById(R.id.ModePick2);
        button.setOnClickListener(new ButtonOnClickListeneSkillNoRepead(this, 1));
    }

    private void addListenerOnButtonSkillQuizDeadMatch() {
        final Button button = (Button)findViewById(R.id.ModePick3);
        button.setOnClickListener(new ButtonOnClickListenerSkillDeathMatch(this, 3));
    }

    private void addListenerOnButtonSkillQuizDeadMatchHardcore() {
        final Button button = (Button)findViewById(R.id.ModePick4);
        button.setOnClickListener(new ButtonOnClickListenerSkillDeathMatch(this, 1));
    }

    private void setAnim() {
        LinearLayout layout1 = (LinearLayout)findViewById(R.id.group1);
        layout1.setAnimation(animations.getTopDown());

        LinearLayout layout2 = (LinearLayout)findViewById(R.id.group2);
        layout2.setAnimation(animations.getLeftRight());

        LinearLayout layout3 = (LinearLayout)findViewById(R.id.group3);
        layout3.setAnimation(animations.getRightLeft());

        LinearLayout layout4 = (LinearLayout)findViewById(R.id.group4);
        layout4.setAnimation(animations.getDownTop());
    }
}
