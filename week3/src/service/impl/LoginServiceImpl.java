package service.impl;

import entities.LoginDTO;
import service.LoginService;
import validation.LoginValidation;
import validation.impl.LoginValidationImpl;

public class LoginServiceImpl implements LoginService {
    private LoginValidation loginValidation = new LoginValidationImpl();
    @Override
    public void login(LoginDTO entity) {
        if (loginValidation.checkLogin(entity))
            System.out.println("Kullanıcı adı veya şifre yanlış");
        else
            System.out.println("Giriş Başarılı");
    }
}
