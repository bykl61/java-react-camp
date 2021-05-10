package validation.impl;

import core.GmailServiceAdapter;
import core.impl.GmailServiceAdapterImpl;
import entities.UserEntity;
import validation.GmailValidation;

public class GmailValidationImpl implements GmailValidation {
    GmailServiceAdapter gmailServiceAdapter = new GmailServiceAdapterImpl();
    @Override
    public boolean checkAll(UserEntity userEntity) {
      return gmailServiceAdapter.register(userEntity.getEmail(), userEntity.getPassword());
    }
}
