/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmploclase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laboratorio
 */
public class CursoTest {
    
    public CursoTest() {
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
     * Test of toString method, of class Curso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Curso instance = new Curso();
        String expResult = ""/*"666, Progra II, 4"*/;
        instance.nombre = "";//Progra II";
        instance.creditos= 4;
        instance.id=666;
        String result = instance.toString();
        assertEquals(expResult, result);
      
    }
    
}
