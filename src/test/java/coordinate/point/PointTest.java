package coordinate.point;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PointTest {

    @Test
    @DisplayName("x,y 좌표 생성")
    public void createPoint(){
        Point xPoint = new Point(10);
        Point yPoint = new Point(10);

        assertThat(xPoint.getPoint()).isEqualTo(10);
        assertThat(yPoint.getPoint()).isEqualTo(10);

    }


}
