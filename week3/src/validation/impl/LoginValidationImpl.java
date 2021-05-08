package validation.impl;

import entities.LoginEntity;
import localDB.impl.LocalDatabaseImpl;
import validation.LoginValidation;

public class LoginValidationImpl implements LoginValidation {
    @Override
    public boolean checkLogin(LoginEntity entity) {
        LocalDatabaseImpl.list();
        return false;
    }
}
