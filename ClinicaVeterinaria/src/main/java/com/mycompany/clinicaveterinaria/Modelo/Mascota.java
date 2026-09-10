/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Modelo;

public class Mascota extends Animal {

    private String numeroIdentificacion;
    private String estadoSalud;

    public Mascota(String nombre, String especie, int edad, String raza,
                   String numeroIdentificacion, String estadoSalud) {

        super(nombre, especie, edad, raza);
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoSalud = estadoSalud;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }
}
