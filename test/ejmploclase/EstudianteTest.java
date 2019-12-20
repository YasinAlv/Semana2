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
public class EstudianteTest {
    
    public EstudianteTest() {
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

    @Test
    public void testSomeMethod() {
        
    }
    
      @Test
    public void testToString() {
        System.out.println("toString");
        Estudiante instance = new Estudiante();
        String expResult = "Carlitos, Lopez, 1, 45"; //Resultado esperado para las siguientes variales
        instance.nombre = "Carlitos";
        instance.apellido= "Lopez";
        instance.id=1;
        instance.nota=45;
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
