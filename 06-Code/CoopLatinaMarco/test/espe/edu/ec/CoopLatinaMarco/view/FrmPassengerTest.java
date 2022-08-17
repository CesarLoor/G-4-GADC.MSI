
package espe.edu.ec.CoopLatinaMarco.view;

import java.awt.Image;
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
public class FrmPassengerTest {
    
    public FrmPassengerTest() {
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
     * Test of getIconImage method, of class FrmPassenger.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        FrmPassenger instance = new FrmPassenger();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populatePassengerTable method, of class FrmPassenger.
     */
    @Test
    public void testPopulatePassengerTable() {
        System.out.println("populatePassengerTable");
        FrmPassenger instance = new FrmPassenger();
        instance.loadTicketTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmPassenger.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmPassenger.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
