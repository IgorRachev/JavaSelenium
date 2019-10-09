package hw1;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int random = new Random().nextInt(100);
        System.out.println("Добро пожаловать в игру 'Горячо-Холодно'");
        System.out.println("Попробуйте угадать число от 1 до 100");
        int prevScanNumber = sc.nextInt();
        int currentNumber = prevScanNumber;

        while (currentNumber !=random) {
            System.out.println("Введите число и нажмите Enter ");
//            System.out.println(random);
            currentNumber = sc.nextInt();
            if (random == currentNumber) {
                System.out.println("Успех!");
                break;
            }

            if (Math.abs(currentNumber - random) < Math.abs(prevScanNumber - random))
                System.out.print("Горячо!\n");
            else if (Math.abs(prevScanNumber - random) < Math.abs(currentNumber - random))
                System.out.print("Холодно!\n");
            prevScanNumber = currentNumber;
        }
    }
}

