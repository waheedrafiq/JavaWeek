/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MobileLaptopWR
 */
public  class Orders extends Items{
    
 public List<Items> itemList = new ArrayList<>();
 public List<Person> personList = new ArrayList<>(); 
     // Register a person 
    
    public void RegisterPerson(String fName, String emailAddress, String password)
    {
        Person p = new Person(fName,emailAddress,password);
        
        p.setFullName(fName);
        p.setEmailAddress(emailAddress);
        p.setPassword(password);
        
        personList.add(p);
        
    }

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
    
    public Orders(String itemType, String isbn,String itemDetails, String
            itemName){
        
        Books b = new Books();
        
        b.setItemType(itemType);
        b.setISBN(isbn);
        b.setItemDetails(itemDetails);
        b.setItemName(itemName);
        itemList.add(b);
        
        System.out.println("Book item added");
      //  PrintItems();
       
    }// add item book 
    
  public   Orders(String itemType, int itemcode,String itemDetails, String
            itemName){
        
        Journals j = new Journals();
        
       j.setItemType(itemType);
       j.setItemCode(itemcode);
       j.setJournalTitle(itemName);
        
        itemList.add(j);
        
        System.out.println("Journal saved in List items..");
        
    }// add item book
     
    
// public void PrintItems(){
//      
//         for(int i=0; i < itemList.size(); i++)
//         {
//             System.out.println("Printing :");
//             System.out.println(itemList.get(i).getItemType()
//             + " " + itemList.get(i).getItemName() + " " + 
//                     itemList.get(i).getItemDetails()
//             );
//             
//         }  
//       }// end of printing 
    
    
   
    
    
     public void removeItemByType(ArrayList<Items> items,String nData)
   {
       for(Items I : items)
     {
         if(nData == (I.getItemType()))
         {
             System.out.println("removing Item Type");
            // I.remove(i);  // need to come and fix this .
             return;
         }
     }

   }// removing vehicle by Type
   

     public String CheckOutItem(String update)
    {
        return update; 
    }
    
    public String CheckInItem(String itemIn){
        
        return itemIn;
    }
   
    
}// end of orders class 
