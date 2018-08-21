package com.aprendiz.ragp.emparejaapp;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MenuT extends AppCompatActivity {
    public static int nivel = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_t);

      //  printKeyHash();

    }

    private void printKeyHash() {

        try {
            PackageInfo info = getPackageManager().getPackageInfo("com.aprendiz.ragp.emparejaapp", PackageManager.GET_SIGNATURES);

            for (Signature signature : info.signatures){
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

    public void jugar(View view) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.item_dificultad);
        final RadioButton rbtnFacil = dialog.findViewById(R.id.rbtnFacil);
        final RadioButton rbtnMedio = dialog.findViewById(R.id.rbtnMedio);
        final RadioButton rbtnDificil = dialog.findViewById(R.id.rbtnDificl);
        Button btnAceptar = dialog.findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbtnFacil.isChecked()){
                    nivel=4;
                }
                if (rbtnMedio.isChecked()){
                    nivel=6;
                }
                if (rbtnDificil.isChecked()){
                    nivel=8;
                }
                Intent intent = new Intent(MenuT.this,Juego.class);
                startActivity(intent);
                dialog.cancel();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void puntuacion(View view) {

        Intent intent = new Intent(MenuT.this, Puntuacion.class);
        startActivity(intent);
    }

    public void configuracion(View view) {
        Intent intent = new Intent(MenuT.this, Configuracion.class);
        startActivity(intent);
    }
}
