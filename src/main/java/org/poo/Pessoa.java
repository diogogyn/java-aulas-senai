package org.poo;

import org.poo.cabeca.Cabeca;
import org.poo.inferior.MembrosInferiores;
import org.poo.tronco.Tronco;

public class Pessoa {
    private Cabeca cabeca;
    private Tronco tronco;
    private MembrosInferiores inferior;

    public Pessoa() {
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
    public Pessoa(Cabeca cabeca, Tronco tronco, MembrosInferiores inferior) {
        this.cabeca = cabeca;
        this.tronco = tronco;
        this.inferior = inferior;
    }

    public Cabeca getCabeca() {
        return cabeca;
    }

    public void setCabeca(Cabeca cabeca) {
        this.cabeca = cabeca;
    }

    public Tronco getTronco() {
        return tronco;
    }

    public void setTronco(Tronco tronco) {
        this.tronco = tronco;
    }

    public MembrosInferiores getInferior() {
        return inferior;
    }

    public void setInferior(MembrosInferiores inferior) {
        this.inferior = inferior;
    }

    public DadosPessoa retornaNomeEIdade(){
        String nome = "blskfsa";
        int idade = 20;
        return new DadosPessoa(nome, idade);
    }
}
