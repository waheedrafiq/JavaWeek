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
import uniquesum.ChkUniqueSum;

/**
 *
 * @author MobileLaptopWR
 */

public class TestUniqueSum {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test public void TestCheckUnqueSum(){
       ChkUniqueSum un = new ChkUniqueSum();
       
        assertEquals(6,(un.CheckUnqueSum(1,2,3)));
        assertEquals(0,(un.CheckUnqueSum(3,3,3)));
        assertEquals(4,(un.CheckUnqueSum(1,1,2)));
        
    }
}
