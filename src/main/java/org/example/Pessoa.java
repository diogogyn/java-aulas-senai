package org.example;

import java.util.Random;

public class Pessoa {
    private int idade;
    private float peso;
    private float altura;
    private String nome;
    private String cidade;
    private String estado;
    private boolean vivo;
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
    //metodos
    public String estaVivo(){
        if(vivo){
            return "SIM";
        }
        return "NÃO";
    }
    public static int idadeAleatoria(){
        Random r = new Random();
        return  r.nextInt();
    }
    public static String nomeDaClasse(){
        String nomeClasse = "Pessoa";

        return "Esta classe se chama "+nomeClasse + " / idade aleatoria: " + idadeAleatoria();
    }


    //setters e getters
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isVivo() {
        return this.vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
