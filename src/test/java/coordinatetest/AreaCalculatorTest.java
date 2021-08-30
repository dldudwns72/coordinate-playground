package coordinatetest;

import coordinate.domain.Coordinate;
import coordinate.domain.Coordinates;
import coordinate.domain.DistanceCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class AreaCalculatorTest {

    private List<Coordinate> coordinateList;

    private Coordinate firstCoordinate;
    private Coordinate secondCoordinate;
    private Coordinate thirdCoordinate;
    private Coordinate fourCoordinate;

    private Coordinates coordinates;

    @BeforeEach
    public void setUp() {

        firstCoordinate = new Coordinate("(1,1)");
        secondCoordinate = new Coordinate("(4,1)");
        thirdCoordinate = new Coordinate("(1,1)");
        fourCoordinate = new Coordinate("(4,4)");

        coordinateList = Arrays.asList(firstCoordinate,firstCoordinate,firstCoordinate,firstCoordinate);

        coordinates = new Coordinates(coordinateList);
    }


    @Test
    @DisplayName("사각형 거리 측정")
    public void SquareArea(){


    }
}
