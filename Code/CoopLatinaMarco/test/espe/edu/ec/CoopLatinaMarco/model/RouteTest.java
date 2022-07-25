
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
public class RouteTest {
    
    public RouteTest() {
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
     * Test of toString method, of class Route.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Route instance = new Route();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNameRoute method, of class Route.
     */
    @Test
    public void testGetNameRoute() {
        System.out.println("getNameRoute");
        Route instance = new Route();
        String expResult = "";
        String result = instance.getNameRoute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNameRoute method, of class Route.
     */
    @Test
    public void testSetNameRoute() {
        System.out.println("setNameRoute");
        String nameRoute = "Valle";
        Route instance = new Route();
        instance.setNameRoute(nameRoute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdRoute method, of class Route.
     */
    @Test
    public void testGetIdRoute() {
        System.out.println("getIdRoute");
        Route instance = new Route();
        int expResult = 0;
        int result = instance.getIdRoute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdRoute method, of class Route.
     */
    @Test
    public void testSetIdRoute() {
        System.out.println("setIdRoute");
        int idRoute = 0;
        Route instance = new Route();
        instance.setIdRoute(idRoute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceKm method, of class Route.
     */
    @Test
    public void testGetDistanceKm() {
        System.out.println("getDistanceKm");
        Route instance = new Route();
        int expResult = 20;
        int result = instance.getDistanceKm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceKm method, of class Route.
     */
    @Test
    public void testSetDistanceKm() {
        System.out.println("setDistanceKm");
        int distanceKm = 15;
        Route instance = new Route();
        instance.setDistanceKm(distanceKm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceOfRoute method, of class Route.
     */
    @Test
    public void testGetPriceOfRoute() {
        System.out.println("getPriceOfRoute");
        Route instance = new Route();
        float expResult = 0.0F;
        float result = instance.getPriceOfRoute();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceOfRoute method, of class Route.
     */
    @Test
    public void testSetPriceOfRoute() {
        System.out.println("setPriceOfRoute");
        float priceOfRoute = 0.0F;
        Route instance = new Route();
        instance.setPriceOfRoute(priceOfRoute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAvalibleRoute method, of class Route.
     */
    @Test
    public void testIsAvalibleRoute() {
        System.out.println("isAvalibleRoute");
        Route instance = new Route();
        boolean expResult = false;
        boolean result = instance.isAvalibleRoute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvalibleRoute method, of class Route.
     */
    @Test
    public void testSetAvalibleRoute() {
        System.out.println("setAvalibleRoute");
        boolean avalibleRoute = false;
        Route instance = new Route();
        instance.setAvalibleRoute(avalibleRoute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
