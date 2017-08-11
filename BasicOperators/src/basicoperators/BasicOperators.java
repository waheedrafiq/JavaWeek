/*
* Author: Waheed Rafiq
* Dated Written: 16/07/2017
* Project File: BasicOperators.java
* Description: Code example of basic operators
* All CopyRight (c) reserved 
*/ 

package basicoperators; // same as root folder that has different folders within

public class BasicOperators {

   /*
    When Java class is executed from the console the main method is called
    Main method must be public static void main(String[]) args is a standard 
    convention and is not strictly required. 
    */
    public static void main(String[] args) {
        // Example of Basic operators 
        // Declare our data type and use them for the Aritmetic operators
        int num1 = 10;
        int num2 = 20;
        int result; 
        
        System.out.println("============================");
        // we change the background colour by using 'escape character 
        // 27 typecased from an int to a char. try changing first value anything 
        // between 30 to 47 mix and match see what happens
        System.out.println((char)27 + "[37;44m Arithmetic Operators");
        System.out.println("============================");
        System.out.println("");
        System.out.println("");
        
        // Addition operator + 
        result = num1 + num2; 
        System.out.println((char)27 + "[32;47m The Addition Operator result is --> " + result);
        System.out.println("");
        
        // Subraction operator 
        
        // Multiplication operator
        
        // Division operator 
        
        // What happens when you apply the Modulus 
        num2 = 3; // we change the value of num2 to 3 
        result = num1 % num2; 
        System.out.println((char)27 + "[31;47m The Modulus result is --> " + result);
        System.out.println("");
        
        //++ Increment operator 
        num1 = 10;
        ++num1 ; 
        System.out.println((char)27 + "[34;47m result of increment is -->" + num1);
        System.out.println("");
        
        // -- Decrement example your turn :) 
        
        
        
        System.out.println((char)27 + "[34;47m =========================");
        System.out.println((char)27 + "[37;47m Relational Operators");
        System.out.println((char)27 + "[34;47m ========================");
        System.out.println("");
        
        // == operator
        if(num1 == num2)// if this is true then do 
        {
            System.out.println("Num1 and Num2 are same values");
        }
        else // just do the below line 
        {
            System.out.println((char)27 + "[45;47m Nope not the same value :)" );
            System.out.println("because " + num1 + " is not same value as " + num2);
            System.out.println("");
        }
        
        // != operator 
        if(num1 != num2)
        {
            System.out.println((char)27 +"[36;47m"+  num1 +" is not equal to "+  num2);
            System.out.println(""); // print blank line 
            
        }
        else
        {
            System.out.println((char)27 + "[45;47m num1 is equal to num2 :)" );
           
        }
        
        // > greater than 
        
        // < less  than 
        
        // >= greater than or equal to 
        
        
        // <= operator 
        // reset values 
        num1 = 5;
        num2 = 5; 
       if( num1 <= num2)
       {
           // because num1 is same value as such it equal  to num 2 
           System.out.println("");
           System.out.println((char)27 + "[35;47m Condition is true " + num1 + " <= less or equal to " + num2);
           System.out.println("");
           
       }
       else 
       {
             System.out.println("Nothing is making sense here .. .");
       }
        
       
       
        // Example of Bitwise operators 
        System.out.println((char)27 + "[37;47m =========================");
        System.out.println((char)27 + "[38;47m Bitwise Operators");
        System.out.println((char)27 + "[44;47m ========================");
        System.out.println("");
        
        // Reset values for num1 and num2
        
        num1=2;
        num2=5;
        
        // ~ negation operator 
        System.out.println("Bitwise operator negation current value without ~ of num1 is : " + num1);
        System.out.println("After the negation the value is :" + ~num1);
        System.out.println("");
        
        // | bitwise or operator
        System.out.println("Example Bitwise operator OR  without,current value of num1 is : " + num1);
        System.out.println("After the OR the value is :" + (num1 | num2));
        System.out.println("");
        
        
        // & AND operator 
        
        System.out.println("Example & without, current value of num1 is : " + num1);
        System.out.println("After the & the value is :" + (num2&num1));
        System.out.println("");
        
        
        // Bitwise  XOR operator ^
        
        System.out.println("^ XOR  without ,current value of num1 is : " + num1);
        System.out.println("After the XOR the value is :" + (num1 ^ num2));
        System.out.println("");
        
        // << left shift
        // >> right shift
        // >>> Zero fill right shift 
        
        
        // Example of Logical Operators 
        System.out.println((char)27 + "[33;47m =========================");
        System.out.println((char)27 + "[33;47m Logical Operators");
        System.out.println((char)27 + "[33;47m ========================");
        System.out.println("");
        
        String name1 ="Waheed";
        String name2 = "John";
        
        // && logical AND Operator 
        if(name1 == "Waheed" && name2 == "John")
        {
             System.out.println((char)27 + "[33;47m =====================");
             System.out.println((char)27 + "[33;47m Waheed & John found !");
             System.out.println((char)27 + "[33;47m =====================");
             System.out.println("");
            
        }
        
            // ||  logical OR Operator 
        if(name1 == "Waheed" || num1 == 3) // num1 is not equal to 3 but is 2!
        {
             System.out.println((char)27 + "[33;47m =====================");
             System.out.println((char)27 + "[33;47m Waheed & John found !");
             System.out.println((char)27 + "[33;47m =====================");
             System.out.println("");
            
        }
        
        // ! logical AND Operator 
        boolean y = true ;
   
        if(y != false)
        {
             System.out.println((char)27 + "[33;47m ===============================");
             System.out.println((char)27 + "[33;47m y is True because its not false");
             System.out.println((char)27 + "[33;47m ===============================");
             System.out.println("");
            
        }
        
        // Assignment Operator 
        
        // Your task using the above knowledge to complete the table with code example. 
        // of each one.
        
        // Miscellaneious Operators.
        
            //  ? 
            
            result = (num1 == 7) ? 30 : 100;
            
           System.out.println((char)27 + "[33;47m the result is --> " + result);
             
            
        int val1 = 200;
        int val2 = 10;
        
        if(val1 == 4 || val1 == 200)
        {
            System.out.println("Something has happen here....");
        }
        else
        {
              System.out.println("Nothing has happen here ... ");
        }
        
        
        int x = 3;
        if(x != x)
        {
             System.out.println("True");
        }
        else 
        {
              System.out.println("False");
        }
    }// end of main method.
    
}// end of class 
