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
public class Persona {
    public String nombre, apellido;
    public int id;
    
    //Contructor: no retorna ningun dato y posee el mismo nombre que la clase
    
    public Persona(){
    
        this.nombre="";
        this.apellido="";
        this.id=0;
    
    }

    //metodos
    /*
    public void estudiar(){
    
        System.out.println("Estudiando....");
    }*/
    
    @Override  //polimorfismo de toString
    public String toString (){
        return this.nombre
        +", "+this.apellido
        +", "+this.id;
    
    }
    
}
