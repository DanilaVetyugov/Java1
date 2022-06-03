package Lesson1;
    /*
    Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(compare(10,4));

    }
    public static boolean compare(int a, int b){
       int c = a+b;
       if (c>=10 && c<=20){
           return true;
       }else {
           return false;
       }

    }

}
/*
более короткий метод
    public static boolean compare(int a, int b){
        int c = a+b;
        return c>=10 && c<=20
    }
 */