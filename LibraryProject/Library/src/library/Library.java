/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
       
       System.out.println("printing test ");
       for(Items I: itemList)
       {
           System.out.println("Printing items list" + I.getItemName() +
                   " : " + I.getItemDetails() + " :" +
                   I.getItemType());
       }
   }// end of  printing method.
   

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException, ClassNotFoundException {

     Items b = new Books("Book","hardcopy","SCFI",234,"dddd");
   
     Items j = new Journals("Journal","IEEE","Springer",3456,"Java in Action",45.678);
     Items m = new Magazines("Magazine", "Paper", "SCFI", 2568, "PC Gamer", 34);
     
     // add items 
     b.Items("Books", "HardCopy", "HardBack", 2345, "BNNI-987");
     b.Items("Books", "eBooks", "PDF", 2311, "BNNI-666");
     
     j.Items("Journal", "IEEE", "Springer", 34, "Face in A.I", 678.987);
     
     
     m.Items("Magazine", "Paper", "SCFI", 2568, "PC Gamer", 34);
     m.Items("Magazine", "ebooks", "Computering", 1568, "Web .Net", 98);
  
      
     
     b.PrintItems();    
     j.PrintItems();
     m.PrintItems();
    
    System.out.println("checking in item");
    Orders o = new Orders("GunsBook", "FirePower", "NewPaper", 340,1.98);
    
    o.CheckInItem(m.itemList, 1568);
    o.CheckOutItem(b.itemList, 2311);
       
   // Register a person 
   
    Person p = new Person("","","");
       
    p.RegisterPerson("Waheed", "wrafiq@gmail.com", "abcde");
    
    p.PrintPersons();
    
    System.out.println("Saving file");
 
    b.save("C:\\javafile\\books.text");
    
    j.save("C:\\javafile\\journal.text");
   
    m.save("C:\\javafile\\mags.text");
    
    b.Load("C:\\javafile\\books.text");
    
    j.Load("C:\\javafile\\journal.text");
    
    m.Load("C:\\javafile\\mags.text");
    
    }// end of main

   

}// end of main library class 
