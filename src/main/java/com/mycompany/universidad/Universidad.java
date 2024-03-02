/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universidad;

/**
 *
 * @author Erick Arias
 */
public class Universidad {

    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante (nombre:"erick",numerotelefono:"0983933138",correoelectronico"ariaserick580@gmail.com",numeroEstudiante:"e165",notamedia:8.0);
        Profesor proferos =new Profesor(nombre:"pedro",nuemrotelefono:"09+80532014",correoelectronico:"pedro@ejemplo.com",salario:3.500);
        
        
        
        estudiante.comprarPaseestacionamiento();
        estudiante.estudiar(asignatura:"lenguaje");
        estudiante.estudiar(asignatura:"educacion fisica",horas:2);
        
        
        system.out.pritnIn();
        
        profesor.comprarPaseEstacionamiento();
        profesor.darClase(asignatura:"programacion");ç
                
    }            
    
}
