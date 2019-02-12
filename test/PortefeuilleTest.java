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
public class PortefeuilleTest {
    
    /**
     *
     */
    public PortefeuilleTest() {
        
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getLibelleP method, of class Portefeuille.
     */
    @Test
    public void testGetLibelleP() {
        System.out.println("getLibelleP");
        Portefeuille instance = null;
        String expResult = "";
        String result = instance.getLibelleP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValeur method, of class Portefeuille.
     */
    @Test
    public void testGetValeur() {
        System.out.println("getValeur");
        String date = "";
        Portefeuille instance = null;
        float expResult = 0.0F;
        float result = instance.getValeur(date);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acheterAction method, of class Portefeuille.
     * @throws java.lang.Exception
     */
    @Test
    public void testAcheterAction() throws Exception {
        System.out.println("acheterAction");
        int q = 0;
        Action a = null;
        Portefeuille instance = null;
        instance.acheterAction(q, a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vendreAction method, of class Portefeuille.
     * @throws java.lang.Exception
     */
    @Test
    public void testVendreAction() throws Exception {
        System.out.println("vendreAction");
        Action a = null;
        int nbA = 0;
        Portefeuille instance = null;
        instance.vendreAction(a, nbA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActions method, of class Portefeuille.
     */
    @Test
    public void testGetActions() {
        System.out.println("getActions");
        Action a = null;
        Portefeuille instance = null;
        Quantite expResult = null;
        Quantite result = instance.getActions(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
