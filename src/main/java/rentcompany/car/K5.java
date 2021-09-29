package rentcompany.car;

public class K5 extends Car{

    private static final int fuelEfficiency = 13;

    private int distance;

    public K5(int distance){
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    double getDistancePerLiter() {
        return fuelEfficiency;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
