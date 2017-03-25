package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import static com.example.android.quizapp.R.drawable.hannover;

public class fragment_six extends Fragment  {

    int points = 0;

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
                //Frage 1
                RadioButton radioButtonFrageEins = (RadioButton) view.findViewById(R.id.yes_radio_button);
                //Is the button checked?
                boolean checked_FrageEins = radioButtonFrageEins.isChecked();
                if (checked_FrageEins) {
                    points += 10;
                }

                //Frage 2
                Spinner spinnerFrageZwei = (Spinner)view.findViewById(R.id.sort_by_spinner);
                //Was the correct item selected? The correct item is Hannover.
                // I was thinking of using the getSelectedItem method but I do not know how it works.

                //Frage 3
                CheckBox norderney = (CheckBox) view.findViewById(R.id.checkbox_norderney);
                boolean checked_norderney = norderney.isChecked();

                CheckBox wangerooge = (CheckBox) view.findViewById(R.id.checkbox_wangerooge);
                boolean checked_wangerooge = wangerooge.isChecked();

                CheckBox juist = (CheckBox) view.findViewById(R.id.checkbox_juist);
                boolean checked_juist = juist.isChecked();

                CheckBox borkum = (CheckBox) view.findViewById(R.id.checkbox_borkum);
                boolean checked_borkum = borkum.isChecked();

                if (checked_norderney && checked_wangerooge && checked_juist && checked_borkum) {
                    points += 40;
                }

                //Frage 4
                //The less known the answer the more points the player gets

                EditText enter_uniStadt = (EditText)view.findViewById(R.id.uni_stadt);
                String answer = enter_uniStadt.getText().toString();

                if (answer.equals("Hannover") ||
                        answer.equals("Göttingen") ||
                        answer.equals("Osnabrück") ||
                        answer.equals("Oldenburg")) {
                    points +=10;
                }

                if (answer.equals("Hildesheim") ||
                        answer.equals("Lüneburg")) {
                    points +=20;
                }

                if (answer.equals("Vechta")) {
                    points +=30;
                }

                if (answer.equals("Clausthal-Zellerfeld")) {
                    points +=40;
                }

                //Frage 5
                //The less known the answer the more points the player gets

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


                Toast.makeText(getActivity(), "Du hast" + points + "erreicht!", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }


}