package com.lolgamequiz.my;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class SkillQuizModePickerFragment extends Fragment {
    private Animations animations;
    private View rootView;
    private Context context;

    public SkillQuizModePickerFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_game_mode_picker, container, false);
        context = getActivity();

        animations = new Animations(context);
        setAnim();

        addListenerOnButtonSkillQuizNoRepead();
        addListenerOnButtonSkillQuizNoRepeadHardcore();
        addListenerOnButtonSkillQuizDeadMatch();
        addListenerOnButtonSkillQuizDeadMatchHardcore();

        return rootView;
    }

    private void addListenerOnButtonSkillQuizNoRepead() {
        final Button button = (Button)rootView.findViewById(R.id.ModePick1);
        button.setOnClickListener(new ButtonOnClickListeneSkillNoRepead(context, 3));
    }

    private void addListenerOnButtonSkillQuizNoRepeadHardcore() {
        final Button button = (Button)rootView.findViewById(R.id.ModePick2);
        button.setOnClickListener(new ButtonOnClickListeneSkillNoRepead(context, 1));
    }

    private void addListenerOnButtonSkillQuizDeadMatch() {
        final Button button = (Button)rootView.findViewById(R.id.ModePick3);
        button.setOnClickListener(new ButtonOnClickListenerSkillDeathMatch(context, 3));
    }

    private void addListenerOnButtonSkillQuizDeadMatchHardcore() {
        final Button button = (Button)rootView.findViewById(R.id.ModePick4);
        button.setOnClickListener(new ButtonOnClickListenerSkillDeathMatch(context, 1));
    }

    private void setAnim() {
        LinearLayout layout1 = (LinearLayout)rootView.findViewById(R.id.group1);
        layout1.setAnimation(animations.getTopDown());

        LinearLayout layout2 = (LinearLayout)rootView.findViewById(R.id.group2);
        layout2.setAnimation(animations.getLeftRight());

        LinearLayout layout3 = (LinearLayout)rootView.findViewById(R.id.group3);
        layout3.setAnimation(animations.getRightLeft());

        LinearLayout layout4 = (LinearLayout)rootView.findViewById(R.id.group4);
        layout4.setAnimation(animations.getDownTop());
    }
}