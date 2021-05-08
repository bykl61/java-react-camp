package homework0.service.impl;

import homework0.base.BaseAbstractCustomerService;
import homework0.entities.Customer;

public class NeroAbstractCustomerServiceImpl extends BaseAbstractCustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println(customer.getFirstName()+" saved to nero");
    }
}
