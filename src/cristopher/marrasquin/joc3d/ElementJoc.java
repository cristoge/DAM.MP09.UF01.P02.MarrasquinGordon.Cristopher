package cristopher.marrasquin.joc3d;

public class ElementJoc {
    private String nom;
    private int posicioX;
    private int posicioY;
    private int posicioZ;

    public ElementJoc(String nom) {
        this.nom = nom;
    }

    public void setPosicio(int x, int y, int z) {
        this.posicioX = x;
        this.posicioY = y;
        this.posicioZ = z;
    }

    public String getNom() {
        return nom;
    }

    public int getPosicioX() {
        return posicioX;
    }

    public int getPosicioY() {
        return posicioY;
    }

    public int getPosicioZ() {
        return posicioZ;
    }
}
