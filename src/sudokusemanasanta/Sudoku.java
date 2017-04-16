/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudokusemanasanta;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class Sudoku 
{
    //variables privadas de la clase
    private ArrayList<ArrayList<Integer>> sudo;
    private Random aleatorio;
    
    
    public Sudoku()
    {
        sudo = new ArrayList<>();
    }
    
    
    public void inicializar()
    {
        aleatorio = new Random();
        sudo = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) 
        {
            ArrayList<Integer> huecos = new ArrayList<>();
            for (int j = 0; j < 9; j++) 
            {
                huecos.add(0);
            }
            sudo.add(huecos);
        }
        
        
        int contador= 0;
        while (contador<24)
        {
            contador++;
            int px = aleatorio.nextInt(9-1)+1;
            int py = aleatorio.nextInt(9-1)+1;
            int num_aleatorio = aleatorio.nextInt(9-1)+1;
            
            if (puedoInsertar(px, py, num_aleatorio) == true)
            {
                try {
                    modificarElemento(px, py, num_aleatorio);
                } catch (SudokuException ex) 
                {
                    System.out.println("Error");
                }
            }
   
        }
    }
    
    
    @Override
    public String toString()
    {
        String resultadoFinal = "";
        for (int i = 0; i < sudo.size(); i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                int numero = sudo.get(i).get(j);
                resultadoFinal += numero+" ";
            }
           resultadoFinal +="\n"; 
        }
        return resultadoFinal;
    }
    
    public void modificarElemento(int fila, int columna, int elemento) throws SudokuException
    {
        if (puedoInsertar(fila, columna, elemento)== true)
        {
            sudo.get(fila).set(columna, elemento);
        }
        else
            System.out.println("Error modificando elemento");
    }
    
    public void vaciarElemento (int fila, int columna)
    {
        sudo.get(fila-1).set(columna-1, 0);
    }
    
    private boolean comprobarFila(int fila, int elemento)
    {
        boolean resultado = true;
        for (int i = 0; i < sudo.size(); i++) 
        {
            if (sudo.get(fila).get(i) == elemento)
            {
                resultado = false;
            }
        }
        return resultado;
    }
    
    private boolean comprobarColumna(int columna, int elemento)
    {
        boolean resultado = true;
        for (int i = 0; i < sudo.size(); i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                if (sudo.get(i).get(columna) == elemento)
                {
                       resultado = false;
                }
            }
                
        }
        
        return resultado;
    }
    
    private boolean comprobarCuadrante(int fila, int columna, int elemento)
    {
        boolean resultado = true;
        int fila1 = 0;
        int fila2 = 0;
        int columna1 = 0;
        int columna2 = 0;
        
        if (fila >= 0 && fila <= 2)
        {
            fila1 = 0;
            fila2 = 2;
        }
        if (fila >= 3 && fila <= 5)
        {
            fila1 = 3;
            fila2 = 5;
        }
        if (fila >= 6 && fila <= 8)
        {
            fila1 = 6;
            fila2 = 8;
        }
        
        
        if (columna >= 0 && columna <= 2)
        {
            columna1 = 0;
            columna2 = 2;
        }
        if (columna >= 3 && columna <= 5)
        {
            columna1 = 0;
            columna2 = 2;
        }
        if (columna >= 6 && columna <= 8)
        {
            columna1 = 0;
            columna2 = 2;
        }
        
        for (int i = fila1; i < fila2; i++)
        {
            for (int j = columna1; j < columna2; j++) 
            {
                if (sudo.get(i).get(j) == elemento)
                {
                    if (columna >= 0 && columna <= 2)
                    {
                        resultado = false;
                    }
        
                }
            }
        }
        
        
        return resultado;
    }
    
    private boolean puedoInsertar(int fila, int columna, int elemento)
    {
        boolean resultado = false;
        
        if (comprobarFila(fila, elemento) == true && comprobarColumna(columna, elemento) == true && comprobarCuadrante(fila, columna, elemento) == true)
        {
            resultado = true;
        }
        return resultado;
    }
}
