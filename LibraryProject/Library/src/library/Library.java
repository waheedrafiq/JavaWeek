/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 *
 * @author MobileLaptopWR
 */
public class Library extends Items {
    private int libraryMemberShipNo;
    
     public Library(String itemname, String itemdetails,String itemtype , int itemcode,int libraryMembershipNo)       
     {
         super(itemname,itemdetails,itemtype,itemcode);
         this.libraryMemberShipNo = libraryMembershipNo;
     }

@Override 
   public void PrintItems(){
       
      
   }
    public void addItems(ArrayList<Items> t, String obj){
        
        for(Items i: t)
        {
            t.add(i);
         
        }
       

        }
    public static void main(String[] args) {

//     Books b = new Books("Book","hardcopy","SCFI",234,"dddd");
//
//  
//     b.setItemName("Book");
//     b.setItemType("hardcopy");
//     b.setItemDetails("SCFI");
//     b.setItemCode(243);
//     b.setISBN("dddd");
//     
//     itemList.add(b);
//      

       
        
    }// end of main

   

}// end of main library class 
