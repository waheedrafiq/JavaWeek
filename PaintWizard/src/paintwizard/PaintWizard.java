/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintwizard;

/**
 *
 * @author MobileLaptopWR
 */
public class PaintWizard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Product p = new Product();
       
       p.PrintWizard(20, 19.99, 8500);
       
       p.PrintWizard(15, 17.99, 8500);
       
       p.PrintWizard(10, 25.00, 8500);
        
    
     
   
    p.Cheapest();//h
    }
    
    
}
