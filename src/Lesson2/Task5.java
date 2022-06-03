package Lesson2;

public class Task5 {


    public static void main(String[] args) {
        /*
        Задать одномерный массив и найти в нем минимальный и максимальный элементы;
         */
        int[] arr = {1, 4, 5, 4, 7, 10, 0, 6};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("max nam =" + max);
        System.out.println("min nam =" + min);
    }
}
