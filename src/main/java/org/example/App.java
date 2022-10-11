package org.example;

public class App {
    public static void main(String[] args) {
        //statement for printing the data
        System.out.println("Hello world!");

        int age= 32;
        System.out.println("Age: " + age);

        double salary = 40000.00;
        System.out.println("Salary:" +salary);

        /*
        boolean studentStatus =true;
        boolean accountStatus =false;

        char a = 'a';

        float f =23.5f;

         */

        int number1=20;
        int number2=10;
        int result=number1 + number2;
        System.out.println("Result:" +result);

     int number = 2;
     System.out.println(--number);
     /*

     int num1 = 20;
     int num2 = 20;
     boolean isEqual =num1 == num2;
        System.out.println(isEqual);

        int num3 = 10;
        int num4 = 20;
        boolean notEqual =num3 != num4;
        System.out.println(notEqual);

      */
        //defining an 'age' variable
        int age1=20;
        //checking the age
        if(age1 <=25) {
            System.out.println("Age is greater than 18");
        }else {
            System.out.println("Age is less  than 18");
        }

        }
}


