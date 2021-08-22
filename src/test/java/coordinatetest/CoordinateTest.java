package coordinatetest;

import coordinate.coordinateException;
import coordinate.domain.Coordinate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CoordinateTest {

    @Test
    @DisplayName("좌표 생성 에러")
    public void generateCoordinateError() {
        assertThatThrownBy(() -> {
            String coordinateInput = "(10*10)";
            Coordinate coordinate = new Coordinate(coordinateInput);
        }).isInstanceOf(coordinateException.class);

    }

    @Test
    @DisplayName("좌표 생성")
    public void generateCoordinate() {
        String coordinateInput = "(10,10)";
        Coordinate coordinate = new Coordinate(coordinateInput);

        List<Integer> coordinateValue = coordinate.generate();

        assertThat(coordinateValue.get(0)).isEqualTo(10);
        assertThat(coordinateValue.get(1)).isEqualTo(10);

    }

}
