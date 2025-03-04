package Modelo;

public class CitaM {
    public Paciente paciente;
    public Especialidad especialidad;
    public MedicoM medico;
    public String descripcion;
    public String fecha;
    public String hora;

    public CitaM(Paciente paciente, Especialidad especialidad, MedicoM medico, String descripcion, String fecha, String hora) {
        this.paciente = paciente;
        this.especialidad = especialidad;
        this.medico = medico;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public MedicoM getMedico() {
        return medico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
}
