package coordinate.domain;

import coordinate.exception.CoordinateException;

public class CoordinateY {

    private static final int MAX_COORDINATE = 24;
    private static final int MIN_COORDINATE = 0;

    private int y;

    public CoordinateY(int y){
        valid(y);
        this.y = y;
    }

    public CoordinateY(String coordinate){
        this(Integer.parseInt(coordinate.substring(coordinate.indexOf(",") + 1, coordinate.indexOf(")"))));
    }

    private void valid(int y){
        if (y < MIN_COORDINATE || y > MAX_COORDINATE) {
            throw new CoordinateException("Y 좌표의 범위는 0초과 24미만이여야 한다.");
        }
    }

    public int getY() {
        return y;
    }
}
