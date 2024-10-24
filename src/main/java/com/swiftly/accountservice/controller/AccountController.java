package com.swiftly.accountservice.controller;

import com.swiftly.accountservice.dto.AccountDto;
import com.swiftly.accountservice.dto.AccountUpdateDto;
import com.swiftly.accountservice.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // List all accounts
    @GetMapping("/")
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountDto> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    // Create a new account for a user
    @PostMapping("/create/{userId}")
    public ResponseEntity<AccountDto> createAccount(@PathVariable String userId) {
        AccountDto createdAccount = accountService.createAccount(userId);
        return ResponseEntity.ok(createdAccount);
    }

    // Retrieve account details
    @GetMapping("/details/{accountId}")
    public ResponseEntity<AccountDto> getAccountDetails(@PathVariable Long accountId) {
        AccountDto account = accountService.getAccountDetails(accountId);
        return ResponseEntity.ok(account);
    }

    // Update account information
    @PutMapping("/details/{accountId}")
    public ResponseEntity<AccountDto> updateAccount(@PathVariable Long accountId,
                                                    @RequestBody AccountUpdateDto accountUpdate) {
        AccountDto updatedAccount = accountService.updateAccount(accountId, accountUpdate);
        return ResponseEntity.ok(updatedAccount);
    }

    // Delete an account
    @DeleteMapping("/{accountId}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long accountId) {
        accountService.deleteAccount(accountId);
        return ResponseEntity.noContent().build();
    }

    // Get the current balance of an account
    @GetMapping("/{accountId}/balance")
    public ResponseEntity<Double> getAccountBalance(@PathVariable Long accountId) {
        Double balance = accountService.getAccountBalance(accountId);
        return ResponseEntity.ok(balance);
    }

    // Update the account balance
    @PatchMapping("/{accountId}/balance")
    public ResponseEntity<AccountDto> updateAccountBalance(@PathVariable Long accountId, @RequestBody Double newBalance) {
        AccountDto updatedAccount = accountService.updateAccountBalance(accountId, newBalance);
        return ResponseEntity.ok(updatedAccount);
    }
}

