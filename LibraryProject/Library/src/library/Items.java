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
