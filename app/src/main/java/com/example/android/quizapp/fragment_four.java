package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment_four extends Fragment {


    public static fragment_four newInstance() {
        fragment_four fragment = new fragment_four();
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
        View view = inflater.inflate(R.layout.fragment_four, container, false);

        EditText enter_uniStadt = (EditText)view.findViewById(R.id.uni_stadt);
        String answer = enter_uniStadt.getText().toString();

        if (answer.equals("Hannover") ||
                answer.equals("Göttingen") ||
                answer.equals("Osnabrück") ||
                answer.equals("Oldenburg")) {
            MainActivity.points += 10;
        }

        if (answer.equals("Hildesheim") ||
                answer.equals("Lüneburg")) {
            MainActivity.points += 20;
        }

        if (answer.equals("Vechta")) {
            MainActivity.points += 30;
        }

        if (answer.equals("Clausthal-Zellerfeld")) {
            MainActivity.points += 40;
        }

        return view;
    }
}