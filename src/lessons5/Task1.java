package lessons5;

public class Task1 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Vetyugov ","polis", "@mail","758484",25000000,23);
        persArray[1] = new Person("Vetyugov ","polis", "@mail","758484",25000000,23);
        persArray[2] = new Person("Vetyugov ","polis", "@mail","758484",25000000,50);
        persArray[3] = new Person("Vetyugov ","polis", "@mail","758484",25000000,23);
        persArray[4] = new Person("Vetyugov ","polis", "@mail","758484",25000000,40);
       for (int i = 1; i < persArray.length; i++){
           if(persArray[i].getAge()>=40){
               persArray[i].printInfo();
           }

       }
    }

}
