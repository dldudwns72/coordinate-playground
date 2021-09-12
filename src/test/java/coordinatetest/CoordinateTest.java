package coordinatetest;

import coordinate.exception.CoordinateException;
import coordinate.domain.Coordinate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CoordinateTest {

    @Test
    @DisplayName("좌표 생성 에러")
    public void generateCoordinateError() {
        assertThatThrownBy(() -> {
            String coordinateInput = "(10*10)";
            Coordinate coordinate = new Coordinate(coordinateInput);
        }).isInstanceOf(CoordinateException.class);
    }

    @Test
    @DisplayName("좌표 생성 에러")
    public void generateCoordinateRangeError() {
        assertThatThrownBy(() -> {
            String coordinateInput = "(10,30)";
            Coordinate coordinate = new Coordinate(coordinateInput);
        }).isInstanceOf(CoordinateException.class);
    }


    @Test
    @DisplayName("좌표 생성")
    public void generateCoordinate() {
        String coordinateInput = "(10,10)";
        Coordinate coordinate = new Coordinate(coordinateInput);

        assertThat(coordinate.getX()).isEqualTo(10);
        assertThat(coordinate.getY()).isEqualTo(10);

    }

}
