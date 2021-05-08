package service.impl;

import entities.UserEntity;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;
import validation.RegisterValidaiton;
import validation.impl.RegisterValidaitonImpl;

public class UserServiceImpl implements UserService {

    private final RegisterValidaiton validation = new RegisterValidaitonImpl();
    private  UserRepository userRepository = new UserRepositoryImpl();


    @Override
    public void list() {

    }

    @Override
    public void create(UserEntity userEntity) {
        if (validation.checkName(userEntity))
            System.out.println("İsim ve Soyisim 2 karakterden kısa olamaz");
        else if(validation.checkPassword(userEntity))
            System.out.println("Paralo 6 karakterden kısa olamaz");
        else if (validation.checkEmailFormat(userEntity))
             System.out.println("Email formatı yanlış");
        else if (validation.isExistEmail(userEntity))
            System.out.println("Bu email zaten sisteme kayıtlı");
        else
            userRepository.create(userEntity);

    }

    @Override
    public void update(UserEntity userEntity) {

    }

    @Override
    public void delete(UserEntity userEntity) {

    }
}
