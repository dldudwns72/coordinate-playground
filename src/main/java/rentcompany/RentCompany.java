package rentcompany;


import rentcompany.factorymethod.RentCompanyFactory;

public class RentCompany extends RentCompanyFactory {

    public RentCompany create(){
        return new RentCompany();
    }
}
