package validation;

import entities.UserEntity;

public interface RegisterValidaiton {

    boolean checkName(UserEntity userEntity);

    boolean checkPassword(UserEntity userEntity);

    boolean checkEmailFormat(UserEntity userEntity);

    boolean isExistEmail(UserEntity userEntity);
}
