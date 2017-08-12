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
public class Vehicle{
     
    public String regNo;
    public String colour;
    public double fixPrice; 
    public int vehicleID;
    public String vehicleType;
    
    
    public String getRegNo(){
        return regNo;
        
    }
    
   public String getColour(){
       return colour; 
       
    }
   public double getFixPrice(){
       return fixPrice;
   }
   
   public int getVehicleID(){
       return vehicleID;
   }
   
   public int SetVehicleID(int sVehicleID){
       return vehicleID = sVehicleID;
   }
   
   public String getVehicleType(){
       return vehicleType;
   }
   
   public String SetVehicleType(String sVehicleType){
       return vehicleType = sVehicleType;
   }
   
   public String SetRegNo(String sRegNo)
   {
      return regNo = sRegNo;
   }
   
   public String SetColour(String sColour)
   {
       return colour = sColour;
   }
   
   public double SetFixPrice(double sFixPrice){
       
       return fixPrice = sFixPrice; 
   }
  
}// end of vehicle class 
