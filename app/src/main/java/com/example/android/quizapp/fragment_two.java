package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class fragment_two extends Fragment implements View.OnClickListener {

    public static fragment_two newInstance() {
        fragment_two fragment = new fragment_two();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Creates view for the third tab

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        Button b = (Button) view.findViewById(R.id.button_id_zwei);
        b.setOnClickListener(this);
        return view;

    }

    /** Manages what happens when the user clicks on the button.
     * Calculates the points of the user for the second question and stores it in the global points variable
     * Makes sure the button can only be triggered once to add points
     * Displays toast message to the user so the user knows that the answer has been "sent" successfully
     */

    @Override
    public void onClick(View v) {
        getView().findViewById(R.id.button_id_zwei).setClickable(false);
        switch (v.getId()) {
            case R.id.button_id_zwei:

                RadioButton radioButtonFrageZwei = (RadioButton) getView().findViewById(R.id.hannover_radio_button);
                //Is the button checked?
                boolean checked_FrageZwei = radioButtonFrageZwei.isChecked();
                if (checked_FrageZwei) {
                    MainActivity.points += 10;
                }

                break;
        }

        Toast.makeText(getActivity(), "Du hast deine Antwort erfolgreich abgeschickt.", Toast.LENGTH_SHORT).show();

    }
}