package Vista.Citas;

import Controlador.CitaControlador;
import Controlador.ControladorPaciente;
import Controlador.EspecialdadControlador;
import Controlador.MedicoControlador;
import Modelo.CitaM;
import Modelo.Especialidad;
import Modelo.MedicoM;
import Modelo.Paciente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListarC extends javax.swing.JInternalFrame {
    DefaultTableModel tm = new DefaultTableModel();
    CitaControlador cic = CitaControlador.getInstancia();
    ControladorPaciente cp = ControladorPaciente.getInstancia();
    EspecialdadControlador ec = EspecialdadControlador.getInstancia();
    MedicoControlador mc = MedicoControlador.getInstancia();
    
    public ListarC() {
        initComponents();
        txttable.setModel(tm);
        String columnas[] = {"Paciente", "Especialidad", "Medico", "Descripcion", "Fecha","Hora"};
        for (String col : columnas) {
            tm.addColumn(col);
        }
        listartodo();
        CargarPaciente();
        CargarEspecialidad();
        CargarMedicos();
        CargarFecha();
        
        cbxpacientes.addActionListener(e -> filtrarCitas());
        cbxespecialidad.addActionListener(e -> filtrarCitas());
        cbxmedicos.addActionListener(e -> filtrarCitas());
        cbxfecha.addActionListener(e -> filtrarCitas());
    }

    public void listartodo (){
        for (CitaM cim :cic.ListarCitas()) {
            Object[] fila ={cim.getPaciente().getNombre(),cim.getEspecialidad().getNombre(),cim.getMedico().getNombre(),cim.getDescripcion(),cim.getFecha(),cim.getHora()};
            tm.addRow(fila);
        }
    }
    private void CargarPaciente(){
        cbxpacientes.addItem("SELECCIONE.");
        for (Paciente pa : cp.listadoCompleto()) {
            cbxpacientes.addItem(pa.getNombre());
        }
    }
    private void CargarEspecialidad(){
        cbxespecialidad.addItem("SELECCIONE.");
        for (Especialidad es : ec.Listado()) {
            cbxespecialidad.addItem(es.getNombre());
        }
    }
    private void CargarMedicos(){
        cbxmedicos.addItem("SELECCIONE.");    
        for (MedicoM medicoModelo : mc.ListarMedicos()) {
            cbxmedicos.addItem(medicoModelo.getNombre());
        }
    }
    private void CargarFecha(){
        cbxfecha.addItem("SELECCIONE.");    
        for (CitaM cf : cic.ListarCitas()) {
            cbxfecha.addItem(cf.getFecha());
        }
    }
    private void filtrarCitas() {
        String pase = cbxpacientes.getSelectedItem().toString();
        String esse = cbxespecialidad.getSelectedItem().toString();
        String mese = cbxmedicos.getSelectedItem().toString();
        String fese = cbxfecha.getSelectedItem().toString();

     // Limpiar la tabla antes de agregar nuevas filas
        tm.setRowCount(0);
        boolean excitas = true;
        for (CitaM cim : cic.ListarCitas()) {
            boolean coincidePaciente = pase.equals("SELECCIONE.") || cim.getPaciente().getNombre().equals(pase);
            boolean coincideEspecialidad = esse.equals("SELECCIONE.") || cim.getEspecialidad().getNombre().equals(esse);
            boolean coincideMedico = mese.equals("SELECCIONE.") || cim.getMedico().getNombre().equals(mese);
            boolean coincideFecha = fese.equals("SELECCIONE.") || cim.getFecha().equals(fese);

        // Solo agregar la cita si cumple con todos los filtros seleccionados
            if (coincidePaciente && coincideEspecialidad && coincideMedico && coincideFecha) {
                Object[] fila = {
                    cim.getPaciente().getNombre(),
                    cim.getEspecialidad().getNombre(),
                    cim.getMedico().getNombre(),
                    cim.getDescripcion(),
                    cim.getFecha(),
                    cim.getHora()
                };
                tm.addRow(fila);
                excitas = false;
            }
        }
        if (excitas) {
            JOptionPane.showMessageDialog(this, "No existen citas.", "No hay citas", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttable = new javax.swing.JTable();
        cbxpacientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxespecialidad = new javax.swing.JComboBox<>();
        cbxmedicos = new javax.swing.JComboBox<>();
        cbxfecha = new javax.swing.JComboBox<>();

        jLabel1.setText("Buscar por paciente:");

        txttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(txttable);

        jLabel2.setText("Buscar por especialidad:");

        jLabel3.setText("Buscar por medico:");

        jLabel4.setText("Buscar por fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxpacientes, 0, 200, Short.MAX_VALUE)
                            .addComponent(cbxespecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxmedicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxfecha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxpacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxmedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxespecialidad;
    private javax.swing.JComboBox<String> cbxfecha;
    private javax.swing.JComboBox<String> cbxmedicos;
    private javax.swing.JComboBox<String> cbxpacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable txttable;
    // End of variables declaration//GEN-END:variables
}
