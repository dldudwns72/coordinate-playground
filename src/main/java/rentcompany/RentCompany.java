package rentcompany;

import rentcompany.car.Avante;
import rentcompany.car.Car;

import rentcompany.car.K5;
import rentcompany.car.Sonata;
import rentcompany.factorymethod.RentCompanyFactory;

import java.util.ArrayList;
import java.util.List;

public class RentCompany extends RentCompanyFactory {

    public RentCompany create() {
        return new RentCompany();
    }

    private List<String> calculatorResult = new ArrayList<>();

    public void addCar(Avante avante) {
        String carName = avante.getName();
        int chargeQuantity = (int) avante.getChargeQuantity();
        calculatorResult.add(carName + " : " + chargeQuantity + "리터");
    }

    public void addCar(K5 k5) {
        String carName = k5.getName();
        int chargeQuantity = (int) k5.getChargeQuantity();
        calculatorResult.add(carName + " : " + chargeQuantity + "리터");
    }

    public void addCar(Sonata sonata) {
        String carName = sonata.getName();
        int chargeQuantity = (int) sonata.getChargeQuantity();
        calculatorResult.add(carName + " : " + chargeQuantity + "리터");
    }

    @Override
    public String generateReport() {
        String result = String.join(",", calculatorResult);
        return result;
    }

}
