/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad;

/**
 *
 * @author Erick Arias
 */
public abstract class persona {
    String nombre ;
    String numeroTelefono ;
    String correoelectronico ;
    
    
    public Persona (String nombre ,String nuemroTelefono,String correoElectronico){
        this.nombre=nombre;
        this.numeroTelefono=nuemroTelefono;
        this.correoElectronico=correoElectronico;
        
    }
    
    public abstract void comprarPaseEstacionamiento();
}
