/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import javax.swing.JTable;
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
public class AnimalSearchTest {

    private static Logger logger = LoggerFactory.getLogger(AnimalDetailTest.class);

    public AnimalSearchTest() {
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
     * Test of main method, of class AnimalSearch.
     */
    @Test
    public void testMain() {
    }

    @Test
    public void testAnimalSearch() {

        logger.info("This is an INFO message:show details");

        JTextField in1 = new JTextField();
        String a1 = in1.getText();
        assertFalse(a1, equals(null));
        assertEquals(a1, a1);
        JTable t = new JTable();
        assertFalse("not null", equals(null));
    }
}
