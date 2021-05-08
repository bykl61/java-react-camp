package homework1.service;


import homework1.entities.impl.CustomerEntity;

public interface CustomerCheckService {
    boolean checkIfRealPerson(CustomerEntity customer);
}
