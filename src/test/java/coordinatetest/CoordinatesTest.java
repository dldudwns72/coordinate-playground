package coordinatetest;

import coordinate.domain.Coordinate;
import coordinate.domain.Coordinates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class CoordinatesTest {

    private Coordinates coordinates;

    private Coordinate firstCoordinate;
    private Coordinate secondCoordinate;
    private Coordinate thirdCoordinate;

    @Test
    @DisplayName("Coordinates 생성")
    public void generateCoordinates() {

        firstCoordinate = new Coordinate("(10,10)");
        secondCoordinate = new Coordinate("(14,15)");

        coordinates = new Coordinates(Arrays.asList(firstCoordinate,secondCoordinate));

        assertThat(coordinates.getCoordinates().get(0).getX()).isEqualTo(10);
        assertThat(coordinates.getCoordinates().get(0).getY()).isEqualTo(10);

        assertThat(coordinates.getCoordinates().get(1).getX()).isEqualTo(14);
        assertThat(coordinates.getCoordinates().get(1).getY()).isEqualTo(15);
    }

    @Test
    @DisplayName("Coordinates 계산기")
    public void lineCalculatorTest() {
        firstCoordinate = new Coordinate("(10,10)");
        secondCoordinate = new Coordinate("(14,15)");

        coordinates = new Coordinates(Arrays.asList(firstCoordinate,secondCoordinate));

        double result = coordinates.calculator();
        assertThat(result).isEqualTo(6.40,offset(0.2));
    }

    @Test
    @DisplayName("Coordinates 계산기")
    public void triangleCalculatorTest() {
        firstCoordinate = new Coordinate("(10,10)");
        secondCoordinate = new Coordinate("(14,15)");
        thirdCoordinate = new Coordinate("(20,8)");

        coordinates = new Coordinates(Arrays.asList(firstCoordinate,secondCoordinate,thirdCoordinate));

        double result = coordinates.calculator();
        assertThat(result).isEqualTo(29.0,offset(0.2));
    }


}
