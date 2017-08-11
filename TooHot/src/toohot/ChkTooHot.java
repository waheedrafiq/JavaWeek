/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toohot;

/**
 *
 * @author MobileLaptopWR
 */
public class ChkTooHot {
    
    public void TooHot(int temp){
         
         ChkTooHot(temp);
        
    }
    
    public int ChkTooHot(int temp){
        
        int ftemp =0;
        ftemp = temp; 
        boolean status= true; 
        
        if (ftemp >= 60 && ftemp <= 100)
        {
            status = true ;
                    
        }
        else
        {
            status = false; 
        }
        
        if(status)
        {
            System.out.println("It is Summer season");
        }
        else 
        {
            System.out.println("It is Winter  season");
        }
        
        return ftemp; 
        
    }// end of too hot 
}
