/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MobileLaptopWR
 */
//  This is Parent class  a child class will have all the functionalite
// which parent class , and can add more function to the child it self !!
// M
public abstract class Items {
    
    
    private String itemName, itemDetails ,itemType;
    public int itemCode;
    private Date date;
  
    public ArrayList<Items> itemList = new ArrayList<>();
    
    // constructor
    
    public Items(String itemname, String itemdetails, String itemtype, int itemcode)
    {
        this.itemName = itemname;
        this.itemType = itemtype;
        this.itemDetails = itemdetails;
        this.itemCode = itemcode;
    }
    
    
    
     // adding books
    public void Items(String itemname, String itemdetails, String itemtype, int itemcode,
            String isbn){
        
        Books b = new Books(itemname,itemdetails,itemtype,itemcode,isbn);
        itemList.add(b); // add the item to the list of items
        
    }
      
    
    // add Journals
    
     public void Items(String itemname, String itemdetails, String itemtype, int itemcode,String journaltitle
    ,double DOInumber){
       
         Journals j = new Journals(itemname,itemdetails,itemtype,itemcode,journaltitle,DOInumber);
         itemList.add(j); // add the item to the list of items
    }
     
     //Magazines 
      public void Items(String itemname, String itemdetails, String itemtype, int itemcode
    ,String magtitle, int issueno){
       Magazines m = new Magazines(itemname,itemdetails,itemtype,itemcode,
               magtitle,issueno);
        itemList.add(m); // add the item to the list of items
    }
     
     
    
    public abstract void  PrintItems();
    
    @Override
    public String toString(){
        
        return "Item Name:" + this.itemName + "::" + this.itemType +"::"+
                this.itemDetails +"::"+ this.itemCode;
        
    }
    
    
    
   
    
public void save(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
      
    try{
        File file = new File(fileName);
        
           // if the file does not exits then create it !
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);
         
        for(Items str: itemList){
            bw.append(str.getItemName() + "/" + str.getItemType() + "\n");
            bw.newLine();
        }// end of for
        bw.close();
        writer.close();


       
        } catch(IOException e){
               e.printStackTrace();
        }
       
    
}// end of save method 
 
    
    
   
    
    

   
  
   
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
     
  
  
    
    
//    // testing array list 
//    public List<String> createJournals() {
//        List<String> ar = new ArrayList<>();
//        ar.add("IEEE");
//       
//        return ar;
//    }
//    // testing array list 
//    public List<String> CreateBooks() {
//        List<String> ar = new ArrayList<>();
//        ar.add("MyBooks in Action");
//       
//        return ar;
//    }
//    
//     // testing array list 
//    public List<String> CreateMagazines() {
//        List<String> ar = new ArrayList<>();
//        ar.add("PC Games");
//       
//        return ar;
//    }
    
}
