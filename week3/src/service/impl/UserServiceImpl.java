package service.impl;

import entities.UserEntity;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.EmailVerification;
import service.UserService;
import validation.BaseRegisterValidation;

public class UserServiceImpl implements UserService {

    private final BaseRegisterValidation validation;
    private final UserRepository userRepository = new UserRepositoryImpl();
    private final EmailVerification mailValidaiton = new EmailVerificationImpl();

    public UserServiceImpl(BaseRegisterValidation validation) {
        this.validation = validation;
    }

    @Override
    public void list() {

    }

    @Override
    public void create(UserEntity userEntity) {
        if (!validation.checkAll(userEntity))
            System.out.println("Tekrar Deneyiniz...");
        else{
            mailValidaiton.sendMailValidation();
            userRepository.create(userEntity);
            System.out.println("Başarılı bir şekilde kayıt olundu");
        }


    }

    @Override
    public void update(UserEntity userEntity) {

    }

    @Override
    public void delete(UserEntity userEntity) {

    }
}
