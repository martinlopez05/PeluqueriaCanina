/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;
import java.util.List;


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

    public  List<Mascota>  traerMascotas() {
        return controlpersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlpersis.borrarMascota(num_cliente);
    }

    public void editarMascota(int num_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Mascota traerMascota(int num_cliente) {
        return controlpersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota, String nombre, String raza, String color, String nomDuenio, String celDuenio, String observaciones, String alergico, String atencion) {
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAtencion(atencion);
        mascota.setAlergico(alergico);
        mascota.setObservaciones(observaciones);
        
        //modificamos la mascota 
        controlpersis.modificarMascota(mascota);
        
        //seteamos los nuevos valores del duenio
        Duenio duenio = this.buscarDuenio(mascota.getDuenio().getId());
        duenio.setCelDueño(celDuenio);
        duenio.setNombre(nomDuenio);
        
        
        //llamar a modificar dueño 
        
        this.modificarDuenio(duenio);
        
    }

    private Duenio buscarDuenio(int id) {
        return controlpersis.traerDuenio(id);
    }

    private void modificarDuenio(Duenio duenio) {
        controlpersis.modificarDuenio(duenio);
    }

    
    
    
    
}
