package validation;

import entities.LoginDTO;

public interface LoginValidation {
    boolean checkLogin(LoginDTO entity);
}
