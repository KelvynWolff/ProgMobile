package com.example.controledeveiculos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {

    EditText texto;
    EditText placa;
    EditText modelo;
    EditText anoFabricacao;
    Button btnSalvar;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        texto = findViewById(R.id.editTextText);
        placa = findViewById(R.id.placa);
        modelo = findViewById(R.id.modelo);
        anoFabricacao = findViewById(R.id.anoFabricacao);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnVoltar.setOnClickListener(v -> onBackPressed());

        btnSalvar.setOnClickListener(v -> {
            Veiculos veiculos = new Veiculos();
            veiculos.nome = texto.getText().toString();
            veiculos.placa = placa.getText().toString();
            veiculos.modelo = modelo.getText().toString();
            veiculos.anoFabricacao = anoFabricacao.getText().toString();
            Dados.getInstance().salvar(veiculos);
            onBackPressed();
        });
    }
}
