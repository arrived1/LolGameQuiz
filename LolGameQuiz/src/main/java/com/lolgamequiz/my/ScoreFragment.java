package com.lolgamequiz.my;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ScoreFragment extends Fragment {
    private Animations animations;
    private FragmentTabHost mTabHost;

    public ScoreFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mTabHost = new FragmentTabHost(getActivity());
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_score);


        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Tab1"),
                Tab1Fragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Tab2"),
                Tab1Fragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Tab3"),
                Tab1Fragment.class, null);

        return mTabHost;
    }
}