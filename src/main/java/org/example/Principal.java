package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa(100, 50, 1.59f, "Micalteia", "Cairo", "Moafaza",false);
        Pessoa p3 = new Pessoa(false);
        System.out.println("Pessoa 1");
        p1.setNome("Hermanoteu");
        p1.setPeso(70);
        p1.setAltura(1.6f);
        p1.setIdade(45);
        p1.setCidade("Cairo");
        p1.setEstado("Moafaza");
        p1.setVivo(true);
        System.out.println(p1.getNome());
        System.out.println(p1.getPeso());
        System.out.println(p1.getAltura());
        System.out.println(p1.getCidade());
        System.out.println(p1.getEstado());
        System.out.println(p1.estaVivo());

        //System.out.println(Pessoa.estaVivo());
        System.out.println(Pessoa.nomeDaClasse());
        System.out.println(Pessoa.idadeAleatoria());

        System.out.println("Pessoa 2");
        p1.setNome("Micalateia");
        p1.setPeso(50);
        p1.setAltura(1.5f);
        p1.setIdade(40);
        p1.setCidade("Cairo");
        p1.setEstado("Moafaza");
        p1.setVivo(true);
        System.out.println(p1.getNome());
        System.out.println(p1.getPeso());
        System.out.println(p1.getAltura());
        System.out.println(p1.getCidade());
        System.out.println(p1.getEstado());
        System.out.println(p1.estaVivo());



    }
}