package com.swiftly.accountservice.service;

import com.swiftly.accountservice.dto.AccountDto;
import com.swiftly.accountservice.dto.AccountUpdateDto;

import java.util.List;

public interface AccountService {

    List<AccountDto> getAllAccounts();

    AccountDto createAccount(String userId);

    AccountDto getAccountDetails(Long accountId);

    AccountDto updateAccount(Long accountId, AccountUpdateDto accountUpdate);

    void deleteAccount(Long accountId);

    Double getAccountBalance(Long accountId);

    AccountDto updateAccountBalance(Long accountId, Double newBalance);

}

