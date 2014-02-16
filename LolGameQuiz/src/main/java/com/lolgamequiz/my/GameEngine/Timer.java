package com.lolgamequiz.my.GameEngine;


import android.app.Activity;
import android.widget.Chronometer;

import com.lolgamequiz.my.R;

public class Timer {
    private Chronometer mChronometer;

    public Timer(Activity actv) {
        mChronometer = (Chronometer)actv.findViewById(R.id.time);
        mChronometer.start();
    }

    public void stopTimer() {
        mChronometer.stop();
    }

    public CharSequence getTimeTxt() {
        return mChronometer.getText();
    }
}
