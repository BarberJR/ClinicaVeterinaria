package com.mycompany.clinicaveterinaria.Vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */

import java.util.List;
import com.mycompany.clinicaveterinaria.Modelo.Consulta;
import com.mycompany.clinicaveterinaria.Modelo.Mascota;
import com.mycompany.clinicaveterinaria.Modelo.Medicamento;
import com.mycompany.clinicaveterinaria.Modelo.Propietario;


public class VeterinariaVista {

    public void mostrarPropietariosConMascotas(
            List<Propietario> propietarios) {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("       PROPIETARIOS Y SUS MASCOTAS");
        System.out.println("==============================================");

        for (Propietario propietario : propietarios) {

            System.out.println();
            System.out.println("Propietario: "
                    + propietario.getNombre());

            System.out.println("Documento: "
                    + propietario.getDocumento());

            System.out.println("Telefono: "
                    + propietario.getTelefono());

            System.out.println("Direccion: "
                    + propietario.getDireccion());

            System.out.println("----------------------------------------------");

            if (propietario.getMascotas().isEmpty()) {

                System.out.println("No tiene mascotas registradas.");

            } else {

                for (Mascota mascota : propietario.getMascotas()) {

                    System.out.println("Mascota:");
                    System.out.println("  Nombre: "
                            + mascota.getNombre());

                    System.out.println("  Especie: "
                            + mascota.getEspecie());

                    System.out.println("  Raza: "
                            + mascota.getRaza());

                    System.out.println("  Edad: "
                            + mascota.getEdad() + " años");

                    System.out.println("  Identificacion: "
                            + mascota.getNumeroIdentificacion());

                    System.out.println("  Estado de salud: "
                            + mascota.getEstadoSalud());

                    System.out.println();
                }
            }
        }
    }

    public void mostrarConsultas(List<Consulta> consultas) {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("            CONSULTAS REALIZADAS");
        System.out.println("==============================================");

        for (Consulta consulta : consultas) {

            System.out.println();
            System.out.println("Fecha: "
                    + consulta.getFecha());

            System.out.println("Mascota: "
                    + consulta.getMascota().getNombre());

            System.out.println("Motivo: "
                    + consulta.getMotivo());

            System.out.println("Diagnostico: "
                    + consulta.getDiagnostico());

            if (consulta.getVeterinario() != null) {

                System.out.println("Veterinario: "
                        + consulta.getVeterinario().getNombre());

                System.out.println("Especialidad: "
                        + consulta.getVeterinario().getEspecialidad());
            }

            System.out.println("----------------------------------------------");
        }
    }

    public void mostrarMedicamentosRecetados(
            List<Consulta> consultas) {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("         MEDICAMENTOS RECETADOS");
        System.out.println("==============================================");

        for (Consulta consulta : consultas) {

            System.out.println();
            System.out.println("Consulta de: "
                    + consulta.getMascota().getNombre());

            if (consulta.getMedicamentos().isEmpty()) {

                System.out.println("No se recetaron medicamentos.");

            } else {

                for (Medicamento medicamento
                        : consulta.getMedicamentos()) {

                    System.out.println("Medicamento: "
                            + medicamento.getNombre());

                    System.out.println("  Dosis: "
                            + medicamento.getDosis());

                    System.out.println("  Frecuencia: "
                            + medicamento.getFrecuencia());

                    System.out.println("  Cantidad: "
                            + medicamento.getCantidad());

                    System.out.println();
                }
            }
        }
    }

    public void mostrarTitulo() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("          CLINICA VETERINARIA");
        System.out.println("       SISTEMA DE GESTION - MVC");
        System.out.println("==============================================");
    }
}
