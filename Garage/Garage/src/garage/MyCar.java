/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import garage.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;


class MyCar extends Vehicle{
    
   private int howManyWheels; 
   

   
   public int GetHowManyWheels(){
       return howManyWheels; 
   }
   
   public int SetHowManyWheels(int sHowManyWheels)
   {
       return howManyWheels = sHowManyWheels;
   }
        
    
}// end of MyCar 
