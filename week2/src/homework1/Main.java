package homework1;

import homework1.entities.impl.CampaingEntity;
import homework1.entities.impl.CustomerEntity;
import homework1.entities.impl.GameEntity;
import homework1.service.impl.CampaingServiceImpl;
import homework1.service.impl.CustomerCRUDServiceImpl;
import homework1.service.impl.CustomerCheckServiceImpl;
import homework1.service.impl.SellServiceImpl;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        CustomerEntity customer =
                new CustomerEntity(1,"Mehmet","Baykal",12345678101L,new Date(1990,2,2));


        GameEntity game = new GameEntity(1,"GTA 6",1000,"Adventure");


        CustomerCRUDServiceImpl customerCRUDService = new CustomerCRUDServiceImpl(new CustomerCheckServiceImpl());
        customerCRUDService.create(customer);
        customerCRUDService.update(customer);
        customerCRUDService.list();

        CampaingEntity perfectCampaing = new CampaingEntity();
        perfectCampaing.setName("Perfect Campaing");
        perfectCampaing.setDiscount(50);

        CampaingServiceImpl campaingService = new CampaingServiceImpl(game,perfectCampaing);

        SellServiceImpl sellService = new SellServiceImpl();
        sellService.sell(customer,game);
        sellService.discountSell(customer,game,perfectCampaing,campaingService);





    }
}
