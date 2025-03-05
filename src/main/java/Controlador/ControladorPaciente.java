package Controlador;
import Modelo.Paciente;
import java.util.ArrayList;

public class ControladorPaciente {
    public ArrayList<Paciente>pacientes;

    public static ControladorPaciente instancia;
    
    private ControladorPaciente() {
    this.pacientes = new ArrayList<>();    
    }
    
    public static ControladorPaciente getInstancia(){
        if(instancia == null){
            instancia = new ControladorPaciente();
        }
        return instancia;
    }
    
    public Paciente guardarDatos(String cedula, String nombre, int edad, boolean sexo){
        Paciente modelopaciente = new  Paciente(cedula, nombre, edad, sexo);
        pacientes.add(modelopaciente);
        return modelopaciente;
    }
    
    public ArrayList<Paciente> listadoCompleto(){
        return pacientes;
    }
    
    public ArrayList<Paciente>BuscarPaciente(String cedula){
        ArrayList<Paciente> nuevaLista= new ArrayList<>();
        for (Paciente paciente : pacientes) {
            if (paciente.getCedula().contains(cedula)){
                nuevaLista.add(paciente);
            }
        }
        return nuevaLista;
    }
    public Paciente PacientePorCedula(String cedula){
        for (Paciente paciente : pacientes) {
            if (paciente.getCedula().equals(cedula)){
                return paciente;
            }
        }
        return null;
    }
    public boolean cedulaExiste(String cedula) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }
    public boolean eliminarPaciente(String cedula) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCedula().equals(cedula)) {
                pacientes.remove(paciente);
                return true;
            }
        }
        return false; 
    }
    
}
