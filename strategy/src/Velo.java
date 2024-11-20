public class Velo {
    private int distance;
    private TarifCalculateur calculateur;
    

    public Velo(int distance) {
        this.distance = distance;
    }


    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public TarifCalculateur getCalculateur() {
        return this.calculateur;
    }

    public void setCalculateur(TarifCalculateur calculateur) {
        this.calculateur = calculateur;
    }


    public double calculerTarifs() {
        return this.calculateur.calculerTarifs(this);
    }
}