package com.lolgamequiz.my;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import java.util.Random;
import java.util.Vector;


public class HeroQuizActivityDeathMatch extends Activity {
    private GameSounds sounds;
    private Score score;
    private Timer timer;
    private Random rand = new Random();

    private DataBase base = new DataBase();
    private Hero newHero;
    private Vector<ImageButton> answers = new Vector<ImageButton>();

    private int correctAnswer = -1;

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

        addAdView();

        prepareBoard();
        prepareQuestion();
    }

    private void addAdView() {
        AdView ad = (AdView)findViewById(R.id.adView);
        ad.loadAd(new AdRequest());
    }

    private void prepareQuestion()
    {
        prepareSkill();
        prepareCorrectAnswer();

        for(int i = 0; i < answers.size(); ++i) {
            if(i == correctAnswer)
                continue;

            int heroRand = randHeroForAnswers();
            int resource = base.getHero(heroRand).getSmallPic();
            answers.get(i).setImageResource(resource);
        }
    }

    private void prepareSkill() {
        int heroIdx = rand.nextInt(base.size());
        newHero = base.getHero(heroIdx);
        base.remove(heroIdx);

        int randSkill = rand.nextInt(3);

        ImageView heroPic = (ImageView) findViewById(R.id.pic);
        heroPic.setImageResource(newHero.getSkill(randSkill));
    }

    private void  prepareCorrectAnswer() {
        correctAnswer = rand.nextInt(answers.size());
        int correctHero = newHero.getSmallPic();
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
}