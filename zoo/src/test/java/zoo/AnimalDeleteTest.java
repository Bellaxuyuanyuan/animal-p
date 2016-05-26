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
public class AnimalDeleteTest {


    @Test
    public void testMain() {

    }

    @Test
    public void testInsertAnimal() {

        JTextField in1 = new JTextField();
        String a1 = in1.getText();
        assertFalse(a1, equals(null));
        assertEquals(a1, a1);
    }

}
