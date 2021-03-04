/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SSS SANTIAGO
 */
public class AuthenticationTest {
    
    public AuthenticationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of authenticateCustomer method, of class Authentication.
     */
    @Test
    public void testAuthenticateCustomer() {
        System.out.println("authenticateCustomer");
        Authentication instance = new Authentication();
        boolean expResult = false;
        boolean result = instance.authenticateCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticateWorker method, of class Authentication.
     */
    @Test
    public void testAuthenticateWorker() {
        System.out.println("authenticateWorker");
        String user = "admin";
        String pass = "admin";
        Authentication instance = new Authentication();
        boolean expResult = false;
        boolean result = instance.authenticateWorker(user, pass);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
