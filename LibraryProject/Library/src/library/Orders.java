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
     
     
     
     
    
     // addbooks to ItemList 
     public void AddBooks(String itemname, String itemdetails, String itemtype, int itemcode,String isbn)
     {
         Books b = new Books("Book","hardcopy","SCFI",234,"dddd");
         b.setItemName(itemname);
         b.setItemType(itemdetails);
         b.setItemDetails(itemtype);
         b.setItemCode(itemcode);
         b.setISBN(isbn);

         itemList.add(b);
     }
    
  public void AddJournals(String itemname, String itemdetails, String itemtype, int itemcode,String journaltitle
    ,double DOInumber, double price){
        
        Journals j = new Journals("Journal","IEEE","Robotic Research",3456,"Why Robotics"
         ,0109.98);
       
        j.setItemName(itemname);
        j.setItemType(itemtype);
        j.setItemCode(itemcode);
        j.setJournalTitle(journaltitle);
        j.setDOInumber(DOInumber);
        j.setDOInumber(price);
       
        itemList.add(j);
               
        System.out.println("Journal saved in List items..");
        
    }// add item book
         
    public void AddMagazines(String itemname, String itemdetails, String itemtype, int itemcode
    ,String magtitle, int issueno){
        
        Magazines m = new Magazines("PC Gamer","SCFI gaming","Magazine"
                ,8999,"World of Games",3);
        
        m.setItemName(itemname);
        m.setItemDetails(itemdetails);
        m.setItemType(itemtype);
        m.setItemCode(itemcode);
        m.setMagTitle(magtitle);
        m.setIssueNo(issueno);
        
        itemList.add(m);
    }
  
  
  
   
   

     public String CheckOutItem(String update)
    {
        return update; 
    }
    
    public String CheckInItem(ArrayList<Items> items, String chkItem){
        
        for(Items I: items)
        {
            if(chkItem == (I.getItemType()))
            {
                System.out.println("CheckInItem list:" + chkItem);
                     
                //return chkItem;
            }
          
        }
       
        return chkItem;
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
    }
    
   
    
    
    
}// end of orders class 
