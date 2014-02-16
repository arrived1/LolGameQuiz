package com.lolgamequiz.my;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.content.Intent;

import com.lolgamequiz.my.GameEngine.SkillQuizActivityDeathMatch;

public class ButtonOnClickListenerSkillDeathMatch implements View.OnClickListener {
    private Context context;
    private int chances;

    public ButtonOnClickListenerSkillDeathMatch(Context context_, int chances) {
        this.context = context_;
        this.chances = chances;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent  = new Intent(context, SkillQuizActivityDeathMatch.class);
        myIntent.putExtra("CHANCES", chances);
        context.startActivity(myIntent);
    }
}
