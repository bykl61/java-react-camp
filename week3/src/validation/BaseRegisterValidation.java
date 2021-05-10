package validation;

import entities.UserEntity;

public interface BaseRegisterValidation {
    boolean checkAll(UserEntity userEntity);
}
