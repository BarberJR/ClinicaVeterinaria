/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.clinicaveterinaria.Modelo;
/**
 *
 * @author Estudiante
 */
public abstract class Animal {
    private String nombre;
    private String especie;
    private int edad;
    private String raza;
    
    public Animal(String nombre,String especie,int edad,String raza){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
    }
    
    
 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
