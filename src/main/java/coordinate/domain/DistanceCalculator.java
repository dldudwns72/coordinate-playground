package coordinate.domain;

public class DistanceCalculator {

    private Coordinates coordinates;

    public DistanceCalculator(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public double LineCalculator() {
        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate = coordinates.getCoordinates().get(1);

        int x1 = firstCoordinate.getCoordinateArray().get(0);
        int y1 = firstCoordinate.getCoordinateArray().get(1);

        int x2 = secondCoordinate.getCoordinateArray().get(0);
        int y2 = secondCoordinate.getCoordinateArray().get(1);

        int xd, yd;
        xd = (int) Math.pow((x1 - x2), 2);
        yd = (int) Math.pow((y1 - y2), 2);

        return Math.sqrt(xd + yd);
    }

    public int squareCalculator() {
        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate = coordinates.getCoordinates().get(1);
        Coordinate thirdCoordinate = coordinates.getCoordinates().get(2);
        Coordinate fourthCoordinate = coordinates.getCoordinates().get(3);

        int x1 = firstCoordinate.getCoordinateArray().get(0);
        int y1 = firstCoordinate.getCoordinateArray().get(1);

        int x2 = secondCoordinate.getCoordinateArray().get(0);
        int y2 = secondCoordinate.getCoordinateArray().get(1);

        int x3 = thirdCoordinate.getCoordinateArray().get(0);
        int y3 = thirdCoordinate.getCoordinateArray().get(1);

        int x4 = fourthCoordinate.getCoordinateArray().get(0);
        int y4 = fourthCoordinate.getCoordinateArray().get(1);

        int width = x3 - x1;
        int height = y3 - y2;

        return width * height;
    }

    public double triangleCalculator() {
        // Math.sqrt(s(s-a)(s-b)(s-c));
        return 0;
    }


}
