package homework1.service.impl;

import homework1.entities.impl.CampaingEntity;
import homework1.service.CampaingCRUDService;

public class CampaingCRUDServiceImpl implements CampaingCRUDService {


    @Override
    public void list() {
        System.out.println("get all campaing");
    }

    @Override
    public void create(CampaingEntity campaingEntity) {
        System.out.println(campaingEntity.getName()+ " created");
    }

    @Override
    public void update(CampaingEntity campaingEntity) {
        System.out.println(campaingEntity.getName()+ " updated");
    }

    @Override
    public void delete(CampaingEntity campaingEntity) {
        System.out.println(campaingEntity.getName()+ " deleted");
    }
}
