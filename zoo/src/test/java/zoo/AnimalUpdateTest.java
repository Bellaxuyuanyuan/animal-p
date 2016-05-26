/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Administrator
 */
public class AnimalUpdateTest {

    private static Logger logger = LoggerFactory.getLogger(AnimalDetailTest.class);

    public AnimalUpdateTest() {
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
     * Test of main method, of class AnimalUpdate.
     */
    @Test
    public void testMain() {

    }

    @Test
    public void testAnimalUpdate() {
        logger.info("This is an INFO message:show details");

        JTextField in1 = new JTextField(), in2 = new JTextField(), in3 = new JTextField(), in4 = new JTextField(), in5 = new JTextField();

        String a1 = in1.getText();
        String a2 = in2.getText();
        String a3 = in3.getText();
        String a4 = in4.getText();
        String a5 = in5.getText();

        assertFalse(a1, equals(null));
        assertEquals(a5, a5);
        assertEquals(a4, a4);
        assertEquals(a3, a3);
        assertEquals(a2, a2);
        assertEquals(a1, a1);
    }

}
