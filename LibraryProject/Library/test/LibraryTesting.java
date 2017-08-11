/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import library.Books;
import library.DataReadWriteDelete;
import library.Inventory;
import library.Orders;
import library.Person;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MobileLaptopWR
 */
public class LibraryTesting {
    
    public LibraryTesting() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test public void testGetName()
    {
        Inventory i = new Inventory() {};
        
     
        // assert statements
        
        assertNull(i.getItemName());
        assertNull(i.getItemDetails());
        assertNull(i.getDate());
   
    } // end of test Inventory 
    
    // test book class 
    
    @Test public void testBook(){
       
        Books b = new Books();
        
        assertNull(b.getBookType());
        assertNull(b.getBookType());
        
    } // end of books class test 
    
    
    @Test public void testingDataReadWriteDelete(){
        
        // passing a String 
        DataReadWriteDelete DRW = new DataReadWriteDelete();
        
        assertEquals("javaFile",DRW.ReadData("javaFile"));
        assertEquals("textFile",DRW.WriteData("textFile"));
        assertEquals("FooBoo", DRW.DeleteData("FooBoo"));
        
        
    }// end of DataReadWriteDelete 
    
    @Test public void testJournals(){
        
        Inventory i = new Inventory(){};
        
        assertEquals(Arrays.asList("IEEE"),i.createJournals());
            
    } // end of testJournals
    
     
    @Test public void testCreateBooks(){
        
        Inventory i = new Inventory(){};
        
        assertEquals(Arrays.asList("MyBooks in Action"),i.CreateBooks());
            
    } // end of testJournals
    
       
    @Test public void testCreateMagazines(){
        
        Inventory i = new Inventory(){};
        
        assertEquals(Arrays.asList("PC Games"),i.CreateMagazines());
        
            
    } // end of testJournals
    
    @Test public void testIQuantity(){
        
        // to be conducted .... 
    }
    
    @Test public void  testgetEmailAddress(){
        
        Person pa = new Person();
        
        assertNull(pa.getEmailAddress());
        
    } // end of test email 
    
    
    @Test public void testOrders(){
        
        Orders o = new Orders();
        
        assertEquals("FooBoo", o.CheckOutItem("FooBoo"));
        assertEquals("Book1", o.CheckInItem("Book1"));
        //assertEquals(12, o.AddItem(12));
       // assertEquals("wrafiq@gmail.com",o.RegisterPerson("wrafiq@gmail.com"));
        
         
        
    }// end of orders 
    
    
    
    
    
}// end of test class 
