
package espe.edu.ec.CoopLatinaMarco.model;

import com.mongodb.client.MongoDatabase;
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
public class ConnectionTest {
    
    public ConnectionTest() {
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
     * Test of connectionDataBase method, of class Connection.
     */
    @Test
    public void testConnectionDataBase() {
        System.out.println("connectionDataBase");
        Connection instance = new Connection();
        MongoDatabase expResult = null;
        MongoDatabase result = instance.connectionDataBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
