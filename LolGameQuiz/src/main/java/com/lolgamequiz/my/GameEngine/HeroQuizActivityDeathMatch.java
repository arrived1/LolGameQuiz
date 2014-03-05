package com.lolgamequiz.my.GameEngine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.plus.Plus;
import com.lolgamequiz.my.DataBase.HeroBase;
import com.lolgamequiz.my.DataBase.DataBaseRecord;
import com.lolgamequiz.my.DataBase.DatabaseHandler;
import com.lolgamequiz.my.DataBase.Hero;
import com.lolgamequiz.my.DataBase.TABLE;
import com.lolgamequiz.my.GameFragment;
import com.lolgamequiz.my.R;

import java.util.Random;
import java.util.Vector;


public class HeroQuizActivityDeathMatch extends Activity {
    private AdView adView;
    private GameSounds sounds;
    private Score score;
    private Timer timer;
    private Random rand = new Random();

    private HeroBase base = new HeroBase();
    private Hero newHero;
    private Vector<ImageButton> answers = new Vector<ImageButton>();

    private int correctAnswer = -1;

    private Animations animations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_quiz);

        Bundle extras = getIntent().getExtras();
        int chances = extras.getInt("CHANCES");
        this.sounds = new GameSounds(this);
        this.score = new Score(this, chances);

        this.timer = new Timer(this);
        score.prepareScore();

        animations = new Animations(this);

        addAdView();

        prepareBoard();
        prepareQuestion();

        setAnim();

    }

    private void addAdView() {
        adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .addTestDevice("TEST_DEVICE_ID")
                .build();
        adView.loadAd(adRequest);
    }

    private void prepareQuestion()
    {
        prepareSkill();
        prepareCorrectAnswer();

        for(int i = 0; i < answers.size(); ++i) {
            if(i == correctAnswer)
                continue;

            int heroRand = randHeroForAnswers();
            int resource = base.getHero(heroRand).getPic();
            answers.get(i).setImageResource(resource);
        }
    }

    private void prepareSkill() {
        int heroIdx = rand.nextInt(base.size());
        newHero = base.getHero(heroIdx);
        base.remove(heroIdx);

        int randSkill = rand.nextInt(base.getSkillAmount());

        ImageView heroPic = (ImageView) findViewById(R.id.pic);
        heroPic.setImageResource(newHero.getSkill(randSkill));
    }

    private void  prepareCorrectAnswer() {
        correctAnswer = rand.nextInt(answers.size());
        int correctHero = newHero.getPic();
        answers.get(correctAnswer).setImageResource(correctHero);
    }

    private int randHeroForAnswers() {
        while(true) {
            int idx = rand.nextInt(base.size());

            if(newHero.getName() != base.getHero(idx).getName())
                return idx;
        }
    }

    private void action(int buttonId) {
        if(correctAnswer == buttonId) {
            score.addPoint();
            sounds.correct();
            sounds.correctNumber(score.getPoints());
//            if(score.getPoints() == 1) {
//                GoogleApiClient client = new GoogleApiClient.Builder(this).build();
//                Games.Achievements.increment(client, "CgkI_PXRrq4PEAIQAQ", 1);
//            }
            prepareQuestion();
        }
        else {
            sounds.incorrect();
            score.subGuesses();
            if(score.getGuessesLeft() == 0) {
                gameOver();
            }
        }
    }

    private void gameOver() {
        timer.stopTimer();

        updateDataBaseScore();

        Intent myIntent = new Intent(this, GameOverActivity.class);
        myIntent.putExtra("HERO", newHero.getName());
        myIntent.putExtra("SCORE", score.getPoints());
        myIntent.putExtra("TIME", timer.getTimeTxt());
        startActivity(myIntent);
        finish();
    }

    private void updateDataBaseScore() {
        DatabaseHandler db = new DatabaseHandler(this, TABLE.HeroDeathMetch);
        DataBaseRecord record = new DataBaseRecord(Integer.toString(score.getPoints()),
                                                   Integer.toString(score.getGuessesLeft()),
                                                   timer.getTimeTxt().toString());
        db.addRecord(record);
    }

    private void setAnim() {
        ImageView pic = (ImageView)findViewById(R.id.pic);
        pic.setAnimation(animations.getAnimFadein());

        LinearLayout layout1 = (LinearLayout)findViewById(R.id.buttonRow1);
        layout1.setAnimation(animations.getLeftRight());

        LinearLayout layout2 = (LinearLayout)findViewById(R.id.buttonRow2);
        layout2.setAnimation(animations.getRightLeft());

        LinearLayout layout3 = (LinearLayout)findViewById(R.id.buttonRow3);
        layout3.setAnimation(animations.getLeftRight());
    }

    private void prepareBoard() {
        ImageButton button0 = (ImageButton)findViewById(R.id.image0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(0);

            }
        });

        ImageButton button1 = (ImageButton)findViewById(R.id.image1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(1);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.image2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(2);
            }
        });

        ImageButton button3 = (ImageButton)findViewById(R.id.image3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(3);
            }
        });

        ImageButton button4 = (ImageButton) findViewById(R.id.image4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(4);
            }
        });

        ImageButton button5 = (ImageButton)findViewById(R.id.image5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(5);
            }
        });

        answers.add(button0);
        answers.add(button1);
        answers.add(button2);
        answers.add(button3);
        answers.add(button4);
        answers.add(button5);
    }

     @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    /** Called before the activity is destroyed. */
    @Override
    public void onDestroy() {
        // Destroy the AdView.
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}