/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import library.Books;
import library.Items;
import library.Journals;
import library.Magazines;

import library.Orders;
import library.Person;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

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
    
    
    @Test public void testGetSETBook()
    {
         Items b = new Books("Book","hardcopy","SCFI",234,"dddd");
   
        // assert statements book constructor 
        
        assertEquals("Book",b.getItemName());
        assertEquals("hardcopy",b.getItemDetails());
        assertEquals("SCFI",b.getItemType());
        assertEquals(234,b.getItemCode());
    }  
   
    @Test public void testGetSETJournals(){
       
        Items j = new Journals("Journal","IEEE","Springer",3456,"Java in Action",45.678);;
        
        assertEquals("Journal",j.getItemName());
        assertEquals("IEEE",j.getItemDetails());
        assertEquals("Springer",j.getItemType());
     
    } // end of books class get / set journals 
    
    @Test public void testGetSETMagazines(){
        
        Items m = new Magazines("Magazine", "Paper", "SCFI", 2568, "PC Gamer", 34);
         
        assertEquals("Magazine",m.getItemName());
        assertEquals("Paper",m.getItemDetails());
        assertEquals("SCFI",m.getItemType());
        assertEquals(2568,m.getItemCode());  
    }
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
    
    @Test
    public void out() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    public void err() {
        System.err.print("hello again");
        assertEquals("hello again", errContent.toString());
    } 
    
    private Items testarraylist; 
    @Test public void testJournalsGetData(){
        
        // Items j = new Journals("Journal","IEEE","Springer",3456,"Java in Action",45.678);
        
          testarraylist = new Journals("Journal","IEEE","Springer",3456,"Java in Action",45.678);
          
          String data = testarraylist.getItemName();
          assertNotNull(data);
          assertEquals(data,"Journal");
            
    } // end of testJournals
    
   
    @Test public void testOrders(){
      Items m = new Magazines("Magazine", "Paper", "SCFI", 2568, "PC Gamer", 34); 
      Orders o = new Orders("GunsBook", "FirePower", "NewPaper", 340,1.98);
         
      o.CheckInItem(m.itemList, 1568);
      
        assertEquals(234, o.CheckInItem(m.itemList, 234) );
        assertEquals(1568, o.CheckInItem(m.itemList, 1568) );     
        
    }// end of orders 
    
    // standard test 
    
    @Test public void testjournaltitle(){
        
        Items j = new Journals("Journal","IEEE","Springer",3456,"Java in Action",45.678);
        
        assertEquals("Journal",j.getItemName());
    }
    
    @Test public void testPerson(){
        
        Person p = new Person("Waheed","wrafiq@gmail.com","abcd");
        
        assertEquals("Waheed",p.getFullName());
        
    }
    
    
    
    
}// end of test class 
