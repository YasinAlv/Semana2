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
public class ProfesorTest {
    
    public ProfesorTest() {
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
     * Test of toString method, of class Profesor.
     */
    
    //PRUEBAS UNITARIAS DE SISTEMA
    @Test
    public void testToString() {
        System.out.println("toString");
        Persona instance = new Profesor();
        String expResult = "Pedro, Lopez, 1"; //Resultado esperado para las siguientes variales
        instance.nombre = "Pedro";
        instance.apellido= "Lopez";
        instance.id=1;
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
