package repository.impl;

import entities.UserEntity;
import localDB.LocalDatabaseImpl;
import repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void list() {
        System.out.println("all users brought ");
    }

    @Override
    public void create(UserEntity userEntity) {
        LocalDatabaseImpl.save(userEntity);
    }

    @Override
    public void update(UserEntity userEntity) {
        System.out.println(userEntity.getFirstName() +" updated to db");
    }

    @Override
    public void delete(UserEntity userEntity) {
        System.out.println(userEntity.getFirstName() +" deleted to db");
    }
}
