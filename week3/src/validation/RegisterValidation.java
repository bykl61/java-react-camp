package validation;

import entities.UserEntity;

public interface RegisterValidation extends BaseRegisterValidation{

    boolean checkName(UserEntity userEntity);

    boolean checkPassword(UserEntity userEntity);

    boolean checkEmailFormat(UserEntity userEntity);

    boolean isExistEmail(UserEntity userEntity);

}
