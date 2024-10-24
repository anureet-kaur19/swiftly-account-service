package com.swiftly.accountservice.model.enums;

import lombok.Getter;

@Getter
public enum AccountStatus {
    NEW("New"),
    ACTIVE("Active"),
    CLOSED("Closed");

    private final String accountStatus;

    AccountStatus(String accountStatus) {this.accountStatus = accountStatus; }

}

