package Controlador;

import Modelo.CitaM;
import Modelo.Especialidad;
import Modelo.MedicoM;
import Modelo.Paciente;
import java.util.ArrayList;

public class CitaControlador {
    ArrayList<CitaM> citas;
    private static CitaControlador instancia;
    
    private CitaControlador() {
        this.citas = new ArrayList<>();
    }
    
    public static CitaControlador getInstancia(){
        if(instancia == null){
            instancia = new CitaControlador();
        }
        return instancia;
    }
    
    public CitaM Guardar(Paciente paciente, Especialidad especialidad, MedicoM medico, String descripcion, String fecha, String hora, boolean estado){
        CitaM ncita = new CitaM(paciente, especialidad, medico, descripcion, fecha, hora, estado);
        citas.add(ncita);
        return ncita;
    }
    public ArrayList<CitaM> ListarCitas(){
        return citas;
    }
    public boolean eliminarCitaPorPaciente(String nombrePaciente) {
        boolean eliminado = false;
        for (CitaM cita : citas) {
            if (cita.getPaciente().getNombre().equals(nombrePaciente)) {
            citas.remove(cita);
            eliminado = true;
            break;
            }
        }
        return eliminado; // Retorna true si se eliminó una cita, false si no se encontró ninguna
    }
}
