package homework1.service.impl;

import homework1.entities.impl.CampaingEntity;
import homework1.entities.impl.CustomerEntity;
import homework1.entities.impl.GameEntity;
import homework1.service.CampaingService;
import homework1.service.SellService;

public class SellServiceImpl implements SellService {




    @Override
    public void sell(CustomerEntity customerEntity, GameEntity gameEntity) {
        System.out.println(customerEntity.getName() + " adlı kullanıcı " + gameEntity.getName() + " oyunu " +
                gameEntity.getPrice() + " 'na satın aldı");
    }

    @Override
    public void discountSell(CustomerEntity customerEntity,GameEntity gameEntity,CampaingEntity campaingEntity, CampaingService campaingService) {
        System.out.println(customerEntity.getName() + " adlı kullanıcı " +gameEntity.getName()
                + " oyunu yüzde "+campaingEntity.getDiscount()+"  ile "+ campaingService.calculateDiscount() +"'ye oyunu satın aldı");
    }
}
