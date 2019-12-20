/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmploclase;

import Clases.EstudiantePrueba;

/**
 *
 * @author Laboratorio
 */
public class EjmploClase {

    /**
     * @param args the command args line arguments
     */
    public static void main(String[] args) {
        
        Estudiante miEstudiante = new Estudiante(); //Estancia miEstudiante de tipo Estudiante
        
        miEstudiante.nombre="Carlitos";
        miEstudiante.apellido="Lopez";
        miEstudiante.id=1;
        miEstudiante.nota=100;
        System.out.println(miEstudiante.toString());
        
        Profesor miProfe = new Profesor(); //Estancia miProfe de tipo profesor
        Curso miCurso = new Curso();  //Estancia miCurso de tipo Curso
        
        miProfe.nombre="Pedro";
        miProfe.apellido="Lopez";
        miProfe.id=1;
        
        miCurso.nombre="Progra II";
        miCurso.creditos=4;
        miCurso.id=666;
        
        System.out.println(miProfe.toString());
        System.out.println(miCurso.toString());
  
    }  
}
