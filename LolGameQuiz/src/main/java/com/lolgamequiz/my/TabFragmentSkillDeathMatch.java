package com.lolgamequiz.my;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragmentSkillDeathMatch extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.tab_score, container, false);

        Context context = getActivity();

        DatabaseHandler db = new DatabaseHandler(context, TABLE.SkillDeathMetch);

        ListAdapter adapter = new ListAdapter(context, db.getAllRecords());
        setListAdapter(adapter);

        return V;
    }
}