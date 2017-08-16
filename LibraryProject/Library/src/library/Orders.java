/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author MobileLaptopWR
 */
public  class Orders extends Items{
  
   public ArrayList<Orders> orderList = new ArrayList<Orders>();
   public ArrayList<Items> readItemList = new ArrayList<Items>();
    
   private double price;
   
    public Orders(String itemname, String itemdetails, String itemtype, int itemcode,double price)
    {
        super(itemname,itemdetails,itemtype,itemcode);
        this.price = price; 
    }
    
    
@Override
public void PrintItems(){
      
        System.out.print("Something :" + itemList.get(0));
         for(int i=0; i < itemList.size(); i++)
         {
             System.out.println("Printing :");
             System.out.println(itemList.get(i).getItemType()
             + " " + itemList.get(i).getItemName() + " " + 
                     itemList.get(i).getItemDetails()
                     
            );
             
         }  
}// end of printing 


    
// to be used with Items 
 
     public  void removeItemByID(ArrayList<Items> items, int nId){
      // int id = nId;
     for(Items I : items)
     {
         if(nId == (I.getItemCode()))
         {
             System.out.println("removing item");
             items.remove(items);
             return;
         }
     }
                           
   }// end of remove method 
     
    public void DeleteItemByType(ArrayList<Items> items,String nData)
   {
           for(Items I : items)
         {
             if(nData == (I.getItemType()))
             {
                 System.out.println("removing Item Type");
                items.remove(I);  // need to come and fix this .
                 return;
             }
         }

   }// removing vehicle by Type
        

 
     public int  CheckOutItem(ArrayList<Items> items, int itemNumber)
    {
        
        for(Items I: items)
        {
            if(itemNumber == (I.getItemCode()))
            {
                System.out.println("Item Check out  :" + itemNumber +
                        " : " + I.getItemName() + " " + I.getItemType()); 
                
            }
          
        }
        
        return itemNumber; 
    }
    
     
    public int CheckInItem(ArrayList<Items> items, int itemNumber){
        
        for(Items I: items)
        {
            if(itemNumber == (I.getItemCode()))
            {
                System.out.println("You have check In items :" + itemNumber +
                        " : " + I.getItemName() + " " + I.getItemType());    
            }
          
        }
      
         return itemNumber;
 
    }
   
    
    public String UpdateItems(ArrayList<Items> items, String nData , String replaceItem){
        // update items
        for(Items I: items)
        {
            if(nData == null ? (I.getItemType()) == null : nData.equals(I.getItemType()))
            {
                //items.set(0,items.get(0).setItemType(replaceItem);

                items.remove(I);
                I.setItemType(replaceItem);
                items.add(I);
            }
        }
        return replaceItem;
    }// end of class 
    
    
//    public void save(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
//         Items b = new Books("Book","hardcopy","SCFI",234,"dddd");
//
//    try{
//        PrintWriter pw = new PrintWriter(fileName, "UTF-8");
//       
//        for (Items per : itemList) 
//        {
//           pw.println(b.getItemName()+ "/" + per.getItemDetails() + "/" + per.getItemType() +
//            "/" + per.getItemCode());
//                   pw.close();
//        }        
//        
//        System.out.println("File saved:");
//        
//        } catch(IOException e){
//                System.out.println(e);
//        }
//    }// save files 
    
    
//     @SuppressWarnings("empty-statement")
//    public void Load() throws FileNotFoundException, IOException, ClassNotFoundException{
//     
//        
//        String filepath = "C:\\javafile\\testjava.text";
//        
//        BufferedReader bufReader = new BufferedReader(new FileReader(filepath));
//        
//        String line = bufReader.readLine();
//        
//        while (line != null) {
//           
//            String[] parts = line.split("/");
//            String part1 = parts[0];
//            String part2 = parts[1];
//            int part3 = Integer.parseInt(parts[2]);
//             Items = new Items(part1,part2,part3);
//            
//            readItemList.add(nPerson);
//            line = bufReader.readLine(); 
//        } //end of while 
//        bufReader.close();
//         
//        for(Items per: readItemList)
//        {
//            System.out.println("Reading.." + per.getItemName() + " " + per.getItemDetails());
//            
//        }
//        
//    }
//   
    
    
    
}// end of orders class 
