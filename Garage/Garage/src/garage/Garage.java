/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

/**
 *
 * @author MobileLaptopWR
 */
public class Garage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        double tPrice , eNum;
        
        Vehicle v = new Vehicle();
        GarageM g = new GarageM();
     
        g.addVehicle(11, "BMW", "GREEN", "WH67PX", 2.99);
     
       eNum = 3.99;
       tPrice = g.BillVeh(eNum,  v.SetFixPrice(2.99) );
       System.out.println("the total cost of repair is :" + tPrice);
       
       // Add some additional vehicles 
      g.addVehicle(21, "Ford", "Blue", "FX67PX", 10.99);
      g.addVehicle(33, "Mini", "Yellow", "YN78GX", 2.99);
      
       
       
     // g.UpdateListPrint();
       
       System.out.println("removing by Id..");
      g.removeVehiceById(g.typeVehicle, 11);
    
 
       g.removeVehiceByType(g.typeVehicle,"Ford");
       System.out.println("Removed by Type:");
       
       // second time around printing..
       System.out.println("Debug purpose...");
       g.UpdateListPrint();
    }
    
}
