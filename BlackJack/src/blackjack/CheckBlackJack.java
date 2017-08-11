/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author MobileLaptopWR
 */
public class CheckBlackJack {
    
     public void blackjack(int num1,int num2){
      
        // declare variables 
        int result;
       
        result = Check21(num1 , num2);
        
        System.out.println("The check result is :" + result);
        
        
        
        
    }// end of blackjack method 
    
    public int Check21(int num1,int num2){
        
        int result =1;
          
         if(num1 < num2 && num1 != 22 && num2 != 22)
         {
             result = num2;
         }
         else if(num1 > num2 && num1 != 22 && num2 != 22)
         {
             result = num1;
         }
         else if(num1 == 22 || num2 ==22) // if either go over 21 return 0 
         {
           result = 0; 
           System.out.println("you are in 22 zone ");
         }
       
         return result;
        
    }
}
