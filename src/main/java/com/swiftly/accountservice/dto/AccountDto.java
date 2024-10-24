package com.swiftly.accountservice.dto;

import com.swiftly.accountservice.model.enums.AccountStatus;
import com.swiftly.accountservice.model.enums.AccountType;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {

    @NotBlank
    private String accountId;

    @NotBlank
    private AccountType accountType;

    @NotBlank
    private Double balance;

    @NotBlank
    private AccountStatus accountStatus;

}

