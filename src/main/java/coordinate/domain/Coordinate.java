package coordinate.domain;

import coordinate.coordinateException;

public class Coordinate {

    private String coordinate;

    public Coordinate(String coordinate){
        valid(coordinate);
        this.coordinate = coordinate;
    }

    private void valid(String coordinate){
        if(!coordinate.contains("(") || !coordinate.contains(")") || !coordinate.contains(",")){
            throw new coordinateException("`(`, `)`, `,` 특수문자를 제외한 특수문자는 사용할 수 없습니다.");
        }
    }

}
