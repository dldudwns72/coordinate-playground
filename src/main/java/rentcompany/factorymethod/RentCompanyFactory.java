package rentcompany.factorymethod;

import rentcompany.RentCompany;

public abstract class RentCompanyFactory {
    public abstract RentCompany create();

    public abstract String generateReport();
}
