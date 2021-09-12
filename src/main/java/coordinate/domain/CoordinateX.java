package coordinate.domain;

import coordinate.exception.CoordinateException;

public class CoordinateX {

    private static final int MAX_COORDINATE = 24;
    private static final int MIN_COORDINATE = 0;

    private int x;

    public CoordinateX(int x){
        valid(x);
        this.x = x;
    }

    public CoordinateX(String coordinate){
        this(Integer.parseInt(coordinate.substring(coordinate.indexOf("(") + 1, coordinate.indexOf(","))));
    }


    private void valid(int x){
        if (x < MIN_COORDINATE || x > MAX_COORDINATE) {
            throw new CoordinateException("X 좌표의 범위는 0초과 24미만이여야 한다.");
        }
    }

    public int getX() {
        return x;
    }
}
