public class TarifWeekend implements TarifCalculateur{
    public double calculerTarifs(Velo velo) {
        return 0.3 * (velo.getDistance() * 10.0) + 0.7 * 70.0;
    }
}
