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
    
    public CitaM Guardar(Paciente paciente, Especialidad especialidad, MedicoM medico, String descripcion, String fecha, String hora){
        CitaM ncita = new CitaM(paciente, especialidad, medico, descripcion, fecha, hora);
        citas.add(ncita);
        return ncita;
    }
    public ArrayList<CitaM> ListarCitas(){
        return citas;
    }
        
}
