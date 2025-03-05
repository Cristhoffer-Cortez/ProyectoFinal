package Vista.Medicos;

import Vista.*;
import Controlador.ControladorPaciente;
import Controlador.MedicoControlador;
import Modelo.MedicoM;
import Modelo.Paciente;
import javax.swing.table.DefaultTableModel;

public class ListarM extends javax.swing.JInternalFrame {
    DefaultTableModel tm = new DefaultTableModel();
    MedicoControlador mc = MedicoControlador.getInstancia();
    //
    public ListarM() {
        initComponents();
        tablalist.setModel(tm);
        String columnas[] = {"Cedula", "Nombre", "Edad", "Sexo","Especialidad"};
        tm.addColumn(columnas[0]);
        tm.addColumn(columnas[1]);
        tm.addColumn(columnas[2]);
        tm.addColumn(columnas[3]);
        tm.addColumn(columnas[4]);
        
        listartodo();
    }
    public void listartodo (){
        for (MedicoM mm : mc.ListarMedicos()) {
            Object[] fila ={mm.getCedula(), mm.getNombre(), mm.getEdad(), mm.getSexo(),mm.GetEspecialidadmodelo()};
            tm.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalist = new javax.swing.JTable();
        txtcedulab = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setText("Cedula a buscar: ");

        tablalist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablalist);

        txtcedulab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
        });

        jButton1.setText("ELIMINAR.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcedulab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcedulab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased
        tm.setRowCount(0);
        String cedula = txtcedulab.getText();
        for (MedicoM mm : mc.BuscarMedico(cedula)) {
            Object[] fila = {mm.getCedula(), mm.getNombre(), mm.getEdad(), mm.getSexo(),mm.GetEspecialidadmodelo()};
            tm.addRow(fila);
        }
    }//GEN-LAST:event_txtcedulaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaSeleccionada = tablalist.getSelectedRow();
    
        if (filaSeleccionada != -1) { 
        String cedulaSeleccionada = tablalist.getValueAt(filaSeleccionada, 0).toString();

        boolean eliminado = mc.eliminarMedico(cedulaSeleccionada);

            if (eliminado) {
                javax.swing.JOptionPane.showMessageDialog(this, "MEDICO ELIMINADO.");
            }

        tm.setRowCount(0);
        listartodo(); 
        } else {
        javax.swing.JOptionPane.showMessageDialog(this, "SELECCIONE UN MEDICO.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalist;
    private javax.swing.JTextField txtcedulab;
    // End of variables declaration//GEN-END:variables
}
