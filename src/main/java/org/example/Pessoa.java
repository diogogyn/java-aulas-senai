package org.example;

public class Pessoa {
    int idade;
    float peso;
    float altura;
    String nome;
    String cidade;
    String estado;
    boolean vivo;
    //construtor padrão
    public Pessoa(){
        this.vivo = true;
        this.nome = "n/a";
        this.cidade = "n/a";
        this.estado = "n/a";
    }
    //construtor com parametros
    public Pessoa(int idade, float peso, float altura, String nome, String cidade, String estado, boolean vivo) {
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.nome = nome + ".";
        this.cidade = cidade;
        this.estado = estado;
        this.vivo = vivo;
    }

    public Pessoa(boolean estaVivo){
        this.vivo = estaVivo;
    }
}
