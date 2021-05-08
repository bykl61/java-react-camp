package repository;

import entities.UserEntity;

public interface UserRepository {
    void list();

    void create(UserEntity userEntity);

    void update(UserEntity userEntity);

    void delete(UserEntity userEntity);
}
