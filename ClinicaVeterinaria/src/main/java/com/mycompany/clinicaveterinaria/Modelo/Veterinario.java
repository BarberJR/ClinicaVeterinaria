/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Modelo;

public class Veterinario {

    private String nombre;
    private String documento;
    private String especialidad;
    private String telefono;

    public Veterinario(String nombre, String documento,
                       String especialidad, String telefono) {

        this.nombre = nombre;
        this.documento = documento;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Dependencia: utiliza Medicamento sin poseerlo
    public void recetar(Medicamento medicamento) {
        if (medicamento != null) {
            // La lógica de recetar se coordina desde el controlador.
            // El veterinario solamente recibe el medicamento como parámetro.
        }
    }
}
