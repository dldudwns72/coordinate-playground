package coordinate.domain;

import java.util.List;

public class Coordinates {
    private List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> coordinates){
        this.coordinates = coordinates;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

}
