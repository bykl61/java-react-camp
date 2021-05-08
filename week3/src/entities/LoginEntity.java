package entities;

import base.BaseAbstractEntity;

public class LoginEntity extends BaseAbstractEntity {


    public LoginEntity() {
    }

    public LoginEntity(String email, String password) {
        super(email, password);
    }
}
