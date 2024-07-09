/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;


public class Controladora {
   
    
    public Controladora(){
        
    }
    
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();
    
    public void guardar(String nombre, String raza, String color, String nomDuenio, String celDuenio, String observaciones, String alergico, String atencion) {
        Duenio duenio = new Duenio();
        duenio.setNombre(nomDuenio);
        duenio.setCelDueño(celDuenio);
        
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion(atencion);
        mascota.setObservaciones(observaciones);
        mascota.setDuenio(duenio);
        
        
        controlpersis.guardar(duenio,mascota);
        
        
    }
    
    
    
}
