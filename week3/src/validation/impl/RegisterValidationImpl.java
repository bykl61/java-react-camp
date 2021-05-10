package validation.impl;

import entities.UserEntity;
import localDB.LocalDatabaseImpl;
import validation.RegisterValidation;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterValidationImpl implements RegisterValidation {


    @Override
    public boolean checkName(UserEntity userEntity) {
        if (userEntity.getFirstName().length() >= 2 && userEntity.getLastName().length() >= 2)
            return true;
        System.out.println("İsim ve Soyisim en az iki karakterden oluşmalı");
        return false;
    }

    @Override
    public boolean checkPassword(UserEntity userEntity) {
        if (userEntity.getPassword().length() >= 6)
            return true;
        System.out.println("İsim ve Soyisim en az iki karakterden oluşmalı");
        return false;
    }

    @Override
    public boolean checkEmailFormat(UserEntity userEntity) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userEntity.getEmail());
        if (matcher.matches())
            return true;
        System.out.println("Girilen mail formatı yanlış");
        return false;
    }

    @Override
    public boolean isExistEmail(UserEntity userEntity) {
        HashMap<String, String> list = LocalDatabaseImpl.list();
        if (list.containsKey(userEntity.getEmail())) {
            System.out.println("Bu mail zaten kayıtlı");
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAll(UserEntity userEntity) {

        return checkName(userEntity) && checkPassword(userEntity)
                && checkEmailFormat(userEntity) && !isExistEmail(userEntity);

    }
}
