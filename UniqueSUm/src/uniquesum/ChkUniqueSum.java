/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquesum;

/**
 *
 * @author MobileLaptopWR
 */
public class ChkUniqueSum {
    
     public void UniqueSum(int num1, int num2 , int num3){
            
        // declare variables 
           int result;
           
           
           result = CheckUnqueSum(num1,num2,num3);
           
           System.out.println("The result of Unique sum is : " + result );
            
    }// end of UniqueSum
    
    public static int CheckUnqueSum(int num1, int num2, int num3)
    {
        int result = 0; 
        
        if( num1 !=num2 || num1 != num3 || num2 != num3 || num2 != num1)
        {
            result = num1 + num2 + num3;
        }
        
        return result; 
    }
    
    
}
