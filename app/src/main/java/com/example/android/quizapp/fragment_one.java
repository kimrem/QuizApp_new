package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;
import static com.example.android.quizapp.MainActivity.points;

public class fragment_one extends Fragment {


    public static fragment_one newInstance() {
        fragment_one fragment = new fragment_one();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        RadioButton radioButtonFrageEins = (RadioButton) view.findViewById(R.id.yes_radio_button);
        //Is the button checked?
        boolean checked_FrageEins = radioButtonFrageEins.isChecked();
        if (checked_FrageEins) {
            MainActivity.points += 10;
            }

        return view;

    }

}
