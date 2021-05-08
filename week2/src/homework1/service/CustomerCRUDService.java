package homework1.service;



import homework1.entities.impl.CustomerEntity;


public interface CustomerCRUDService  {
    void list();

    void create(CustomerEntity customerEntity);

    void update(CustomerEntity customerEntity);

    void delete(CustomerEntity customerEntity);

}
