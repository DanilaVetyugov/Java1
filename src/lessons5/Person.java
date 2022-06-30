package lessons5;

public class Person {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person (String fullName, String jobTitle,String email, String phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }



    public void printInfo(){
        System.out.println("Full name = "+this.fullName + ", " + "Job title = " +  this.jobTitle + ", " + "Email = " + this.email + ", " + "Phone number = " + this.phoneNumber + ", " + "Salary = " + this.salary + ", " + "Age " + this.age );
    }

    public int getAge(){
        return this.age;
    }

}
