/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author MobileLaptopWR
 */
public class Books extends Items {
    public  String ISBN ;
    
   
    public Books(String itemname, String itemdetails, String itemtype, int itemcode,String isbn)
    {
        super(itemname, itemdetails ,itemtype,itemcode);
        this.ISBN = isbn;   
    }

    
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
   
    @Override 
    public  void  PrintItems(){
        
       
       System.out.println("printing Book : ");
       for(Items I: itemList)
       {
           System.out.println("B :" + I.getItemName() +
                   " : " + I.getItemDetails() + " :" +
                   I.getItemType() + " : " + I.getItemCode());
       }
 
        
       // itemList.add(this)
        
    }
}// end of books
