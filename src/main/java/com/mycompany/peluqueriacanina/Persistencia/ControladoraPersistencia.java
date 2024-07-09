/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.Persistencia;

import com.mycompany.peluqueriacanina.Logica.Duenio;
import com.mycompany.peluqueriacanina.Logica.Mascota;

/**
 *
 * @author Usuario
 */
public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpa.create(duenio);
        mascotaJpa.create(mascota);
        
    }
}
