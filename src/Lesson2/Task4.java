package Lesson2;

public class Task4 {

    /*
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */


    public static void main(String args[]) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i + j) % 2 == 0) {

                    System.out.print(arr[i][j] = 1 );
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();

        }

    }
}