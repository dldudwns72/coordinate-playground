package coordinate.domain;

import coordinate.exception.CoordinateException;

public class Coordinate {

    private CoordinateX x;
    private CoordinateY y;

    public Coordinate(String coordinate) {
        valid(coordinate);
        x = new CoordinateX(coordinate);
        y = new CoordinateY(coordinate);
    }

    private void valid(String coordinate) {
        if (!coordinate.contains("(") || !coordinate.contains(")") || !coordinate.contains(",")) {
            throw new CoordinateException("`(`, `)`, `,` 특수문자를 제외한 특수문자는 사용할 수 없습니다.");
        }
    }

    public int getX() {
        return x.getX();
    }

    public int getY() {
        return y.getY();
    }
}
