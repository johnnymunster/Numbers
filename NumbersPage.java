/*
NumbersPage.java
Johnathan Munster
24 9 2018
*/

//Class Signature - creating a app called NumbersPage

//create an application to ask the user for two numbers and to printback the answer
import java.util.*;
public class NumbersPage{

  //Main method - runs the application
  public static void main(String[] args) {

      //Variables - storage containers
      //declare a Variables
      int num1;
      int num2;
      int sum;

      //assign a Variable
      num1=0;
      num2=0;
      sum=0;

      //declare a object
      //bringing in the scanner to allow for user input and we give it a name
      Scanner keyboard;

      //create object - creating an instance/copy of the Scanner class
      keyboard=new Scanner(System.in);

      //input - question we ask the Munster
      //asks the question

      System.out.println("Enter number 1");
      //stores the number
      num1=keyboard.nextInt();

      System.out.println("Enter number 2");
      num2=keyboard.nextInt();

      //process - calculations
      sum=num1+num2;

      //output - anything we want to send to the user
      System.out.println("the total is "+sum);

  }

}
