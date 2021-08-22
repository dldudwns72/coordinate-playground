package coordinate.domain;

import java.util.List;
import java.util.Objects;

public class Coordinates {
    private List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> coordinates){
        this.coordinates = coordinates;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

}
