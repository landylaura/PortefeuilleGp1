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
public class CoursTest {
    
    public CoursTest() {
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
     * Test of getValeurC method, of class Cours.
     */
    @Test
    public void testGetValeurC() {
        System.out.println("getValeurC");
        Cours instance = null;
        float expResult = 0.0F;
        float result = instance.getValeurC();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumJ method, of class Cours.
     */
    @Test
    public void testGetNumJ() {
        System.out.println("getNumJ");
        Cours instance = null;
        int expResult = 0;
        int result = instance.getNumJ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnee method, of class Cours.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Cours instance = null;
        int expResult = 0;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
