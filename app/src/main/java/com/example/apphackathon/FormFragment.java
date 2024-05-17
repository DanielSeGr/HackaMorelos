package com.example.apphackathon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.example.apphackathon.R;

public class FormFragment extends Fragment {

    private EditText edadEditText;
    private EditText generoEditText;
    private EditText horaDormirEditText;
    private EditText tiempoDormirEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_form, container, false);

        edadEditText = view.findViewById(R.id.edadEditText);
        generoEditText = view.findViewById(R.id.generoEditText);
        horaDormirEditText = view.findViewById(R.id.horaDormirEditText);
        tiempoDormirEditText = view.findViewById(R.id.tiempoDormirEditText);

        Button siguienteButton = view.findViewById(R.id.siguienteButton);
        siguienteButton.setOnClickListener(v -> {

            String edad = edadEditText.getText().toString();
            String genero = generoEditText.getText().toString();
            String horaDormir = horaDormirEditText.getText().toString();
            String tiempoDormir = tiempoDormirEditText.getText().toString();

        });

        return view;
    }
}
