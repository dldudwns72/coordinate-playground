package rentcompany.factorymethod;


import rentcompany.RentCompany;
import rentcompany.car.Car;

public abstract class RentCompanyFactory {
    public abstract RentCompany create();

    public abstract String generateReport();
}
