/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import blackjack.CheckBlackJack;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MobileLaptopWR
 */
public class BlackJackJUnitTest {
    
    public BlackJackJUnitTest() {
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
    
   @Test public void testCheckBlackJackEqual() {
         CheckBlackJack bj = new CheckBlackJack();
         
         
        // assertEquals(21,(CheckBlackJack.Check21(18, 21)));
         assertEquals(21,(bj.Check21(18,21)));
         assertEquals(20,(bj.Check21(20,18)));
         assertEquals(0,(bj.Check21(22,22)));
        
    }
    
    
}
