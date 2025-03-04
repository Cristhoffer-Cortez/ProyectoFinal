package Controlador;

import Modelo.Especialidad;
import java.util.ArrayList;

public class EspecialdadControlador {
    ArrayList<Especialidad> especialidad;
    private static EspecialdadControlador instancia;

    private EspecialdadControlador() {
        this.especialidad = new ArrayList<>();
    }
    
    public static EspecialdadControlador getInstancia(){
        if(instancia == null){
            instancia = new EspecialdadControlador();
        }
        return instancia;
    }
    
    public Especialidad GuardarEspecialidad(String especialidad){
        Especialidad modelo = new Especialidad(especialidad);
        this.especialidad.add(modelo);
        return modelo;
    }
    
    public ArrayList<Especialidad> Listado(){
        return especialidad;
    }
    
    public Especialidad obtenernombre(String nombre){
        for (Especialidad em : especialidad) {
            if(em.getNombre().equals(nombre)){
                return em;
            }
        }
        return null;
    }
    
    public ArrayList<Especialidad>BuscarEspecialidad(String cedula){
        ArrayList<Especialidad> nuevaLista= new ArrayList<>();
        for (Especialidad especialidadn : especialidad) {
            if (especialidadn.getNombre().contains(cedula)){
                nuevaLista.add(especialidadn);
            }  
        }
        return nuevaLista;
    }
    //A
}
