/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import toohot.ChkTooHot;

/**
 *
 * @author MobileLaptopWR
 */
public class TestingTooHot {
    
    public TestingTooHot() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    /**
     *
     */
    
    @Test public void testingTooHot()
    {
        ChkTooHot th = new ChkTooHot();
        
        assertEquals(60,(th.ChkTooHot(60)));
        assertEquals(90,(th.ChkTooHot(90)));
        assertEquals(40,(th.ChkTooHot(40)));
        
    }
    
    /**
     *
     */
   

    
}
