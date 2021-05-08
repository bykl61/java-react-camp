package homework1.service;


import homework1.entities.impl.CampaingEntity;
import homework1.entities.impl.CustomerEntity;
import homework1.entities.impl.GameEntity;

public interface SellService {

    void sell(CustomerEntity customerEntity, GameEntity gameEntity);

    void discountSell(CustomerEntity customerEntity, GameEntity gameEntity, CampaingEntity campaingEntity,CampaingService campaingService);

}
