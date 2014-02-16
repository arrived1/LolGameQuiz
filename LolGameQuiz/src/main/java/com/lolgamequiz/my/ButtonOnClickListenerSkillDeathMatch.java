package com.lolgamequiz.my;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.content.Intent;

import com.lolgamequiz.my.GameEngine.SkillQuizActivityDeathMatch;

public class ButtonOnClickListenerSkillDeathMatch implements View.OnClickListener {
    private Activity actv;
    private Context context;
    private int chances;

    public ButtonOnClickListenerSkillDeathMatch(Activity activity_, int chances) {
        this.actv = activity_;
        this.chances = chances;
    }

    public ButtonOnClickListenerSkillDeathMatch(Context context_, int chances) {
        this.context = context_;
        this.chances = chances;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = null;

        if(actv != null) {
            myIntent = new Intent(actv, SkillQuizActivityDeathMatch.class);
            myIntent.putExtra("CHANCES", chances);
            actv.startActivity(myIntent);
        }
        if(context != null) {
            myIntent = new Intent(context, SkillQuizActivityDeathMatch.class);
            myIntent.putExtra("CHANCES", chances);
            context.startActivity(myIntent);
        }
    }
}
