package com.lolgamequiz.my;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lolgamequiz.my.GameEngine.Animations;
import com.lolgamequiz.my.GameEngine.GameSounds;

public class TwoPlayersReaction extends Fragment {

    private Animations animations;

    public TwoPlayersReaction(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_two_players_reaction, container, false);

        GameSounds sounds = new GameSounds(getActivity());
        sounds.welcome();



        return rootView;
    }
}
