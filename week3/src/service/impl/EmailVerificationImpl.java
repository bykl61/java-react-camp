package service.impl;

import service.EmailVerification;

public class EmailVerificationImpl implements EmailVerification {
    @Override
    public void sendMailValidation() {
        System.out.println("Doğrulama Maili Gönderildi");
        System.out.println("Mail Doğrulandı");
    }
}
