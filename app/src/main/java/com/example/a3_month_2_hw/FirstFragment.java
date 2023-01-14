package com.example.a3_month_2_hw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    TextView textView;
    Button buttonPlus;
    Button buttonMinus;
    int click;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = requireActivity().findViewById(R.id.zero);
        buttonPlus = requireActivity().findViewById(R.id.plus);
        buttonMinus = requireActivity().findViewById(R.id.minus);

        buttonClick();
    }

    private void buttonClick() {
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(toString().valueOf(click));
                click++;
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(toString().valueOf(click));
                click--;
            }
        });
    }
}