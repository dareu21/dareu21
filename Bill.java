//this will calculate the bills and devide it by three people

import java.util.*;

public class Bill{

   public static void main(String[] args){
      Scanner keybd = new Scanner (System.in);
      char answer;
      
      bills();
      
      System.out.print("Want to calculate your income? ");
      
      answer = keybd.next().toLowerCase().charAt(0);
      while (true){
      
         if (answer == 'y'){
            income();
            System.out.println("\n\tThanks for using the app!");
            break;
         } else if (answer == 'n'){
            System.out.println("Have a good day!");
            break; 
         }
      
      }//end of loop
   }//end of main
  
  
  
  
   public static void bills(){//calculates the monthly bill
      System.out.println("Calculating your bill(s)");
      System.out.println();
      
      double electric=0.0;
      double garbage=0.0;
      double rent=0.0;
      double internet=0.0;
      double total = 0.0; 
      Scanner scanObject = new Scanner (System.in);
      
         //enter your bill amount
      System.out.println("Rent: ");
      rent = scanObject.nextInt();
      System.out.println("electric: ");
      electric = scanObject.nextInt();
      System.out.println("garbage: ");
      garbage = scanObject.nextInt();
      System.out.println("internet: ");
      internet = scanObject.nextInt();        
         
         //total of all bills
      total = internet + rent + garbage + electric;
      System.out.println (" the total for all of your bills are: " + total); 
              
      total = total / 3;
      System.out.println("Dividing the total on three..." +total);
   }//end of bill


   public static void income(){//calculates your income
      double wage=0.0;
      double hours=0.0;
      double total = 0.0; 
      Scanner scanObject = new Scanner (System.in);
      
        //enter your income amount
      System.out.println("hourly wage: ");
      wage = scanObject.nextInt();
      System.out.println("how many hours per week you work: ");
      hours = scanObject.nextInt();
      
      total = wage * hours;
      System.out.println("Your weekly wage is:" + total);
      
      total = total * 52;
      System.out.println("Your yearly income is:" + total);   
      
      total = total /12;
      System.out.println("Your monthly wage is:" + total);
      
      
   }//end of income
}//end of class