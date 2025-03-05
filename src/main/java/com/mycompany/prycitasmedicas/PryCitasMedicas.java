package com.mycompany.prycitasmedicas;
import Controlador.CitaControlador;
import Controlador.ControladorPaciente;
import Controlador.EspecialdadControlador;
import Controlador.MedicoControlador;
import Modelo.Especialidad;
import Vista.Principal;
public class PryCitasMedicas {

    public static void main(String[] args) {
        Principal p = new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        
        ControladorPaciente cp = ControladorPaciente.getInstancia();
        cp.guardarDatos("12", "luis", 34, true);
        cp.guardarDatos("34", "pedro", 25, true);
        cp.guardarDatos("56", "juan", 40, true);
        
        EspecialdadControlador ec = EspecialdadControlador.getInstancia();
        Especialidad ec1 = ec.GuardarEspecialidad("Cardiologuia");
        Especialidad ec2 = ec.GuardarEspecialidad("Odontologuia");
        Especialidad ec3 = ec.GuardarEspecialidad("Traumatologuia");
        
        MedicoControlador mc = MedicoControlador.getInstancia();
        mc.Guardar(ec1, "321", "Dr.Carlos", 56, true);
        mc.Guardar(ec1, "123", "Dr.Maria", 54, false);
        mc.Guardar(ec3, "456", "Dr.Ana", 45, false);
        mc.Guardar(ec2, "654", "Dr.Raul", 65, true);        
        
    }
}
