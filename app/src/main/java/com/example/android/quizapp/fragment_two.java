package com.example.android.quizapp;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.RadioButton;
        import android.widget.Spinner;
        import android.widget.ImageView;
        import android.widget.TextView;

        import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class fragment_two extends Fragment {

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        RadioButton radioButtonFrageZwei = (RadioButton) view.findViewById(R.id.hannover_radio_button);
        //Is the button checked?
        boolean checked_FrageZwei = radioButtonFrageZwei.isChecked();
        if (checked_FrageZwei) {
            MainActivity.points += 10;
        }

        return view;

    }

}