package coordinate.domain;

public class DistanceCalculator {

    private Coordinates coordinates;

    public DistanceCalculator(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public double LineCalculator(){
        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate = coordinates.getCoordinates().get(1);

        int x1 = firstCoordinate.getCoordinateArray().get(0);
        int y1 = firstCoordinate.getCoordinateArray().get(1);

        int x2 = secondCoordinate.getCoordinateArray().get(0);
        int y2 = secondCoordinate.getCoordinateArray().get(1);

        int xd,yd;
        xd = (int) Math.pow((x1-x2),2);
        yd = (int) Math.pow((y1-y2),2);

        return Math.sqrt(xd+yd);
    }


}
