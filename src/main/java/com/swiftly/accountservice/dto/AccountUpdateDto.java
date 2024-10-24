package com.swiftly.accountservice.dto;

import com.swiftly.accountservice.model.enums.AccountStatus;
import com.swiftly.accountservice.model.enums.AccountType;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountUpdateDto {

    @NotBlank
    private AccountType accountType;

    @NotBlank
    private AccountStatus accountStatus;

}

