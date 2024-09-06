package org.poo;

import org.poo.cabeca.*;
import org.poo.inferior.MembrosInferiores;
import org.poo.tronco.Tronco;

public class Main {
    public static void main(String[] args) {
        Olho zoio = new Olho();
        zoio.setCorIris(1);
        zoio.setCego(false);
        zoio.setDiametro(3f);
        //
        Nariz narigudo = new Nariz();
        //
        Orelha orelhao = new Orelha();
        //
        Boca bocudo = new Boca();
        //
        Cabeca cabecao = new Cabeca(zoio,narigudo,bocudo,orelhao);
        //
        Tronco troncudo = new Tronco();
        //
        MembrosInferiores pernas = new MembrosInferiores();
        ///////
        Pessoa pessoa1 = new Pessoa(cabecao, troncudo, pernas);
        Pessoa pessoa2 = new Pessoa();
        //////versao 1
        Cabeca cabPessoa1 = pessoa1.getCabeca();
        Olho olhPessoa1 = cabPessoa1.getOlho();
        String corOlhoPessoa1V1 = olhPessoa1.getCorIris();
        //////versao 2
        String corOlhoPessoa1V2 = pessoa1.getCabeca().getOlho().getCorIris();

    }
}
