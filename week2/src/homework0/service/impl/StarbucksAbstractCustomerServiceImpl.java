package homework0.service.impl;

import homework0.base.BaseAbstractCustomerService;
import homework0.entities.Customer;
import homework0.service.CustomerCheckService;

public class StarbucksAbstractCustomerServiceImpl extends BaseAbstractCustomerService {

    private final CustomerCheckService customerCheckService;


    public StarbucksAbstractCustomerServiceImpl(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)){
            System.out.println(customer.getFirstName()+" saved to starbucks");
        }else{
            System.out.println("Not a valid person");
        }
    }
}
