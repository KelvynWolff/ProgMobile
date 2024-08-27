package com.example.controledeveiculos;

import java.util.List;
import java.util.LinkedList;

public class Dados {

    public List<Veiculos>lista;
    private static Dados dados;
    private Dados() { lista = new LinkedList<>(); }
    public static Dados getInstance() {
        if (dados==null)
            dados = new Dados();
        return dados;
    }
    public List<Veiculos> getLista() {
        return lista;
    }

    public void salvar(Veiculos veiculo) {
        lista.add(veiculo);
    }

}
