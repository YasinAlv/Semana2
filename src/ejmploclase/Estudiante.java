/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmploclase;

/**
 *
 * @author Laboratorio
 */
public class Estudiante  extends Persona {
    public int nota;
    
    @Override
    public String toString(){
        return super.toString()  //super es para sobreescribir el metodo
            + ", "+nota;
    }
    
    
}
