package homework0.service.impl;

import homework0.entities.Customer;
import homework0.mernis.LONKPSPublicSoap;
import homework0.service.CustomerCheckService;

import java.util.Date;
import java.util.Locale;

public class CustomerCheckServiceImpl implements CustomerCheckService {
    private LONKPSPublicSoap ibskpsPublicSoap = new LONKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        try {
            return ibskpsPublicSoap.TCKimlikNoDogrula(customer.getTc(), customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), customer.getBirth().getYear());

        } catch (Exception e) {
            return false;
        }


    }
}
