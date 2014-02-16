package com.lolgamequiz.my;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ScoreFragment extends Fragment {
    private FragmentTabHost mTabHost;

    public ScoreFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mTabHost = new FragmentTabHost(getActivity());
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_score);


        mTabHost.addTab(mTabHost.newTabSpec("Skill Single Random").setIndicator("Skill Single Random"),
                TabFragmentHeroSingleRandom.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("Skill Death Match").setIndicator("Skill Death Match"),
                TabFragmentHeroDeathMetch.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("Hero Single Random").setIndicator("Hero Single Random"),
                TabFragmentSkillSingleRandom.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("Hero Death Match").setIndicator("Hero Death Match"),
                TabFragmentSkillDeathMatch.class, null);

        return mTabHost;
    }
}