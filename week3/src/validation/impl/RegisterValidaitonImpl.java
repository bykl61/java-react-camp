package validation.impl;

import entities.UserEntity;
import localDB.impl.LocalDatabaseImpl;
import validation.RegisterValidaiton;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterValidaitonImpl implements RegisterValidaiton {




    @Override
    public boolean checkName(UserEntity userEntity) {
        if (userEntity.getFirstName().length() < 2 || userEntity.getLastName().length() < 2)
            return true;
        return false;
    }

    @Override
    public boolean checkPassword(UserEntity userEntity) {
        if (userEntity.getPassword().length() < 6)
            return true;
        return false;
    }

    @Override
    public boolean checkEmailFormat(UserEntity userEntity) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userEntity.getEmail());
        return !matcher.matches();
    }

    @Override
    public boolean isExistEmail(UserEntity userEntity) {
        List<String> list = LocalDatabaseImpl.list();

        for (int i=0; i <list.size(); i++){
            if(list.get(i).equals(userEntity.getEmail()))
                System.out.println(list.get(i));
                return true;
        }

        return false;
    }
}
