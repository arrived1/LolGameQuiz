package com.lolgamequiz.my.GameEngine;

import android.app.Activity;
import android.media.MediaPlayer;

import com.lolgamequiz.my.R;

public class GameSounds {
    private Activity actv;

    private void playSound(int id) {
        MediaPlayer mp = null;
        try {
            mp = MediaPlayer.create(actv, id);
            mp.start();
        }
        catch(Exception e) {
            if(mp != null)
                mp.release();
        }
    }

    public GameSounds(Activity actv_) {
        this.actv = actv_;
    }

    public void welcome() {
        playSound(R.raw.female1_onwelcomesummonersrif);
    }

    public void playMusic() {
        playSound(R.raw.odin1_female1_opening_bat);
    }

    public void correct() {
        playSound(R.raw.correct);
    }

    public void incorrect() {
        playSound(R.raw.incorrect);
    }

    public void gameOver() {
        playSound(R.raw.female1_ondefeat_1);
    }

    public void gameWin() {
        playSound(R.raw.female1_onvictory_1);
    }

    public void correctNumber(int num) {
        switch (num) {
            case 1:
                playSound(R.raw.female1_onfirstblood_1);
                break;
            case 2:
                playSound(R.raw.female1_onchampiondoublekilly1);
                break;
            case 3:
                playSound(R.raw.female1_onchampiontriplekilly1);
                break;
            case 5:
                playSound(R.raw.female1_onchampionquadrakilly1);
                break;
            case 10:
                playSound(R.raw.female1_onchampionpentakillyo1);
                break;
            case 20:
                playSound(R.raw.female1_onkillingspreeset1you1);
                break;
            case 50:
                playSound(R.raw.female1_onkillingspreeset2you1);
                break;
            case 80:
                playSound(R.raw.female1_onkillingspreeset3you);
                break;
            case 100:
                playSound(R.raw.female1_onkillingspreeset3you);
                break;
            case 140:
                playSound(R.raw.female1_onkillingspreeset5you1);
                break;
            case 200:
                playSound(R.raw.female1_onkillingspreeset6you1);
                break;
            default:
                break;
        }
    }
}
