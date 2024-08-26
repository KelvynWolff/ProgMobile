package com.example.controledeveiculos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnNovo;
    Button btnRemover;
    Button btnSair;
    ListView lista;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNovo = findViewById(R.id.btnNovo);
        btnRemover = findViewById(R.id.btnRemover);
        btnSair = findViewById(R.id.btnSair);
        lista = findViewById(R.id.listView);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Dados.lista);
        lista.setAdapter(adapter);

        btnNovo.setOnClickListener(v -> {
            Intent it = new Intent(MainActivity.this, Cadastro.class);
            startActivity(it);
        });

        btnSair.setOnClickListener(v -> finish());
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.notifyDataSetChanged();
    }
}
