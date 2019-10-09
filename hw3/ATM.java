package hw3;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Текущий баланс " + account.getBalance());

        System.out.println("Введите сумму пополнения");
        double cashAmount = sc.nextDouble();
        account.putCash(cashAmount);

        System.out.println("Текущий баланс " + account.getBalance());

        System.out.println("Введите сумму снятия");
        double cashAmount = sc.nextDouble();
        account.withdrawCash(cashAmount);

        System.out.println("Текущий баланс " + account.getBalance());

    }


}
