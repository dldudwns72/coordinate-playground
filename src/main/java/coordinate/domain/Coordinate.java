package coordinate.domain;

import coordinate.exception.coordinateException;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {

    private String coordinate;
    List<Integer> coordinateArray;

    private CoordinateX x;
    private CoordinateY y;

    public Coordinate(String coordinate) {
        valid(coordinate);

        int xCoordinate = Integer.parseInt(coordinate.substring(coordinate.indexOf("(") + 1, coordinate.indexOf(",")));
        int yCoordinate = Integer.parseInt(coordinate.substring(coordinate.indexOf(",") + 1, coordinate.indexOf(")")));

        x = new CoordinateX(xCoordinate);
        y = new CoordinateY(yCoordinate);

        coordinateArray = new ArrayList<>();

        coordinateArray.add(x.getX());
        coordinateArray.add(y.getY());

        this.coordinate = coordinate;
    }

    private void valid(String coordinate) {
        if (!coordinate.contains("(") || !coordinate.contains(")") || !coordinate.contains(",")) {
            throw new coordinateException("`(`, `)`, `,` 특수문자를 제외한 특수문자는 사용할 수 없습니다.");
        }
    }

    public String getCoordinate() {
        return coordinate;
    }

    public List<Integer> getCoordinateArray() {
        return coordinateArray;
    }
}
