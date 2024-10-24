package com.swiftly.accountservice.service.impl;

import com.swiftly.accountservice.dto.AccountDto;
import com.swiftly.accountservice.dto.AccountUpdateDto;
import com.swiftly.accountservice.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public List<AccountDto> getAllAccounts() {
        return null;
    }

    @Override
    public AccountDto createAccount(String userId) {
        return null;
    }

    @Override
    public AccountDto getAccountDetails(Long accountId) {
        return null;
    }

    @Override
    public AccountDto updateAccount(Long accountId, AccountUpdateDto accountUpdate) {
        return null;
    }

    @Override
    public void deleteAccount(Long accountId) {

    }

    @Override
    public Double getAccountBalance(Long accountId) {
        return null;
    }

    @Override
    public AccountDto updateAccountBalance(Long accountId, Double newBalance) {
        return null;
    }
}
