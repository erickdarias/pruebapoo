/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad;

import static java.time.Clock.system;
import static java.time.InstantSource.system;

/**
 *
 * @author erick arias 
 */
class Estudiante extends Persona {
    private String numeroEstudiante;
    public double notaMedia;
    
    
    public Estudiante(String nombre, String numeroTelefono, String correoElectronico, double notaMedia) {
     super(nombre, numeroTelefono, correoElectronico);
     this.numeroEstudiante = numeroEstudiante;
     this.notaMedia = notaMedia;
    }
    
    
    @Override
    public void comprarPaseEstacionamiento(){
        system.out.println(nombre+ "ha comprado un pase de estacionamiento.");
    }
    public void estudiar(String asignatura){
        system.out.println(nombre+ "está estudiando + asignatura + ".");
    }
    public void estudiar(String asignatura,int horas){
        system.out.println(nombre+ "está estudiando" ´+ asignatura + "durante" + horas  + "horas,");
    }
}
    

   



