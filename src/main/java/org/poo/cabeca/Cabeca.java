package org.poo.cabeca;

public class Cabeca {
    private Olho olho;
    private Nariz nariz;
    private Boca boca;
    private Orelha orelha;
    public Cabeca() {
        this.olho = new Olho();
        this.nariz = new Nariz();
        this.boca = new Boca();
        this.orelha = new Orelha();
    }
    public Cabeca(Olho olho, Nariz nariz, Boca boca, Orelha orelha) {
        this.olho = olho;
        this.nariz = nariz;
        this.boca = boca;
        this.orelha = orelha;
    }
    public Cabeca(Olho olho, Nariz nariz, Boca boca) {
        this.olho = olho;
        this.nariz = nariz;
        this.boca = boca;
        this.orelha = new Orelha();
    }

    public Olho getOlho() {
        return olho;
    }

    public void setOlho(Olho olho) {
        this.olho = olho;
    }

    public Nariz getNariz() {
        return nariz;
    }

    public void setNariz(Nariz nariz) {
        this.nariz = nariz;
    }

    public Boca getBoca() {
        return boca;
    }

    public void setBoca(Boca boca) {
        this.boca = boca;
    }

    public Orelha getOrelha() {
        return orelha;
    }

    public void setOrelha(Orelha orelha) {
        this.orelha = orelha;
    }
}
