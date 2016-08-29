package com.eoss.application.catchyou.Fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eoss.application.catchyou.R;
import com.eoss.application.catchyou.activity.AppActivity;
import com.eoss.application.catchyou.activity.LoginActivity;
import com.parse.ParseUser;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearByListFragment extends Fragment {

    public NearByListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_near_by_list, container, false);
    }

}
