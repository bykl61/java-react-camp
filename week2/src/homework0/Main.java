package homework0;

import homework0.base.BaseAbstractCustomerService;
import homework0.entities.Customer;
import homework0.service.impl.CustomerCheckServiceImpl;
import homework0.service.impl.NeroAbstractCustomerServiceImpl;
import homework0.service.impl.StarbucksAbstractCustomerServiceImpl;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer abdurrahman = new Customer("abdurrahman","osman",12345678978L,new Date(2001,12,1));
        Customer mehmet = new Customer("mehmet","baykal",12345678910L,new Date(1994,10,1));

        BaseAbstractCustomerService abdurrahmanService = new NeroAbstractCustomerServiceImpl();
        BaseAbstractCustomerService mehmetService = new StarbucksAbstractCustomerServiceImpl(new CustomerCheckServiceImpl());
        abdurrahmanService.save(abdurrahman);
        mehmetService.save(mehmet);
        
    }
}
