package com.aprendiz.ragp.emparejaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Juego extends AppCompatActivity {
    private int fondoJuego = R.drawable.signo;
    private int [] imagenesJuego = {
            R.drawable.atleta,
            R.drawable.balon,
            R.drawable.banderacar,
            R.drawable.guante,
            R.drawable.medalla,
            R.drawable.natacion,
            R.drawable.silbato,
            R.drawable.trofeocham,

    };
    private int [] imagenesAleatorias, imagenesFondo;
    private List<Integer> imagenesSelect = new ArrayList<>();
    int [] segundos = {0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
    }
}
