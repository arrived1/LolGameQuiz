package com.lolgamequiz.my;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lolgamequiz.my.GameEngine.Animations;
import com.lolgamequiz.my.GameEngine.GameSounds;


public class GameFragment extends Fragment {

    private Animations animations;


    public GameFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_game, container, false);
        Context context = getActivity();

        GameSounds sounds = new GameSounds((Activity)context);
        sounds.welcome();

        RateUs.app_launched(context);
        //RateUs.showRateDialog(context, null); //test purposes

        animations = new Animations(context);
        ImageView image = (ImageView)rootView.findViewById((R.id.logo));
        image.setAnimation(animations.getAnimFadein());

        return rootView;
    }
}