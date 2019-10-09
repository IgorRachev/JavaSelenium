package hw1;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Добро пожаловать в игру 'Горячо-Холодно'");


        System.out.println("Попробуйте угадать число от 1 до 100");

        int random = new Random().nextInt(100);
        int prevScanNumber = 0;

        while (true) {
            System.out.println("Введите число: ");
            System.out.println(random);
            int currentNumber = sc.nextInt();

            if (prevScanNumber == 0) {
                prevScanNumber = currentNumber;
                continue;
            }
                if (random == currentNumber) {
                    System.out.println("Успех!");
                    break;
                }
                if (Math.abs(currentNumber - random) > Math.abs(currentNumber - random)) {
                    System.out.println("Горячо!");
                } else if (Math.abs(currentNumber - random) < Math.abs(currentNumber - random)) {
                    System.out.println("Холодно!");
                }
                //prevScanNumber = currentNumber;
            }
    }
}

