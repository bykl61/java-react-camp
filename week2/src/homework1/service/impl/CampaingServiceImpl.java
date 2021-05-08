package homework1.service.impl;

import homework1.entities.impl.CampaingEntity;
import homework1.entities.impl.GameEntity;
import homework1.service.CampaingService;

public class CampaingServiceImpl implements CampaingService {
    private final GameEntity gameEntity;
    private final CampaingEntity campaingEntity;

    public CampaingServiceImpl(GameEntity gameEntity, CampaingEntity campaingEntity) {
        this.gameEntity = gameEntity;
        this.campaingEntity = campaingEntity;
    }


    @Override
    public double calculateDiscount() {
        return gameEntity.getPrice() - (gameEntity.getPrice() * campaingEntity.getDiscount())/100;

    }
}
