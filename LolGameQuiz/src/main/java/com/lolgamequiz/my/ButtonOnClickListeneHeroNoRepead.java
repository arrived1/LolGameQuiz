package com.lolgamequiz.my;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.lolgamequiz.my.GameEngine.HeroQuizActivityNorRepead;

public class ButtonOnClickListeneHeroNoRepead implements View.OnClickListener {
    private Context context;
    private int chances;

    public ButtonOnClickListeneHeroNoRepead(Context context_, int chances) {
        this.context = context_;
        this.chances = chances;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(context, HeroQuizActivityNorRepead.class);
        myIntent.putExtra("CHANCES", chances);
        context.startActivity(myIntent);

    }
}
