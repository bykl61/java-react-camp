package homework1.service;


import homework1.entities.impl.GameEntity;

public interface GameCRUDService  {

    void list();

    void create(GameEntity gameEntity);

    void update(GameEntity gameEntity);

    void delete(GameEntity gameEntity);

}
