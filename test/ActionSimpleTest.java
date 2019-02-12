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
 * @author Toky
 */
public class ActionSimpleTest {
    
    public ActionSimpleTest() {
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
     * Test of affecterCours method, of class ActionSimple.
     */
    @Test
    public void testAffecterCours() {
        System.out.println("affecterCours");
        Cours c = null;
        ActionSimple instance = null;
        instance.affecterCours(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValeur method, of class ActionSimple.
     */
    @Test
    public void testGetValeur() {
        System.out.println("getValeur");
        String date = "";
        ActionSimple instance = null;
        float expResult = 0.0F;
        float result = instance.getValeur(date);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
