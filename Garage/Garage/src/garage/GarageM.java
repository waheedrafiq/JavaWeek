/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MobileLaptopWR
 */
public class GarageM {
   
     public ArrayList<Vehicle> typeVehicle = new ArrayList<Vehicle>(); 
    
    public void addVehicle(int nId, String nVehicleType, String nColour,
            String nRegNo, double nFixPrice){
   
       System.out.println("New Vehicle added... ");
         int Id;
         String VehicleType, Colour , RegNo;
         double fixPrice;
              
         Id = nId;
         VehicleType = nVehicleType;
         Colour = nColour;
         fixPrice = nFixPrice;
         RegNo = nRegNo;
        Vehicle v = new Vehicle();
      
        
        v.SetVehicleID(Id);
        v.SetVehicleType(VehicleType);
        v.SetColour(Colour);
        v.SetFixPrice(fixPrice);
        v.SetRegNo(RegNo);
       
        typeVehicle.add(v);
      
        

   }// end of vehicle 

     
   public  void removeVehiceById(ArrayList<Vehicle> v, int nId){
      // int id = nId;
     for(Vehicle veh : v)
     {
         if(nId == (veh.getVehicleID()))
         {
             System.out.println("removing vehicle");
             v.remove(veh);
             return;
         }
     }
                           
   }// end of remove method 
   
   public void removeVehiceByType(ArrayList<Vehicle> v,String nData)
   {
       for(Vehicle veh : v)
     {
         if(nData == (veh.getVehicleType()))
         {
             System.out.println("removing vehicle Type");
             v.remove(veh);
             return;
         }
     }

   }// removing vehicle by Type
   
   public void UpdateListPrint(){
       
       System.out.println("Printing ArrayList:");

         for(int i =0; i < typeVehicle.size(); i++)
         {
             System.out.print("Id:" + typeVehicle.get(i).getVehicleID() + " " +
                     typeVehicle.get(i).getColour() + " " +
                     typeVehicle.get(i).getVehicleType() +"\n");
    
         }
         System.out.println("Printing has ended...");   
   }
   
   
  
   public double BillVeh(double nPrice, double nRepairCost){
       
       double totalP =0.0;
       
       totalP = nPrice + nRepairCost; 
      
       return totalP;  
   }// end of BillVeh
    
}
