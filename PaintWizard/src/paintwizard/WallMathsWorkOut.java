/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintwizard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MobileLaptopWR
 */
public class WallMathsWorkOut {
    
    List<Product> productList = new ArrayList<Product>();
   
    
    public double CalculatateSqrFootage(double sLitre , double sCoverage)
    {
       double TotalSqrFootage;
       
       TotalSqrFootage = sLitre * sCoverage;
       return TotalSqrFootage;
       
    }
    
    public double CalculatePaintTinUsed(double nRoomSize , double nSqrFootage){
        
        double PaintTinUsed = nRoomSize / nSqrFootage;
        
        return PaintTinUsed;       
    }
    

    
    public void CalculateWaste(double nRoundN,double nPaintCost,
            double nPaintTinUsed)
    {
        double TWaste;
           Product p = new Product();
         
        
        TWaste = (nRoundN * nPaintCost) - (nPaintTinUsed * nPaintCost);
        
        System.out.println("The Total Cost of the Waste is:" + 
                (int)Math.ceil(TWaste));
        
        p.setWaste((int)Math.ceil(TWaste));
        productList.add(p);
        
    }
                
    public void PrintWizard(double nLitres, double nPaintCost, double nRoomSize){
     
       Product p = new Product();
       double waste,TWaste;
       p.setLitres(nLitres);
       p.setPaintCost(nPaintCost);
       p.setSqrFootage( p.CalculatateSqrFootage(p.getLitres(), p.getPaintCost()));
       
       p.setPaintTinUsed(p.CalculatePaintTinUsed(nRoomSize, p.getSqrFootage()));
       
      double RoundNumber =  Math.round(p.getPaintTinUsed());
       
       System.out.println(":the total sqr is : " + (int)Math.ceil(p.getSqrFootage()) + 
               " and The total Paint Used : " + (int)Math.ceil(p.getPaintTinUsed()) );
        
       p.setPaintTinUsed(p.getPaintTinUsed());
       
       
       TWaste = (RoundNumber * nPaintCost) - (p.getPaintTinUsed() * p.getPaintCost());
       System.out.println("total wasted: " + (int)Math.ceil( TWaste));
       p.setWaste((int)Math.ceil(TWaste));
       productList.add(p);
       
     //  Cheapest();
      
    }
    
public void Cheapest(){
     
        Product p = new Product();
   
        Integer[] prod = new Integer[3];
        double storeTotal;
        
       storeTotal = (p.getPaintTinUsed()) - (p.getWaste());
          
       for(int i=0; i< productList.size();i++)
       {
           prod[i] = (int) productList.get(i).getWaste();
          System.out.println("Printing waste: " + productList.get(i).getWaste());
       }
      Arrays.sort(prod, Collections.reverseOrder());
       System.out.println(prod.length);
       for(int i=0; i < prod.length; i++)
        {
            System.out.println("PriceX" + prod[i].toString());
        }
       
}// end cheapest 
   
    
    public void printList(){
     
        Product p = new Product();
        
        for(int i =0 ; i < productList.size(); i++)
        {
            System.out.println("Printing list: " + productList.get(i).getPaintTinUsed());
            System.out.println("Printing waste: " + productList.get(i).getWaste());
        }
        
    }

    
}
