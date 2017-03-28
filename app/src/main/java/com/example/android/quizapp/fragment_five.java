package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment_five extends Fragment {

    int points = 0;

    public static fragment_five newInstance() {
        fragment_five fragment = new fragment_five();
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
        View view = inflater.inflate(R.layout.fragment_five, container, false);

        EditText enter_kanuFluss = (EditText)view.findViewById(R.id.fluss_niedersachsen);
        String answerFluss = enter_kanuFluss.getText().toString();

        if (answerFluss.equals("Elbe") ||
                answerFluss.equals("Ems") ||
                answerFluss.equals("Weser"))  {
            points +=10;
        }

        if (answerFluss.equals("Aller") ||
                answerFluss.equals("Hase") ||
                answerFluss.equals("Ilmenau") ||
                answerFluss.equals("Leine") ||
                answerFluss.equals("Oker") ||
                answerFluss.equals("Vechta") ||
                answerFluss.equals("Wümme"))  {
            points +=30;
        }

        if (answerFluss.equals("Este") ||
                answerFluss.equals("Fuhse") ||
                answerFluss.equals("Geeste") ||
                answerFluss.equals("Große Aue") ||
                answerFluss.equals("Hamme") ||
                answerFluss.equals("Hunte") ||
                answerFluss.equals("Jeetzel") ||
                answerFluss.equals("Jümme") ||
                answerFluss.equals("Leeda") ||
                answerFluss.equals("Leetze") ||
                answerFluss.equals("Lune") ||
                answerFluss.equals("Oste") ||
                answerFluss.equals("Örtzel"))  {
            points +=50;
        }

        return view;
    }
}