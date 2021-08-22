package coordinatetest;

import coordinate.coordinateException;
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
        }).isInstanceOf(coordinateException.class);

    }

}
