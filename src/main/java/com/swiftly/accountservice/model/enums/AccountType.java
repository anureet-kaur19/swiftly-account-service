package com.swiftly.accountservice.model.enums;

import lombok.Getter;

@Getter
public enum AccountType {
    CHECKING("Checking"),
    SAVINGS("Savings");

    private final String accountType;

    AccountType(String accountType) {this.accountType = accountType; }

}

