package rentcompany;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rentcompany.factorymethod.RentCompanyFactory;

/**
 * Sonata 2대 연비 : 10km/리터
 * Avante 1대 연비 : 15km/리터
 * K5 2대  연비 : 13km/리터
 * 이동거리를 입력 받아 필요한 연료량을 확인할 수 있는 보고서 생성
 */
public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    @DisplayName("이동거리를 받아 필요한 연료량 보고서")
    public void report() throws Exception {
        RentCompanyFactory rentCompanyFactory = new RentCompany();

        RentCompany company = rentCompanyFactory.create();

    }
}
