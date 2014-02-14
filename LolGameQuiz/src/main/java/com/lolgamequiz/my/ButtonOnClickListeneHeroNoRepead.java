package com.lolgamequiz.my;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class ButtonOnClickListeneHeroNoRepead implements View.OnClickListener {
    private Activity actv;
    private Context context;
    private int chances;

    public ButtonOnClickListeneHeroNoRepead(Activity activity_, int chances) {
        this.actv = activity_;
        this.chances = chances;
    }

    public ButtonOnClickListeneHeroNoRepead(Context context_, int chances) {
        this.context = context_;
        this.chances = chances;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = null;

        if(actv != null) {
            myIntent = new Intent(actv, HeroQuizActivityNorRepead.class);
            myIntent.putExtra("CHANCES", chances);
            actv.startActivity(myIntent);
        }
        if(context != null) {
            myIntent = new Intent(context, HeroQuizActivityNorRepead.class);
            myIntent.putExtra("CHANCES", chances);
            context.startActivity(myIntent);
        }
    }
}
