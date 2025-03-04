package Controlador;

import Modelo.Especialidad;
import Modelo.MedicoM;
import java.util.ArrayList;

public class MedicoControlador {
    ArrayList<MedicoM> medicos;
    private static MedicoControlador instancia;

    private MedicoControlador() {
        this.medicos = new ArrayList<>();
    }
    
    public static MedicoControlador getInstancia(){
        if(instancia == null){
            instancia = new MedicoControlador();
        }
        return instancia;
    }
    
    public MedicoM Guardar(Especialidad em,String cedula, String nombre, int edad, boolean sexo ){
        MedicoM nmedico = new MedicoM(em, cedula, nombre, edad, sexo);
        medicos.add(nmedico);
        return nmedico;
    }
    
    public ArrayList<MedicoM> ListarMedicos(){
        return medicos;
    }
    
    public ArrayList<MedicoM>BuscarMedico(String cedula){
        ArrayList<MedicoM> nuevaLista= new ArrayList<>();
        for (MedicoM medico : medicos) {
            if (medico.getCedula().contains(cedula)){
                nuevaLista.add(medico);
            }  
        }
        return nuevaLista;
    }
    
    public ArrayList<MedicoM> ListadoPorEspecilidad(String ne){
        ArrayList<MedicoM> nuevaLista= new ArrayList<>();
        for (MedicoM medico : medicos) {
            if (medico.GetEspecialidadmodelo().contains(ne)){
                nuevaLista.add(medico);
            }  
        }
        return nuevaLista;
    }
    public MedicoM MedicoPorCeducla(String cedula){
        for (MedicoM medico : medicos) {
            if (medico.getCedula().equals(cedula)){
                return medico;
            }
        }
        return null;
    }
}
