
/**
 * Write a description of class CheckBookUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class CheckBookUI
{
   //simply asks the user to type something
   //saves that in example
   //then outputs example
   public static void main(String[] args)
   {
       Check[] checkArray;
       int arraySize;
       Scanner sc = new Scanner(System.in);
       System.out.println("How many checks are you entering? ");
       arraySize = sc.nextInt();
       checkArray = new Check[arraySize];
       
       for(int n = 0; n < arraySize; n++)
       {
         checkArray[n] = getCheck();
       }
       
       for(int n = 0; n < arraySize; n++)
       {
         checkArray[n].printCheck();
       }
   }
   
   public static Check getCheck()
   {
       String input;
       int checkNumber = 0;
       String payee;
       float dollarAmount = 0;
       String reason;
       boolean badInput = true;
       Scanner sc = new Scanner(System.in);
       
       // Asks the user to enter a check number, if it is not an Integer keeps asking the user to enter  until they input an integer
       System.out.println("Enter the Check Number: ");
       while(badInput)
       {
           try
           {
               input = sc.nextLine();
               checkNumber = Integer.parseInt(input);
               badInput = false;
           }
           catch(NumberFormatException e)
           {
               badInput = true;
               System.out.println("Please Input an Integer: ");
           }
       }
       
       //Ask the user to enter the payees name
       System.out.println("Enter the Payees Name: ");
       input = sc.nextLine();
       payee = input;
       
       //asks the user to enter the dollar amount, if it is not a float keeps asking the user to enter until they input a float
       //need to add formatting to make it only 2 digits
       System.out.println("Enter the Dollar Amount: ");
       badInput = true;
       while(badInput)
       {
           try
           {
               input = sc.nextLine();
               dollarAmount = Float.parseFloat(input);
               badInput = false;
           }
           catch(NumberFormatException e)
           {
               badInput = true;
               System.out.println("Please Input a Dollar Amount: ");
           }
       }
       
       //asks the user the check description
       System.out.println("Enter a Description of the Check");
       input = sc.nextLine();
       reason =input;
       
       Check newCheck = new Check(checkNumber, payee, reason, dollarAmount);
       
       return newCheck;
   }
}
