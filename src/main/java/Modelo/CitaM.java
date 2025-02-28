package Modelo;

public class CitaM {
    public String paciente;
    public String especialidad;
    public String medico;
    public String descripcion;
    public String fecha;
    public String hora;

    public CitaM(String paciente, String especialidad, String medico, String descripcion, String fecha, String hora) {
        this.paciente = paciente;
        this.especialidad = especialidad;
        this.medico = medico;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getMedico() {
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
