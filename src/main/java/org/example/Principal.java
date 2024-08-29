package org.example;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa(100, 50, 1.59f, "Micalteia", "Cairo", "Moafaza",false);
        Pessoa p3 = new Pessoa(false);
        System.out.println("Pessoa 1");
        System.out.println(p1.nome);
        System.out.println(p1.peso);
        System.out.println(p1.altura);
        System.out.println(p1.cidade);
        System.out.println(p1.estado);
        System.out.println(p1.vivo);

        System.out.println("Pessoa 2");
        System.out.println(p2.nome);
        System.out.println(p2.peso);
        System.out.println(p2.altura);
        System.out.println(p2.cidade);
        System.out.println(p2.estado);
        System.out.println(p2.vivo);

        System.out.println("Pessoa 3");
        System.out.println(p3.vivo);



    }
}