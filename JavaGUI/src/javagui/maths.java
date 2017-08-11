/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import javax.swing.JOptionPane;

/**
 *
 * @author waheedrafiq
 */
public class maths {
    
   
       private int num1 , num2 , total; 
        
       // get number 1 encapsulated values 
        public int getNum1(){
            return num1;
        }
        
        public int getNum2(){
            return num2;
        }
        
        public int getTotal(){
            return total;
            
        }
        
        // now define setter for each value 
        
        public void setNum1( int nNum1){
              num1 = nNum1;
        }
        
        public void setNum2(int nNum2){
            
            num2 = nNum2;
            
        }
        
        public void setTotal(int nTotal){
            
            total = nTotal;
            
        }
        
        public int sumTotal(int total){
            
            total = num1 + num2 ; // add two values together 
            
             JOptionPane.showMessageDialog(null, "The Total sum is : "
                        +  total);
             
            return total ; 
        }
          
    
}// end of maths class 
