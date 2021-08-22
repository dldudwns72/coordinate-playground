package coordinatetest;

import coordinate.domain.Coordinate;
import coordinate.domain.Coordinates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CoordinatesTest {

    private List<Coordinate> coordinateList;

    private Coordinate firstCoordinate;
    private Coordinate secondCoordinate;

    @BeforeEach
    public void setUp() {
        coordinateList = new ArrayList<>();

        firstCoordinate = new Coordinate("(10,10)");
        secondCoordinate = new Coordinate("(14,15)");

        coordinateList.add(firstCoordinate);
        coordinateList.add(secondCoordinate);


    }

    @Test
    @DisplayName("Coordinates 생성")
    public void generateCoordinates() {
        Coordinates coordinates = new Coordinates(coordinateList);

        coordinates.getCoordinates().get(0).getCoordinate().equals("(10,10)");
        coordinates.getCoordinates().get(1).getCoordinate().equals("(14,15)");

    }
}
