package rentcompany.car;

public class Avante extends Car {

    private static final int fuelEfficiency = 15;

    private int distance;

    public Avante(int distance){
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
        return "Avante";
    }
}
