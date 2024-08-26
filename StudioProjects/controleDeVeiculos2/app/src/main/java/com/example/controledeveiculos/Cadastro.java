package com.example.controledeveiculos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {

    EditText texto;
    Button btnSalvar;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        texto = findViewById(R.id.editTextText);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnVoltar.setOnClickListener(v -> onBackPressed());

        btnSalvar.setOnClickListener(v -> {
            Veiculos veiculos = new Veiculos();
            veiculos.nome = texto.getText().toString();
            Dados.lista.add(veiculos.nome);
        });
    }
}
