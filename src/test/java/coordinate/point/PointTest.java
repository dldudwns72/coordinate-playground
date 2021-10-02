package coordinate.point;

import coordinate.point.exception.PointException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class PointTest {

    @Test
    @DisplayName("x,y 좌표 생성")
    public void createPoint(){
        Point xPoint = new Point(10);
        Point yPoint = new Point(10);

        assertThat(xPoint.getPoint()).isEqualTo(10);
        assertThat(yPoint.getPoint()).isEqualTo(10);
    }

    @Test
    @DisplayName("point 가 0미만 24 초과일 경우 에러 발생")
    public void validCreatePoint(){
        assertThatThrownBy(()->{
            Point xPoint = new Point(-1);
            Point yPoint = new Point(25);
        }).isInstanceOf(PointException.class);

    }

}
