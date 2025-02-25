package Vista;

import Vista.Medicos.IngresarM;
import Vista.Medicos.ListarM;
import Vista.Paciente.IngresarP;
import Vista.Paciente.ListarP;
import Vista.especialidades.IngresarE;
import Vista.especialidades.ListarE;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorprincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        IngresarEspecialidad = new javax.swing.JMenuItem();
        BtnListar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        BtnIngresarM = new javax.swing.JMenuItem();
        BtnListarM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout contenedorprincipalLayout = new javax.swing.GroupLayout(contenedorprincipal);
        contenedorprincipal.setLayout(contenedorprincipalLayout);
        contenedorprincipalLayout.setHorizontalGroup(
            contenedorprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        contenedorprincipalLayout.setVerticalGroup(
            contenedorprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        jMenu1.setText("INICIO");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("PACIENTES");

        jMenuItem1.setText("INGRESAR.");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("LISTAR.");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Listar(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("ESPECIALIDADES");

        IngresarEspecialidad.setText("INGRESAR.");
        IngresarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarEspecialidadActionPerformed(evt);
            }
        });
        jMenu4.add(IngresarEspecialidad);

        BtnListar.setText("LISTAR.");
        BtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarActionPerformed(evt);
            }
        });
        jMenu4.add(BtnListar);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("MEDICOS");

        BtnIngresarM.setText("INGRESARM.");
        BtnIngresarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarMActionPerformed(evt);
            }
        });
        jMenu5.add(BtnIngresarM);

        BtnListarM.setText("LISTARM.");
        BtnListarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarMActionPerformed(evt);
            }
        });
        jMenu5.add(BtnListarM);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorprincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorprincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ingresar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new IngresarP()).setVisible(true);
    }//GEN-LAST:event_Ingresar

    private void Listar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Listar
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new ListarP()).setVisible(true);
    }//GEN-LAST:event_Listar

    private void IngresarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarEspecialidadActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new IngresarE()).setVisible(true);
    }//GEN-LAST:event_IngresarEspecialidadActionPerformed

    private void BtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new ListarE()).setVisible(true);
    }//GEN-LAST:event_BtnListarActionPerformed

    private void BtnIngresarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarMActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new IngresarM()).setVisible(true);
    }//GEN-LAST:event_BtnIngresarMActionPerformed

    private void BtnListarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarMActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new ListarM()).setVisible(true);
    }//GEN-LAST:event_BtnListarMActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnIngresarM;
    private javax.swing.JMenuItem BtnListar;
    private javax.swing.JMenuItem BtnListarM;
    private javax.swing.JMenuItem IngresarEspecialidad;
    private javax.swing.JDesktopPane contenedorprincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
