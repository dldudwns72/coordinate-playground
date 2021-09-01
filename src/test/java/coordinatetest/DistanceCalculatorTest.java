package coordinatetest;

import coordinate.domain.Coordinate;
import coordinate.domain.Coordinates;
import coordinate.domain.DistanceCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class DistanceCalculatorTest {

    private List<Coordinate> coordinateList;

    private Coordinate firstCoordinate;
    private Coordinate secondCoordinate;

    private Coordinates coordinates;


    @BeforeEach
    public void setUp() {
        coordinateList = new ArrayList<>();

        firstCoordinate = new Coordinate("(10,10)");
        secondCoordinate = new Coordinate("(14,15)");

        coordinateList.add(firstCoordinate);
        coordinateList.add(secondCoordinate);

        coordinates = new Coordinates(coordinateList);
    }

    @Test
    @DisplayName("line 거리 측정")
    public void lineDistance(){
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double lineDistance = distanceCalculator.lineCalculator(coordinates);
        assertThat(lineDistance).isEqualTo(6.40,offset(0.2));

    }

}
