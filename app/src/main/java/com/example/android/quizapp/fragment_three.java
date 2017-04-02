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

public class fragment_three extends Fragment implements View.OnClickListener {


    public static fragment_three newInstance() {
        fragment_three fragment = new fragment_three();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Creates view for the fourth tab

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);


        Button b = (Button) view.findViewById(R.id.button_id_drei);
        b.setOnClickListener(this);
        return view;

    }

    /** Manages what happens when the user clicks on the button.
     * Calculates the points of the user for the third question and stores it in the global points variable
     * Makes sure the button can only be triggered once to add points
     * Displays toast message to the user so the user knows that the answer has been "sent" successfully
     */

    @Override
    public void onClick(View v) {
        getView().findViewById(R.id.button_id_drei).setClickable(false);
        switch (v.getId()) {
            case R.id.button_id_drei:

                CheckBox norderney = (CheckBox) getView().findViewById(R.id.checkbox_norderney);
                boolean checked_norderney = norderney.isChecked();

                CheckBox wangerooge = (CheckBox) getView().findViewById(R.id.checkbox_wangerooge);
                boolean checked_wangerooge = wangerooge.isChecked();

                CheckBox juist = (CheckBox) getView().findViewById(R.id.checkbox_juist);
                boolean checked_juist = juist.isChecked();

                CheckBox borkum = (CheckBox) getView().findViewById(R.id.checkbox_borkum);
                boolean checked_borkum = borkum.isChecked();

                if (checked_norderney && checked_wangerooge && checked_juist && checked_borkum) {
                    MainActivity.points += 40;
                }

                break;
        }
        Toast.makeText(getActivity(), "Du hast deine Antwort erfolgreich abgeschickt.", Toast.LENGTH_SHORT).show();
    }
}
