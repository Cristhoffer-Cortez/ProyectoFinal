package Vista.Paciente;

import Vista.*;
import Controlador.ControladorPaciente;
import javax.swing.JOptionPane;

public class IngresarP extends javax.swing.JInternalFrame {
    
    public IngresarP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        txtsexo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Cedula: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Edad: ");

        txtsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOMBRE", "MUJER" }));

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearPaciente(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(txtnombre)
                        .addComponent(jLabel3)
                        .addComponent(txtedad))
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearPaciente
        String Cedula = txtcedula.getText();
        String Nombre = txtnombre.getText();
        String Edad = txtedad.getText();
        boolean Sexo = txtsexo.getSelectedItem().toString().equals("HOMBRE");
        if (Cedula.isEmpty() || Nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "LLENE TODOS LOS CAMPOS.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int edad;
        try {
            edad = Integer.parseInt(Edad);
        if (edad <= 0) {
            JOptionPane.showMessageDialog(this, "LA EDAD DEBE SER UN NUMERO REAL.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "LA EDAD DEBE SER UN NUMERO.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }

        if (!Cedula.matches("[0-9]+")) {
        JOptionPane.showMessageDialog(this, "LA CEDULA DEBE CONTENER NUMMEROS.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }

        if (!Nombre.matches("[a-zA-Z\\s]+")) {
        JOptionPane.showMessageDialog(this, "EL NOMBRE DEBE CONTENER SOLO LECTRAS.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        ControladorPaciente pacienteControlador = ControladorPaciente.getInstancia();
        
        pacienteControlador.guardarDatos(Cedula, Nombre, edad, Sexo);
        
        JOptionPane.showMessageDialog(this, "Guardado correctamente");
        txtcedula.setText("");
        txtnombre.setText("");
        txtedad.setText("");
    }//GEN-LAST:event_CrearPaciente


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JComboBox<String> txtsexo;
    // End of variables declaration//GEN-END:variables
}
