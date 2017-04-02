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

import static android.R.attr.button;
import static com.example.android.quizapp.MainActivity.points;
import static com.example.android.quizapp.R.id.button_id;
import static com.example.android.quizapp.R.id.button_id_fünf;

public class fragment_five extends Fragment implements View.OnClickListener {

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

    // Creates view for the sixth tab

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_five, container, false);

        Button b = (Button) view.findViewById(R.id.button_id_fünf);
        b.setOnClickListener(this);
        return view;

    }

    /** Manages what happens when the user clicks on the button.
     * Calculates the points of the user for the fifth question and stores it in the global points variable
     * Makes sure the button can only be triggered once to add points
     * Displays toast message to the user so the user knows that the answer has been "sent" successfully
     */

    @Override
    public void onClick(View v) {
        getView().findViewById(R.id.button_id_fünf).setClickable(false);
        switch (v.getId()) {
            case R.id.button_id_fünf:

                EditText enter_kanuFluss = (EditText) getView().findViewById(R.id.fluss_niedersachsen);
                String answerFluss = enter_kanuFluss.getText().toString();

                if (answerFluss.equals("Elbe") ||
                        answerFluss.equals("Ems") ||
                        answerFluss.equals("Weser")) {
                    MainActivity.points += 10;
                }

                if (answerFluss.equals("Aller") ||
                        answerFluss.equals("Hase") ||
                        answerFluss.equals("Ilmenau") ||
                        answerFluss.equals("Leine") ||
                        answerFluss.equals("Oker") ||
                        answerFluss.equals("Vechta") ||
                        answerFluss.equals("Wümme")) {
                    MainActivity.points += 30;
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
                        answerFluss.equals("Örtzel")) {
                    MainActivity.points += 50;
                }

                break;
        }

        Toast.makeText(getActivity(), "Du hast deine Antwort erfolgreich abgeschickt.", Toast.LENGTH_SHORT).show();

    }
}
