package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class fragment_four extends Fragment implements View.OnClickListener {


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

    // Creates view for the fifth tab

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_four, container, false);

        Button b = (Button) view.findViewById(R.id.button_id_vier);
        b.setOnClickListener(this);
        return view;

    }

    /** Manages what happens when the user clicks on the button.
     * Calculates the points of the user for the fourth question and stores it in the global points variable
     * Makes sure the button can only be triggered once to add points
     * Displays toast message to the user so the user knows that the answer has been "sent" successfully
     */

    @Override
    public void onClick(View v) {
        getView().findViewById(R.id.button_id_vier).setClickable(false);
        switch (v.getId()) {
            case R.id.button_id_vier:

                EditText enter_uniStadt = (EditText) getView().findViewById(R.id.uni_stadt);
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

                break;
        }
        Toast.makeText(getActivity(), "Du hast deine Antwort erfolgreich abgeschickt.", Toast.LENGTH_SHORT).show();

    }
}