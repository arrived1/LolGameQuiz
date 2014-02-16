package com.lolgamequiz.my;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.lolgamequiz.my.GameEngine.HeroQuizActivityDeathMatch;

public class ButtonOnClickListenerHeroDeathMatch implements View.OnClickListener {
    private Context context;
    private int chances;

    public ButtonOnClickListenerHeroDeathMatch(Context context_, int chances) {
        this.context = context_;
        this.chances = chances;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent  = new Intent(context, HeroQuizActivityDeathMatch.class);
        myIntent.putExtra("CHANCES", chances);
        context.startActivity(myIntent);
    }
}
