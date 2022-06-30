package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static char[][] map;//массив
    public static final int SIZE = 3; //Размер поля
    public static final int WIN_SIZE = 3; //словие победы
    public static final char DOT_EMPTY = '*';//Пустое поле
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        createMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin((DOT_X))) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            itTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интелект");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Игра закончена");
    }


    /**
     * Создаём и запоняем  массив символами пустого поля
     */
    public static void createMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; i++) {
                if (map[i][j] == DOT_EMPTY) return false;

            }
        }
        System.out.println("Ничья");
        return true;
    }

    /**
     * Вывод в коноль масива заполненного символами пустого поля и нумерация по горезонтали и вертикали
     */
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i  + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Проверяет возможность установки X O в указанную ячейку
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    /**
     * Ход человека
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в форме X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    /**
     * Ход компьютера
     */
    public static void itTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /**
     * Проверка победы
     */
    public static boolean checkWin(char symb) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (symb == map[i][j]) {
                    count++;
                }

            }
            if (count == WIN_SIZE) {
                return true;
            }
        }

        for (int j = 0; j < SIZE;j++){
           count = 0;
           for (int i = 0; i < SIZE;i++){
               if (symb == map[i][j]) {
                   count++;

               }

           }
           if (count == WIN_SIZE){
               return true;
           }
        }
        count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (symb == map[i][i]) {
                count++;
            }
            if (count == WIN_SIZE) {
                return true;
            }
        }
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;

    return  false;
    }
}
