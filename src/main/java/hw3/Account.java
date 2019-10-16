package src.main.java.hw3;

    class Account {

        double balance = 999999.99;

        void putCash (double amount) {
            this.balance = this.balance + amount;
        }

        void withdrawCash (double amount) {
            this.balance = this.balance - amount;
        }

        double getBalance () {
            //this.balance = this.balance;
            return balance;
        }

    }
