package com.learning.core.day4;

import java.util.Scanner;

public class D04P01 {
    public static class BankAccount {
        private int accNo;
        private String custName;
        private String accType;
        private float balance;

        public BankAccount(int accNo, String custName, String accType, float balance) throws LowBalanceException, NegativeAmountException {
            this.accNo = accNo;
            this.custName = custName;
            this.accType = accType;
            this.balance = balance;

            if (balance < 0) {
                throw new NegativeAmountException("NegativeAmount");
            }

            if (accType.equals("saving") && balance < 1000) {
                throw new LowBalanceException("lowBalance");
            } else if (accType.equals("current") && balance < 5000) {
                throw new LowBalanceException("LowBalance");
            }
        }

        public void deposit(float amt) {
            try {
                if (amt < 0) {
                    throw new NegativeAmountException("NegativeAmount");
                }
                balance += amt;
            } catch (NegativeAmountException e) {
                System.out.println(e.getMessage());
            }
        }

        public float getBalance() {
            try {
                if (balance < 1000 && accType.equals("saving")) {
                    throw new LowBalanceException("lowBalance");
                } else if (balance < 5000 && accType.equals("current")) {
                    throw new LowBalanceException("LowBalance");
                }
                return balance;
            } catch (LowBalanceException e) {
                System.out.println(e.getMessage());
                return 0; // Return 0 when balance is low
            }
        }
    }

    static class LowBalanceException extends Exception {
        public LowBalanceException(String message) {
            super(message);
        }
    }

    static class NegativeAmountException extends Exception {
        public NegativeAmountException(String message) {
            super(message);
        }
    }

    public static class Tester {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter account number, customer name (separated by space) : ");
            int accNo = scanner.nextInt();
            String custName = scanner.next();

            System.out.println("Enter account type (saving or current) , Initial balance (seperated by space) : ");
            String accType = scanner.next();

//            System.out.println("Enter initial balance:");
            float balance = scanner.nextFloat();

            BankAccount account = null;
            try {
                account = new BankAccount(accNo, custName, accType, balance);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }

            System.out.println("Enter amount to deposit:");
            float depositAmt = scanner.nextFloat();
            account.deposit(depositAmt);

            System.out.println("Current balance: " + account.getBalance());

            scanner.close();
        }
    }
}
