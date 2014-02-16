package com.lolgamequiz.my;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.lolgamequiz.my.GameEngine.SkillQuizActivityNorRepead;

public class ButtonOnClickListeneSkillNoRepead implements View.OnClickListener {
    private Context context;
    private int chances;

    public ButtonOnClickListeneSkillNoRepead(Context context_, int chances) {
        this.context = context_;
        this.chances = chances;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(context, SkillQuizActivityNorRepead.class);
        myIntent.putExtra("CHANCES", chances);
        context.startActivity(myIntent);
    }
}
