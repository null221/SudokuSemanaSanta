/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusemanasanta;

import Sudokusemanasanta.Sudoku;
import java.util.ArrayList;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio
 */
public class SudokuTest {
    
    public SudokuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Random aleatorio = new Random();
        ArrayList<Object> sudo = new ArrayList<>();
    }
    
    @After
    public void tearDown() {
        Random aleatorio = new Random();
        ArrayList<Object> sudo = new ArrayList<>();
    }

    /**
     * Test of inicializar method, of class Sudoku.
     */
    @Test
    public void testInicializar() {
        try
        {
        System.out.println("inicializar");
        Sudoku instance = new Sudoku();
        instance.inicializar();
            System.out.println("El metodo inicializar funciona correctamente");
        }catch(Exception e)
        {
        // TODO review the generated test code and remove the default call to fail.
        fail("El metodo inicializar no funciona");
        }
    }

    /**
     * Test of toString method, of class Sudoku.
     */
    @Test
    public void testToString() {
        try{
        System.out.println("toString");
        Sudoku instance = new Sudoku();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
            System.out.println("El metodo toString funciona correctamente");
        }catch(Exception e)
        {
        // TODO review the generated test code and remove the default call to fail.
        fail("El metodo toString no funciona");
        }
    }

    /**
     * Test of modificarElemento method, of class Sudoku.
     */
    @Test
    public void testModificarElemento() {
        try{
        System.out.println("modificarElemento");
        int fila = 0;
        int columna = 0;
        int elemento = 1;
        Sudoku instance = new Sudoku();
        instance.modificarElemento(fila, columna, elemento);
            System.out.println("El metodo modificar elemento funciona correctamente");
        }catch(Exception e)
        {
        // TODO review the generated test code and remove the default call to fail.
        fail("El metodo modificar elemento no funciona.");
        }
    }

    /**
     * Test of vaciarElemento method, of class Sudoku.
     */
    @Test
    public void testVaciarElemento() {
        try{
        System.out.println("vaciarElemento");
        int fila = 0;
        int columna = 0;
        Sudoku instance = new Sudoku();
        instance.vaciarElemento(fila, columna);
            System.out.println("El metodo vaciar elemento funciona correctamente");
        }catch(Exception e)
        {
        // TODO review the generated test code and remove the default call to fail.
        fail("El metodo vaciar elemento no funciona");
        }
    }
    
}
