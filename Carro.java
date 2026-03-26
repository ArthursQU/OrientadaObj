package com.meupacote;

public class Carro {
    public String modelo;

    private int ano;
    protected String cor;
    int numeroDePortas;

    public Carro (String modelo, int ano, String cor, int numeroDePortas) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numeroDePortas = numeroDePortas;
    }

    public void ligar() {
        System.out.println("O carro está ligado.");
    }
    private void acelerar() {
        System.out.println("O carro está acelerando...");
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    protected void pintarCarro(String novaCor) {
        this.cor = novaCor;
        System.out.println("O carro foi pintado de " + novaCor);
    }

    public void mostrarNumeroDePortas() {
        System.out.println("O carro tem " + numeroDePortas + " portas.");
    }

}

