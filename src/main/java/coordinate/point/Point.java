package coordinate.point;

import coordinate.point.exception.PointException;

public class Point {
    private int point;

    public Point(int point){
        rangeValid(point);
        this.point = point;

    }

    private void rangeValid(int point) {
        if(point < 0 || point > 24){
            throw new PointException("포인트는 0이상 24이상이여야만 합니다.");
        }
    }

    public int getPoint() {
        return point;
    }
}
