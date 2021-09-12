package coordinate.domain;

public class DistanceCalculator {

    public double lineCalculator(Coordinates coordinates) {
        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate = coordinates.getCoordinates().get(1);

        int x1 = firstCoordinate.getX();
        int y1 = firstCoordinate.getY();

        int x2 = secondCoordinate.getX();
        int y2 = secondCoordinate.getY();

        int xd, yd;
        xd = (int) Math.pow((x1 - x2), 2);
        yd = (int) Math.pow((y1 - y2), 2);

        return Math.sqrt(xd + yd);
    }

    public int squareCalculator(Coordinates coordinates) {
        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate = coordinates.getCoordinates().get(1);
        Coordinate thirdCoordinate = coordinates.getCoordinates().get(2);

        int x1 = firstCoordinate.getX();
        int y2 = secondCoordinate.getY();

        int x3 = thirdCoordinate.getX();
        int y3 = thirdCoordinate.getY();


        int width = x3 - x1;
        int height = y3 - y2;

        return width * height;
    }

    public double triangleCalculator(Coordinates coordinates) {

        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate = coordinates.getCoordinates().get(1);
        Coordinate thirdCoordinate = coordinates.getCoordinates().get(2);

        double a = lineCalculator(new Coordinates(firstCoordinate,secondCoordinate));

        double b = lineCalculator(new Coordinates(thirdCoordinate,firstCoordinate));

        double c = lineCalculator(new Coordinates(secondCoordinate, thirdCoordinate));

        double s = (a + b + c) / 2;
        double triangleArea = Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 100) / 100;


        return triangleArea;
    }


}
