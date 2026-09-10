/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Modelo;

/**
 *
 * @author Estudiante
 */

import java.util.ArrayList;
import java.util.List;

public class Consulta {

    private String fecha;
    private String motivo;
    private String diagnostico;

    private Mascota mascota;
    private Veterinario veterinario;

    private List<Medicamento> medicamentos;

    public Consulta(String fecha, String motivo,
                    String diagnostico, Mascota mascota) {

        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.mascota = mascota;
        this.medicamentos = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void agregarMedicamento(Medicamento medicamento) {
        if (medicamento != null) {
            medicamentos.add(medicamento);
        }
    }
}