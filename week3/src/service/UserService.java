package service;

import entities.UserEntity;

public interface UserService {
    void list();

    void create(UserEntity userEntity);

    void update(UserEntity userEntity);

    void delete(UserEntity userEntity);
}
