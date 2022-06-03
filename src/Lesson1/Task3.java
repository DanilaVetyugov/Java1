package Lesson1;
    /*

    Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.

     */

public class Task3 {
    public static void main(String[] args) {
        float a,b,c,d;
         a = 2.23f;
         b = 56.77f;
         c = 0.11f;
         d = 6.98f;

        System.out.println(" a * (b + (c / d)) ="+ count(a,b,c,d));


    }

    public static float count(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

}
