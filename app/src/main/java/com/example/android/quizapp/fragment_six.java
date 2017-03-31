package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import static android.R.attr.checked;
import static android.R.attr.fragment;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.android.quizapp.MainActivity.points;
import static com.example.android.quizapp.R.drawable.hannover;

public class fragment_six extends Fragment  {

    public static fragment_six newInstance() {
        fragment_six fragment = new fragment_six();
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
        View view = inflater.inflate(R.layout.fragment_six, container, false);

        Button b = (Button) view.findViewById(R.id.button_id);
        b.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {

                Toast.makeText(getActivity(), "Du hast " + MainActivity.points + " Punkte erreicht!", Toast.LENGTH_LONG).show();
            }

        });
        return view;
    }

}