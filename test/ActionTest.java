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

/**
 *
 * @author 21203630
 */
public class ActionTest {
    
    public ActionTest() {
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

    /**
     * Test of getLibelle method, of class Action.
     */
    @Test
    public void testGetLibelle() {
        System.out.println("getLibelle");
        Action instance = null;
        String expResult = "";
        String result = instance.getLibelle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValeur method, of class Action.
     */
    @Test
    public void testGetValeur() {
        System.out.println("getValeur");
        String date = "";
        Action instance = null;
        float expResult = 0.0F;
        float result = instance.getValeur(date);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ActionImpl extends Action {

        public ActionImpl() {
            super("");
        }

        public float getValeur(String date) {
            return 0.0F;
        }
    }
    
}
