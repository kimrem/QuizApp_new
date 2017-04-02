package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;
import static android.os.Build.VERSION_CODES.M;
import static com.example.android.quizapp.MainActivity.points;
import static com.example.android.quizapp.R.id.button_id;
import static com.example.android.quizapp.R.id.button_id_eins;

public class fragment_one extends Fragment implements View.OnClickListener {


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

    // Creates view for the second tab

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        Button b = (Button) view.findViewById(R.id.button_id_eins);
        b.setOnClickListener(this);
        return view;

    }

    /** Manages what happens when the user clicks on the button.
     * Calculates the points of the user for the first question and stores it in the global points variable
     * Makes sure the button can only be triggered once to add points
     * Displays toast message to the user so the user knows that the answer has been "sent" successfully
    */

    @Override
    public void onClick(View v) {
        getView().findViewById(R.id.button_id_eins).setClickable(false);
        switch (v.getId()) {
            case R.id.button_id_eins:

                RadioButton radioButtonFrageEins = (RadioButton) getView().findViewById(R.id.yes_radio_button);
                //Is the button checked?
                boolean checked_FrageEins = radioButtonFrageEins.isChecked();
                if (checked_FrageEins) {
                    MainActivity.points += 10;
                }

                break;

        }

        Toast.makeText(getActivity(), "Du hast deine Antwort erfolgreich abgeschickt.", Toast.LENGTH_SHORT).show();


    }
}
