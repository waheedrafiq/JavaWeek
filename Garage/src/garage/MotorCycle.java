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
public class MotorCycle extends Vehicle {
    // define attributess
    
    private double speed;
    private double engIneSize;
    
    
    public double GetSpeed()
    {
        return speed;
    }
    
    public double GetEngineSize(){
        return engIneSize;
    }
    
    
    // set these 
    public void SetSpeed( double nSpeed){
        speed = nSpeed; 
    }
    
    public void SetEngineSize(double nEngineSize){
        
        engIneSize = nEngineSize; 
    }
    
    
    
}// end of Vehicle class 


