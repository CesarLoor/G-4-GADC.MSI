
package espe.edu.ec.CoopLatinaMarco.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class ticketTest {
    
    public ticketTest() {
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
     * Test of toString method, of class ticket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ticket instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoute method, of class ticket.
     */
    @Test
    public void testGetRoute() {
        System.out.println("getRoute");
        ticket instance = null;
        String expResult = "";
        String result = instance.getRoute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoute method, of class ticket.
     */
    @Test
    public void testSetRoute() {
        System.out.println("setRoute");
        String route = "";
        ticket instance = null;
        instance.setRoute(route);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBus method, of class ticket.
     */
    @Test
    public void testGetBus() {
        System.out.println("getBus");
        ticket instance = null;
        String expResult = "";
        String result = instance.getBus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBus method, of class ticket.
     */
    @Test
    public void testSetBus() {
        System.out.println("setBus");
        String bus = "";
        ticket instance = null;
        instance.setBus(bus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class ticket.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        ticket instance = null;
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class ticket.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        ticket instance = null;
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ticket.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ticket instance = null;
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class ticket.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        ticket instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
