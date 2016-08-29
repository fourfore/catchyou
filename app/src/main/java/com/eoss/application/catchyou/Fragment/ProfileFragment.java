package com.eoss.application.catchyou.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.eoss.application.catchyou.R;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;
import com.parse.ParseUser;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_profile,container,false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ParseUser currentUser = ParseUser.getCurrentUser();
        textView.setText(currentUser.getUsername());
        return view;


//        ParseUser currentUser = ParseUser.getCurrentUser();
//        TextView view = (TextView)getActivity().findViewById(R.id.textView);
//        view.setText(currentUser.getUsername().toString());
//
//        return inflater.inflate(R.layout.fragment_profile, container, false);


    }

}
