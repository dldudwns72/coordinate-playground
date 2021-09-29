package rentcompany.car;

public class Sonata extends Car{

    private int distance;
    private static final int fuelEfficiency = 10;

    public Sonata(int distance){
        super();
        this.distance = distance;
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
        return "Sonata";
    }

}
