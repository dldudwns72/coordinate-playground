package coordinate.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coordinates {
    private List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> coordinates){
        this.coordinates = coordinates;
    }

    public Coordinates(Coordinate coordinate1, Coordinate coordinate2) {
        this.coordinates = new ArrayList<>();
        this.coordinates.add(coordinate1);
        this.coordinates.add(coordinate2);
    }

    public List<Coordinate> getCoordinates() {
        return Collections.unmodifiableList(coordinates);
    }

    public double calculator(){
        if(coordinates.size() == 2 ){
            return lineCalculator();
        }

        if(coordinates.size() == 3){
            return triangleCalculator();
        }

        return 0;
    }

    private double lineCalculator(){
        Coordinate firstCoordinate =  coordinates.get(0);
        Coordinate secondCoordinate = coordinates.get(1);

        int x1 = firstCoordinate.getX();
        int y1 = firstCoordinate.getY();

        int x2 = secondCoordinate.getX();
        int y2 = secondCoordinate.getY();

        int xd, yd;
        xd = (int) Math.pow((x1 - x2), 2);
        yd = (int) Math.pow((y1 - y2), 2);

        return Math.sqrt(xd + yd);
    }

    private double triangleCalculator() {

        Coordinate firstCoordinate = coordinates.get(0);
        Coordinate secondCoordinate = coordinates.get(1);
        Coordinate thirdCoordinate = coordinates.get(2);

        double a = new Coordinates(firstCoordinate,secondCoordinate).lineCalculator();

        double b = new Coordinates(firstCoordinate,thirdCoordinate).lineCalculator();

        double c = new Coordinates(secondCoordinate,thirdCoordinate).lineCalculator();

        double s = (a + b + c) / 2;
        double triangleArea = Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 100) / 100;

        return triangleArea;
    }


}
