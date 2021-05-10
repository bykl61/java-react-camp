package validation.impl;

import entities.LoginDTO;
import localDB.LocalDatabaseImpl;
import validation.LoginValidation;

import java.util.HashMap;

public class LoginValidationImpl implements LoginValidation {
    @Override
    public boolean checkLogin(LoginDTO entity) {
        HashMap<String,String> list = LocalDatabaseImpl.list();
        if(list.containsKey(entity.getEmail()) && list.containsValue(entity.getPassword()))
            return false;
        return true;
    }
}
