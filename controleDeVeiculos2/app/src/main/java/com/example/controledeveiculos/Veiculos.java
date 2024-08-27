package com.example.controledeveiculos;

public class Veiculos {

    public String nome;
    public String placa;
    public String modelo;
    public String anoFabricacao;

    public String toString(){
        return nome + " - " + modelo + " - " + placa + " - " + anoFabricacao;
    }
}
