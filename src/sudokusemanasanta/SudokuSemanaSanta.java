/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusemanasanta;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class SudokuSemanaSanta {

    /**
     * El main constara de un menu para, inicar el sudoku, realizar movimiento, mostrar sudoku, vaciar elemento y terminar.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Sudoku juego = new Sudoku();
       Scanner teclado = new Scanner (System.in);
       int elemento, fila, columna;
       int opcion;
       System.out.println("1. Iniciar/Reiniciar sudoku.");
        System.out.println("2. Realizar movimiento.");
        System.out.println("3. Vaciar casilla.");
        System.out.println("4. Mostrar sudoku.");
        System.out.println("5. Terminar.");
        System.out.println("Introduce una opcion.");
        opcion = teclado.nextInt();
        
        
       while (opcion>=1 && opcion<=5) 
       {
           System.out.println("1. Iniciar/Reiniciar sudoku.");
           System.out.println("2. Realizar movimiento.");
           System.out.println("3. Vaciar casilla.");
           System.out.println("4. Mostrar sudoku.");
           System.out.println("5. Terminar.");
           
           switch (opcion)
           {
               case 1:
                
                        
                            juego.inicializar();
                            opcion = teclado.nextInt();
                        
                
                    break;
               case 2:
               
                    try {
                        System.out.println("Introduce la fila:");
                        fila = teclado.nextInt();
                        System.out.println("Introduce la columna:");
                        columna = teclado.nextInt();
                        System.out.println("Introduce el valor:");
                        elemento = teclado.nextInt();
                        juego.modificarElemento(fila, columna, elemento);
                    } catch (Exception ex) 
                    {
                        System.out.println("Se ha producido un error."+ex.toString());
                    }
                    opcion = teclado.nextInt();
                    break;
               
               case 3:
               
                   System.out.println("Introduce la fila:");
                    fila = teclado.nextInt();
                    System.out.println("Introduce la columna:");
                    columna = teclado.nextInt();
                   
                   juego.vaciarElemento(fila, columna);
                   opcion = teclado.nextInt();
                   break;
               
               case 4:
               
                   System.out.println(juego.toString());
                   opcion = teclado.nextInt();
                   break;
               
               case 5:
               
                   System.out.println("JUEGO TERMINADO!");
                   opcion = 0;
                   break;
               
               
           }
       }
        // TODO code application logic here
    }
    
}
