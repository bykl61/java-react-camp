package homework1.service.impl;

import homework1.service.CustomerCheckService;
import homework1.entities.impl.CustomerEntity;
import homework1.service.CustomerCRUDService;

public class CustomerCRUDServiceImpl implements CustomerCRUDService {


    private final CustomerCheckService customerCheckService;

    public CustomerCRUDServiceImpl(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void list() {
        System.out.println("Get all customers");
    }

    @Override
    public void create(CustomerEntity customerEntity) {
        if (customerCheckService.checkIfRealPerson(customerEntity))
        System.out.println(customerEntity.getName()+ " created");
        else
            System.out.println("Not a valid person");
    }

    @Override
    public void update(CustomerEntity customerEntity) {
        System.out.println(customerEntity.getName()+ " updated");
    }

    @Override
    public void delete(CustomerEntity customerEntity) {
        System.out.println(customerEntity.getName()+ " deleted");
    }
}
