package org.poo.cabeca;

public class Olho {
    private final String COR_MARROM = "marrom";
    private final String COR_VERDE = "verde";
    private final String COR_AZUL = "azul";

    private String corIris;
    private float diametro;
    private boolean cego;
    public Olho() {
        this.corIris = COR_MARROM;
        this.diametro = 3f;
        this.cego = false;
    }
    public Olho(String corIris, float diametro, boolean cego) {
        this.corIris = corIris;
        this.diametro = diametro;
        this.cego = cego;
    }

    public String getCorIris() {
        return "Cor: " + corIris;
    }

    /**
     * 1 - para azul
     * 2 - para verde
     * qualquer outro valort - marrom
     * @param corIris
     */
    public void setCorIris(int corIris) {
        if(corIris == 1)
            this.corIris = COR_AZUL;
        else if(corIris == 2)
            this.corIris = COR_VERDE;
        else
            this.corIris = COR_MARROM;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    private boolean isCego() {
        return cego;
    }

    public String estaCego(){
        if(isCego())
            return "SIM";
        else {
            System.out.println("sdkalfjsalç");
            return "NÃO";
        }
        //return isCego() ? "SIM" : "NÃO";
    }

    public void setCego(boolean cego) {
        this.cego = cego;
    }
}
