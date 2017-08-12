/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

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
    private int itemCode;
    private Date date;
    public List<Person> personList = new ArrayList<>(); 
    public List<Items> itemList = new ArrayList<>();
    
    // constructor
    
    public Items(String itemname, String itemdetails, String itemtype, int itemcode)
    {
        this.itemName = itemname;
        this.itemType = itemtype;
        this.itemDetails = itemdetails;
        this.itemCode = itemcode;
    }
      
    public abstract void  PrintItems();
    
    @Override
    public String toString(){
        
        return "Item Name:" + this.itemName + "::" + this.itemType +"::"+
                this.itemDetails +"::"+ this.itemCode;
        
    }
    
    
    
    
    public void RegisterPerson(String fName, String emailAddress, String password)
    {
        Person p = new Person(fName,emailAddress,password);
        
        p.setFullName(fName);
        p.setEmailAddress(emailAddress);
        p.setPassword(password);
        
        personList.add(p);
        
    }

    public void PrintPersons(){
    for(int i=0; i < personList.size(); i++)
         {
             System.out.println("Printing :");
             System.out.println(personList.get(i).getFullName()
             + " " + personList.get(i).getEmailAddress() );
             
         }  
       }// end of printing 
  
    
    
    
    
    
    
    
    
    
    
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
     
  
    
    
    
 
     
  
  

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // testing array list 
    public List<String> createJournals() {
        List<String> ar = new ArrayList<>();
        ar.add("IEEE");
       
        return ar;
    }
    // testing array list 
    public List<String> CreateBooks() {
        List<String> ar = new ArrayList<>();
        ar.add("MyBooks in Action");
       
        return ar;
    }
    
     // testing array list 
    public List<String> CreateMagazines() {
        List<String> ar = new ArrayList<>();
        ar.add("PC Games");
       
        return ar;
    }
    
}
