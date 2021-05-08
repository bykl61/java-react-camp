package homework1.service.impl;

import homework1.entities.impl.GameEntity;
import homework1.service.GameCRUDService;

public class GameCRUDServiceImpl implements GameCRUDService {



    @Override
    public void list() {
        System.out.println("get all games");
    }

    @Override
    public void create(GameEntity gameEntity) {
        System.out.println(gameEntity.getName()+ " created");
    }

    @Override
    public void update(GameEntity gameEntity) {
        System.out.println(gameEntity.getName()+ " updated");
    }

    @Override
    public void delete(GameEntity gameEntity) {
        System.out.println(gameEntity.getName()+ " deleted");
    }
}
