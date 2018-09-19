package com.example.george.calcimc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText etNome = findViewById(R.id.etNome);
    EditText etPeso = findViewById(R.id.etPeso);
    EditText etAltura = findViewById(R.id.etAltura);

    String nome = etNome.getText().toString();
    Float peso = Float.parseFloat(etPeso.getText().toString());
    Float altura = Float.parseFloat(etAltura.getText().toString());

    public void calcular(View view){
        Intent it = new Intent(this, Resultado.class);
        Bundle params = new Bundle();
        params.putString("nome", nome);
        params.putFloat("peso", peso);
        params.putFloat("altura", altura);
        it.putExtras(params);
        startActivity(it);
    }
}
