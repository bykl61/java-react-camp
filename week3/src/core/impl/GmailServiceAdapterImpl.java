package core.impl;

import core.GmailServiceAdapter;
import entities.UserEntity;
import gmailService.GmailService;

public class GmailServiceAdapterImpl implements GmailServiceAdapter {
    GmailService gmailService = new GmailService();

    @Override
    public boolean register(String mail,String password){
        return true;
    }
    }

