package com.example.george.calcimc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        String nome ="";
        Float altura = 0f;
        Float peso = 0f;

        TextView tvNome = findViewById(R.id.tvNome);
        TextView tvDesc = findViewById(R.id.tvDesc);
        Intent it = getIntent();
        if (it != null){
            Bundle params = it.getExtras();
            if (params != null){
                nome = params.getString("nome");
                peso = params.getFloat("peso");
                altura = params.getFloat("altura");
            }

        }
        Float imc = peso / (altura * altura);

        tvNome.setText("Bem vindo " + nome);

        if(imc < 15){
            tvDesc.setText("Extremamente abaixo do peso");
        } else if (imc >= 15 && imc <16 ){
            tvDesc.setText("Gravemente abaixo do peso");
        } else if (imc >= 16 && imc <18.5){
            tvDesc.setText("Abaixo do peso ideal");
        } else if (imc >= 18.5 && imc <25){
            tvDesc.setText("Faixa de peso ideal");
        } else if (imc >= 25 && imc < 30){
            tvDesc.setText("Sobrepeso");
        } else if (imc >= 30 && imc < 35){
            tvDesc.setText("Obesidade grau 1");
        } else if (imc >= 35 && imc < 40){
            tvDesc.setText("Obesidade grau 2 (grave)");
        } else if (imc > 40){
            tvDesc.setText("Obesidade grau 3 (morbida");
        }
    }
}
