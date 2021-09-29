package rentcompany;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rentcompany.car.Avante;
import rentcompany.car.K5;
import rentcompany.car.Sonata;
import rentcompany.factorymethod.RentCompanyFactory;

import static org.assertj.core.api.Assertions.assertThat;

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

        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();

        assertThat(report).isEqualTo("Sonata : 15리터,K5 : 20리터,Sonata : 12리터,Avante : 20리터,K5 : 30리터");

//
//        assertThat(report).isEqualTo(
//                "Sonata : 15리터" + NEWLINE +
//                        "K5 : 20리터" + NEWLINE +
//                        "Sonata : 12리터" + NEWLINE +
//                        "Avante : 20리터" + NEWLINE +
//                        "K5 : 30리터" + NEWLINE
//        );



    }
}
