package com.example.apphackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AQUI ESCRIBIO MILLAN
    }
    // ESTA ES UNA PRUEBA PARA VER FUNCION GIT
    //test


    public void SigPagina(View view) {
        Intent i = new Intent(this, vincular.class);
        startActivity(i);

    }



}

