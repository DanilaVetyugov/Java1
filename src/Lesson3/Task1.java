package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while (true){
//Запустить игру
            playGame();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner scanner = new Scanner(System.in);
            int tryGame = scanner.nextInt();
            if (tryGame == 0){
                break;
            }

            //Если 0 - выйти из бесконечного цикла
            //Если 1 - ничего не делать

        }
    }



    public static void playGame(){
        Random rand = new Random();
        int numPC = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        System.out.println(numPC);
        System.out.print("Угадай число от 0 до 9 ");
        for (int i = 0; i < 3; i++) {
            System.out.println("номер попытки - " + (i+1));

            int numUser = scanner.nextInt();
            if (numUser != numPC){
                System.out.print("Неправильно. ");
                if (numUser> numPC){
                    System.out.println("Загаданное число меньше.");
                }else {
                    System.out.println("Загаданное число больше.");
                }
            }else {
                done = true;
                break;
            }
        }
        if (done  == true){
            System.out.println("Ты угадал число" + numPC );
        }else{
            System.out.println("Ты не угадал число" + numPC );
        }

    }
}
