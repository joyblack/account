package com.zhaoyi.account.service;

import com.zhaoyi.account.email.SendEmailService;
import com.zhaoyi.account.persist.StoreService;

public class AccountServiceImpl implements AccountService {
    private SendEmailService sendEmailService;

    private StoreService storeService;

    public void setSendEmailService(SendEmailService sendEmailService) {
        this.sendEmailService = sendEmailService;
    }

    public void setStoreService(StoreService storeService) {
        this.storeService = storeService;
    }

    public void send() {
        sendEmailService.send();
    }

    public void store() {
        storeService.store();
    }
}
