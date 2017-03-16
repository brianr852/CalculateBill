/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatebill;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CalculateBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    final double REGULAR_SERVICE = 10.0;
    final double REGULAR_FREE = 50.0;
    final double REGULAR_MINUTES = 0.20;
    
    final double PREMIUM_SERVICE = 25.0;
    final double PREMIUM_DAYFREE = 75.00;
    final double PREMIUM_DAYMIN = 0.10;
   
    Scanner scan = new Scanner( System.in );
    
    DecimalFormat billPattern = new DecimalFormat("$#.00");
    
    System.out.print("Enter your account number > ");
    int acountNumber = scan.nextInt();
    
    System.out.print("Enter your service code > ");
    char serviceCode = scan.next().charAt(0);
    
    System.out.print("Enter your number of minutes > ");
    double numberMinutes = scan.nextDouble();
    
    double regularService = 0.0;
    double premiumService = 0.0;
    
    if (serviceCode == 'R')
    {
      if (numberMinutes >= REGULAR_FREE)
      {
        regularService = REGULAR_SERVICE;
        System.out.print(" Acount number: " + acountNumber + "\n");
        System.out.print(" Service code: " + serviceCode + "\n");
        System.out.print(" Minutes used: " + numberMinutes + "\n");
        System.out.println( billPattern.format( regularService)); 
      }
      else
      {
        regularService = REGULAR_SERVICE * REGULAR_MINUTES;
        System.out.print(" Acount number: " + acountNumber + "\n");
        System.out.print(" Service code: " + serviceCode + "\n");
        System.out.print(" Minutes used: " + numberMinutes + "\n");
        System.out.println( billPattern.format( regularService)); 
      }
    }
   
    if (serviceCode == 'S')
    {
      if( numberMinutes >= PREMIUM_DAYFREE)
      {
        premiumService = PREMIUM_SERVICE;
        System.out.print(" Acount number: " + acountNumber + "\n");
        System.out.print(" Service code: " + serviceCode + "\n");
        System.out.print(" Minutes used: " + numberMinutes + "\n");
        System.out.println( billPattern.format( premiumService)); 
      }
     else
      {
        premiumService = PREMIUM_SERVICE * PREMIUM_DAYMIN;
        System.out.print(" Acount number: " + acountNumber + "\n");
        System.out.print(" Service code: " + serviceCode + "\n");
        System.out.print(" Minutes used: " + numberMinutes + "\n");
        System.out.println( billPattern.format( premiumService));  
      }
    }
    
    }   
}
