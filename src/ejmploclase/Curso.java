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
public class Curso {
    public int id;
    public String nombre;
    public int creditos;
    
    public Curso(){
    
        this.id=0;
        this.nombre="";
        this.creditos=0;
    }
    
      @Override  //polimorfismo de toString
    public String toString (){
        return this.id
        +", "+this.nombre
        +", "+this.creditos;
    
    }
}
