# Bank Account Management System

A Java-based Bank Account Management System built using Object-Oriented Programming concepts.

## Features

- Create and manage multiple bank accounts
- Deposit money
- Withdraw money
- Check account balance
- Maintain minimum balance
- Track transaction history
- Validate transaction amounts
- Custom exception handling

## Concepts Used

- Java OOP
- Encapsulation
- Constructors
- ArrayList
- Exception Handling
- Custom Exceptions
- Collections

## Project Structure

```text
src/
└── bank/
    ├── Account.java
    ├── InvalidAmountException.java
    ├── InsufficientBalanceException.java
    └── Main.java

## Exception
-InvalidAmountException — handles zero or negative transaction amounts.
-InsufficientBalanceException — handles withdrawals that violate the minimum balance requirement.

## How to run
-Compile the Java files:
 javac bank/*.java
-Run the program:
 java bank.Main

## Status
-Completed and tested
