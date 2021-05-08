package homework1.service;


import homework1.entities.impl.CampaingEntity;


public interface CampaingCRUDService  {
    void list();

    void create(CampaingEntity campaingEntity);

    void update(CampaingEntity campaingEntity);

    void delete(CampaingEntity campaingEntity);


}
