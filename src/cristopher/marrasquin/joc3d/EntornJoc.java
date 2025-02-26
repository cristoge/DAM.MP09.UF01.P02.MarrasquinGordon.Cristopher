package cristopher.marrasquin.joc3d;
public class EntornJoc {
    private int ampleMaximPantalla;
    private int alturaMaximPantalla;
    private int midaProfunditatPantalla;

    public EntornJoc(int ample, int altura, int profunditat) {
        this.ampleMaximPantalla = ample;
        this.alturaMaximPantalla = altura;
        this.midaProfunditatPantalla = profunditat;
    }

    public int getAmpleMaximPantalla() {
        return ampleMaximPantalla;
    }

    public int getAlturaMaximPantalla() {
        return alturaMaximPantalla;
    }

    public int getMidaProfunditatPantalla() {
        return midaProfunditatPantalla;
    }
}