package homework1.service.impl;

import homework1.entities.impl.CustomerEntity;
import homework1.mernis.KNIKPSPublicSoap;
import homework1.service.CustomerCheckService;

import java.util.Locale;

public class CustomerCheckServiceImpl implements CustomerCheckService {

    private  KNIKPSPublicSoap knikpsPublicSoap = new KNIKPSPublicSoap();


    @Override
    public boolean checkIfRealPerson(CustomerEntity customer) {
        try {
            return knikpsPublicSoap.TCKimlikNoDogrula(customer.getTc(), customer.getName().toUpperCase(Locale.ROOT),
                    customer.getLastName().toUpperCase(Locale.ROOT),customer.getDate().getYear() );
        }catch (Exception e){
            return false;
        }

    }
}
