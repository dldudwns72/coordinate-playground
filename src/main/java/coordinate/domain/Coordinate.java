package coordinate.domain;

import coordinate.exception.coordinateException;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {

    private String coordinate;

    public Coordinate(String coordinate) {
        valid(coordinate);
        this.coordinate = coordinate;
    }

    private void valid(String coordinate) {
        if (!coordinate.contains("(") || !coordinate.contains(")") || !coordinate.contains(",")) {
            throw new coordinateException("`(`, `)`, `,` 특수문자를 제외한 특수문자는 사용할 수 없습니다.");
        }
    }

    public List<Integer> generate() {
        List<Integer> coordinateArray = new ArrayList<>();

        int x = Integer.parseInt(coordinate.substring(coordinate.indexOf("(") + 1, coordinate.indexOf(",")));
        int y = Integer.parseInt(coordinate.substring(coordinate.indexOf(",") + 1, coordinate.indexOf(")")));

        coordinateArray.add(x);
        coordinateArray.add(y);

        return coordinateArray;
    }

    public String getCoordinate() {
        return coordinate;
    }
}
