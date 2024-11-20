public class TarifDistance implements TarifCalculateur{
    public double calculerTarifs(Velo velo) {
        return velo.getDistance() * 10.0;
    }
}
