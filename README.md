# swiftly-account-service
Manage accounts linked to users, including account creation, retrieving account details, and balance management.

## APIs
Note: base endpoint: /api/accounts

### GET /
Purpose: List all accounts.
Description: Retrieves a list of all accounts, optionally filtered by user or account type.

### POST /create
* Purpose: Create a new account for a user.
* Description: Sets up a new financial account (e.g., checking or savings) linked to a user.

### GET /details/{accountId}
* Purpose: Retrieve account details.
* Description: Fetches information about a specific account, such as account type, balance, and status.

### PUT /details/{accountId}
* Purpose: Update account information.
* Description: Modifies account details, such as changing the account status (e.g., active, closed).

### DELETE /{accountId}
* Purpose: Delete an account.
* Description: Removes an account from the system.

### GET /{accountId}/balance
* Purpose: Get the current balance of an account.
* Description: Returns the available balance of the specified account.

### PATCH /{accountId}/balance
* Purpose: Update the account balance.
* Description: Manually adjusts the account balance (e.g., for corrections or adjustments).
