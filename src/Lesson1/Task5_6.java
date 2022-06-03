package Lesson1;
/*
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
 */


public class Task5_6 {
    //Задание 5
    public static void main(String[] args) {
        int chislo = 0;
        if (isPositive(chislo)){
            System.out.println(chislo+ " Число положительное");
        }
        else{
            System.out.println(chislo+  " Число отрицательное");
        }
    }


    //Задание 6

    public static boolean isPositive(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
