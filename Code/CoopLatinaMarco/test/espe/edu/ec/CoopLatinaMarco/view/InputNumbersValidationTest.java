
package espe.edu.ec.CoopLatinaMarco.view;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
public class InputNumbersValidationTest {
    
    public InputNumbersValidationTest() {
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
     * Test of ValidationNumbers method, of class InputNumbersValidation.
     */
    @Test
    public void testValidationNumbers() {
        System.out.println("ValidationNumbers");
        String inputJT = "";
        InputNumbersValidation instance = new InputNumbersValidation();
        boolean expResult = false;
        boolean result = instance.ValidationNumbers(inputJT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NumberValidation method, of class InputNumbersValidation.
     */
    @Test
    public void testNumberValidation() {
        System.out.println("NumberValidation");
        JTextField txtField = null;
        KeyEvent evt = null;
        JLabel lblfield = null;
        InputNumbersValidation instance = new InputNumbersValidation();
        instance.NumberValidation(txtField, evt, lblfield);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NumberandLengthValidation method, of class InputNumbersValidation.
     */
    @Test
    public void testNumberandLengthValidation() {
        System.out.println("NumberandLengthValidation");
        JTextField txtField = null;
        KeyEvent evt = null;
        JLabel lblfield = null;
        int length = 0;
        InputNumbersValidation instance = new InputNumbersValidation();
        instance.NumberandLengthValidation(txtField, evt, lblfield, length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
