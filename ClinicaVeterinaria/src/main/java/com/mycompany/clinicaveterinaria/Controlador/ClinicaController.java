/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Controlador;

/**
 *
 * @author Estudiante
 */


import java.util.ArrayList;
import java.util.List;

import com.mycompany.clinicaveterinaria.Modelo.Consulta;
import com.mycompany.clinicaveterinaria.Modelo.Mascota;
import com.mycompany.clinicaveterinaria.Modelo.Medicamento;
import com.mycompany.clinicaveterinaria.Modelo.Propietario;
import com.mycompany.clinicaveterinaria.Modelo.Veterinario;
import com.mycompany.clinicaveterinaria.Vista.VeterinariaVista;


public class ClinicaController {

    private List<Propietario> propietarios;
    private List<Consulta> consultas;

    private VeterinariaVista vista;

    public ClinicaController() {

        propietarios = new ArrayList<>();
        consultas = new ArrayList<>();

        vista = new VeterinariaVista();
    }

    public void iniciar() {

        cargarDatosPrueba();

        asociarVeterinarios();

        recetarMedicamentos();

        vista.mostrarTitulo();

        vista.mostrarPropietariosConMascotas(propietarios);

        vista.mostrarConsultas(consultas);

        vista.mostrarMedicamentosRecetados(consultas);
    }

    private void cargarDatosPrueba() {

        // ==========================================
        // PRIMER PROPIETARIO
        // ==========================================

        Propietario propietario1 = new Propietario(
                "Carlos Martinez",
                "1001234567",
                "3004567890",
                "Calle 45 #12-30"
        );

        Mascota mascota1 = new Mascota(
                "Max",
                "Perro",
                5,
                "Golden Retriever",
                "M001",
                "Salud estable"
        );

        Mascota mascota2 = new Mascota(
                "Luna",
                "Gato",
                3,
                "Siames",
                "M002",
                "Requiere control veterinario"
        );

        propietario1.agregarMascota(mascota1);
        propietario1.agregarMascota(mascota2);

        propietarios.add(propietario1);

        // ==========================================
        // SEGUNDO PROPIETARIO
        // ==========================================

        Propietario propietario2 = new Propietario(
                "Laura Gomez",
                "1009876543",
                "3019876543",
                "Carrera 20 #50-15"
        );

        Mascota mascota3 = new Mascota(
                "Rocky",
                "Perro",
                7,
                "Bulldog",
                "M003",
                "En tratamiento"
        );

        propietario2.agregarMascota(mascota3);

        propietarios.add(propietario2);

        // ==========================================
        // VETERINARIOS
        // ==========================================

        Veterinario veterinario1 = new Veterinario(
                "Dr. Andres Rodriguez",
                "V001",
                "Medicina interna",
                "3105551111"
        );

        Veterinario veterinario2 = new Veterinario(
                "Dra. Sofia Perez",
                "V002",
                "Cirugia veterinaria",
                "3105552222"
        );

        // ==========================================
        // CONSULTAS
        // ==========================================

        Consulta consulta1 = new Consulta(
                "08/09/2026",
                "Revision general",
                "Estado de salud estable",
                mascota1
        );

        consulta1.setVeterinario(veterinario1);

        Consulta consulta2 = new Consulta(
                "08/09/2026",
                "Problemas digestivos",
                "Gastritis leve",
                mascota2
        );

        consulta2.setVeterinario(veterinario1);

        Consulta consulta3 = new Consulta(
                "08/09/2026",
                "Dolor en una extremidad",
                "Inflamacion muscular",
                mascota3
        );

        consulta3.setVeterinario(veterinario2);

        consultas.add(consulta1);
        consultas.add(consulta2);
        consultas.add(consulta3);
    }

    private void asociarVeterinarios() {

        // Las asociaciones ya se realizan al crear
        // las consultas en cargarDatosPrueba().
    }

    private void recetarMedicamentos() {

        // ==========================================
        // MEDICAMENTOS PARA CONSULTA 1
        // ==========================================

        Medicamento medicamento1 = new Medicamento(
                "Multivitaminico veterinario",
                "1 tableta",
                "Cada 24 horas",
                10
        );

        Medicamento medicamento2 = new Medicamento(
                "Suplemento Omega 3",
                "1 capsula",
                "Cada 24 horas",
                15
        );

        consultas.get(0).agregarMedicamento(medicamento1);
        consultas.get(0).agregarMedicamento(medicamento2);

        // ==========================================
        // MEDICAMENTO PARA CONSULTA 2
        // ==========================================

        Medicamento medicamento3 = new Medicamento(
                "Omeprazol veterinario",
                "1 comprimido",
                "Cada 12 horas",
                14
        );

        consultas.get(1).agregarMedicamento(medicamento3);

        // ==========================================
        // MEDICAMENTOS PARA CONSULTA 3
        // ==========================================

        Medicamento medicamento4 = new Medicamento(
                "Antiinflamatorio veterinario",
                "1 comprimido",
                "Cada 12 horas",
                10
        );

        Medicamento medicamento5 = new Medicamento(
                "Analgesico veterinario",
                "5 ml",
                "Cada 8 horas",
                7
        );

        consultas.get(2).agregarMedicamento(medicamento4);
        consultas.get(2).agregarMedicamento(medicamento5);
    }
}
