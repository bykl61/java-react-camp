package validation;

import entities.LoginEntity;

public interface LoginValidation {
    boolean checkLogin(LoginEntity entity);
}
