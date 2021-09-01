package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class DistanceCalculator {

    public double lineCalculator(Coordinates coordinates) {
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

    public int squareCalculator(Coordinates coordinates) {
        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate = coordinates.getCoordinates().get(1);
        Coordinate thirdCoordinate = coordinates.getCoordinates().get(2);

        int x1 = firstCoordinate.getCoordinateArray().get(0);
        int y2 = secondCoordinate.getCoordinateArray().get(1);

        int x3 = thirdCoordinate.getCoordinateArray().get(0);
        int y3 = thirdCoordinate.getCoordinateArray().get(1);


        int width = x3 - x1;
        int height = y3 - y2;

        return width * height;
    }

    public double triangleCalculator(Coordinates coordinates) {

        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate = coordinates.getCoordinates().get(1);
        Coordinate thirdCoordinate = coordinates.getCoordinates().get(2);

        List<Coordinate> aPoint = new ArrayList<>();
        aPoint.add(firstCoordinate);
        aPoint.add(secondCoordinate);
        double a = lineCalculator(new Coordinates(aPoint));

        List<Coordinate> bPoint = new ArrayList<>();
        bPoint.add(thirdCoordinate);
        bPoint.add(firstCoordinate);
        double b = lineCalculator(new Coordinates(bPoint));

        List<Coordinate> cPoint = new ArrayList<>();
        cPoint.add(secondCoordinate);
        cPoint.add(thirdCoordinate);
        double c = lineCalculator(new Coordinates(cPoint));

        double s = (a + b + c) / 2;
        double triangleArea = Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 100) / 100;


        return triangleArea;
    }


}
