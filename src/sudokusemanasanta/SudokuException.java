/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusemanasanta;

/**
 *Clase sudokuException que lanzara un mensaje si falla algun procreso
 * @author Antonio
 */
class SudokuException extends Exception
{
    public SudokuException(String mensaje)
    {
        super(mensaje);
    }
}
