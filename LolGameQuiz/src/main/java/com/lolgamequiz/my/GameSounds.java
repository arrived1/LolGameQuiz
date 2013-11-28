package com.lolgamequiz.my;

import android.app.Activity;
import android.media.MediaPlayer;

public class GameSounds {
    private Activity actv;

    private void playSound(int id) {
        MediaPlayer mp = null;
        try {
            mp = MediaPlayer.create(actv, id);
            mp.start();
        }
        catch(Exception e) {
            mp.release();
        }
    }

    public GameSounds(Activity actv_) {
        this.actv = actv_;
    }

    public void welcome() {
        playSound(R.raw.Female1_OnWelcomeSummonersRif);
    }

    public void playMusic() {
        playSound(R.raw.Odin1_female1_Opening_Bat);
    }

    public void correct() {
        playSound(R.raw.correct);
    }

    public void incorrect() {
        playSound(R.raw.incorrect);
    }

    public void gameOver() {
        playSound(R.raw.Female1_OnDefeat_1);
    }

    public void gameWin() {
        playSound(R.raw.Female1_OnVictory_1);
    }

    public void correctNumber(int num) {
        switch (num) {
            case 1:
                playSound(R.raw.Female1_OnFirstBlood_1);
                break;
            case 2:
                playSound(R.raw.Female1_OnChampionDoubleKillY1);
                break;
            case 3:
                playSound(R.raw.Female1_OnChampionTripleKillY1);
                break;
            case 5:
                playSound(R.raw.Female1_OnChampionQuadraKillY1);
                break;
            case 10:
                playSound(R.raw.Female1_OnChampionPentaKillYo1);
                break;
            case 20:
                playSound(R.raw.Female1_OnKillingSpreeSet1You1);
                break;
            case 50:
                playSound(R.raw.Female1_OnKillingSpreeSet2You1);
                break;
            case 80:
                playSound(R.raw.Female1_OnKillingSpreeSet3You);
                break;
            case 100:
                playSound(R.raw.Female1_OnKillingSpreeSet3You);
                break;
            case 140:
                playSound(R.raw.Female1_OnKillingSpreeSet5You1);
                break;
            case 200:
                playSound(R.raw.Female1_OnKillingSpreeSet6You1);
                break;
            default:
                break;
        }
    }
}
