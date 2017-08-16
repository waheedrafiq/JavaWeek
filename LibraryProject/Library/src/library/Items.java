/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
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
    public ArrayList<Items> readItemList = new ArrayList<Items>();
    
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
            bw.append(str.getItemName() + "|" + str.getItemType() + "|" + str.getItemDetails());
            bw.newLine();
        }// end of for
        bw.close();
        writer.close();


       
        } catch(IOException e){
               e.printStackTrace();
        }
       
    
}// end of save method 
 
    
  
    public void Load(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException{
     
        
        //String filepath = "C:\\javafile\\testjava.text";
        
        BufferedReader bufReader = new BufferedReader(new FileReader(filePath));
        
        String line = bufReader.readLine();
        
        while (line != null) {
           
            String[] parts = line.split("|");
            String part1 = parts[0];
            String part2 = parts[1];
            String part3 = parts[2];
            
           // int part4 = Integer.parseInt(parts[3]);
           // String part5 = parts[4];
            
            Items b = new Books(part1,part2,part3,0,"");
   
            Items j = new Journals("Journal","IEEE","Springer",3456,"Java in Action",45.678);
            Items m = new Magazines("Magazine", "Paper", "SCFI", 2568, "PC Gamer", 34); 
            
            readItemList.add(b);
            line = bufReader.readLine(); 
        } //end of while 
        bufReader.close();
         
        for(Items per: readItemList)
        {
            System.out.println("Reading.." + per.getItemName() + " " + per.getItemDetails());
            
        }
        
    }
   
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

    public ArrayList getItemName(String test) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
