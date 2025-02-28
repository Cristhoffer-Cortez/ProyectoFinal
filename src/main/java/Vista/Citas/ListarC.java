package Vista.Citas;

import Controlador.CitaControlador;
import Modelo.CitaM;
import javax.swing.table.DefaultTableModel;

public class ListarC extends javax.swing.JInternalFrame {
    DefaultTableModel tm = new DefaultTableModel();
    CitaControlador cic = CitaControlador.getInstancia();
    public ListarC() {
        initComponents();
        txttable.setModel(tm);
        String columnas[] = {"Paciente", "Especialidad", "Descripcion", "Medico", "Fecha","Hora"};
        tm.addColumn(columnas[0]);
        tm.addColumn(columnas[1]);
        tm.addColumn(columnas[2]);
        tm.addColumn(columnas[3]);
        tm.addColumn(columnas[4]);
        tm.addColumn(columnas[5]);
        listartodo();
        
    }

    public void listartodo (){
        for (CitaM cim :cic.ListarCitas()) {
            Object[] fila ={cim.getPaciente(),cim.getEspecialidad(),cim.getMedico(),cim.getDescripcion(),cim.getFecha(),cim.getHora()};
            tm.addRow(fila);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttable = new javax.swing.JTable();

        jLabel1.setText("CITAS.");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable txttable;
    // End of variables declaration//GEN-END:variables
}
