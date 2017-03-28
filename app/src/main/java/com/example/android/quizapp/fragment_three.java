package com.example.android.quizapp;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.CheckBox;
        import android.widget.ImageView;
        import android.widget.TextView;

public class fragment_three extends Fragment {

    int points = 0;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

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

        return view;
    }
}