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

public class TriangleCalculatorTest {

    private List<Coordinate> coordinateList;

    private Coordinate firstCoordinate;
    private Coordinate secondCoordinate;
    private Coordinate thirdCoordinate;

    private Coordinates coordinates;

    @BeforeEach
    public void setUp() {
        coordinateList = new ArrayList<>();

        firstCoordinate = new Coordinate("(10,10)");
        secondCoordinate = new Coordinate("(14,15)");
        thirdCoordinate = new Coordinate("(20,8)");

        coordinateList.add(firstCoordinate);
        coordinateList.add(secondCoordinate);
        coordinateList.add(thirdCoordinate);

        coordinates = new Coordinates(coordinateList);
    }

    @Test
    @DisplayName("삼각형 면적 측정")
    public void triangleDistance(){
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double lineDistance = distanceCalculator.triangleCalculator(coordinates);
        assertThat(lineDistance).isEqualTo(29.0,offset(0.2));
    }

}
