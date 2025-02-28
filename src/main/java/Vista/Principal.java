package Vista;

import Vista.Citas.IngresarC;
import Vista.Citas.ListarC;
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
        IngresarP = new javax.swing.JMenuItem();
        ListarP = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        IngresarE = new javax.swing.JMenuItem();
        BtnListarE = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        BtnIngresarM = new javax.swing.JMenuItem();
        BtnListarM = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        BtnIngresarC = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout contenedorprincipalLayout = new javax.swing.GroupLayout(contenedorprincipal);
        contenedorprincipal.setLayout(contenedorprincipalLayout);
        contenedorprincipalLayout.setHorizontalGroup(
            contenedorprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        contenedorprincipalLayout.setVerticalGroup(
            contenedorprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jMenu1.setText("INICIO");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("PACIENTES");

        IngresarP.setText("INGRESAR.");
        IngresarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarP(evt);
            }
        });
        jMenu2.add(IngresarP);

        ListarP.setText("LISTAR.");
        ListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarP(evt);
            }
        });
        jMenu2.add(ListarP);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("ESPECIALIDADES");

        IngresarE.setText("INGRESAR.");
        IngresarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarEActionPerformed(evt);
            }
        });
        jMenu4.add(IngresarE);

        BtnListarE.setText("LISTAR.");
        BtnListarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarEActionPerformed(evt);
            }
        });
        jMenu4.add(BtnListarE);

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

        jMenu3.setText("CITAS");

        BtnIngresarC.setText("INGRESARC.");
        BtnIngresarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarCActionPerformed(evt);
            }
        });
        jMenu3.add(BtnIngresarC);

        jMenuItem4.setText("LISTARC.");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarC(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorprincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorprincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarP
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new IngresarP()).setVisible(true);
    }//GEN-LAST:event_IngresarP

    private void ListarP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarP
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new ListarP()).setVisible(true);
    }//GEN-LAST:event_ListarP

    private void IngresarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarEActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new IngresarE()).setVisible(true);
    }//GEN-LAST:event_IngresarEActionPerformed

    private void BtnListarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarEActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new ListarE()).setVisible(true);
    }//GEN-LAST:event_BtnListarEActionPerformed

    private void BtnIngresarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarMActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new IngresarM()).setVisible(true);
    }//GEN-LAST:event_BtnIngresarMActionPerformed

    private void BtnListarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarMActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new ListarM()).setVisible(true);
    }//GEN-LAST:event_BtnListarMActionPerformed

    private void BtnIngresarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarCActionPerformed
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new IngresarC()).setVisible(true);
    }//GEN-LAST:event_BtnIngresarCActionPerformed

    private void BtnListarC(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarC
        contenedorprincipal.removeAll();
        contenedorprincipal.add(new ListarC()).setVisible(true);
    }//GEN-LAST:event_BtnListarC

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
    private javax.swing.JMenuItem BtnIngresarC;
    private javax.swing.JMenuItem BtnIngresarM;
    private javax.swing.JMenuItem BtnListarE;
    private javax.swing.JMenuItem BtnListarM;
    private javax.swing.JMenuItem IngresarE;
    private javax.swing.JMenuItem IngresarP;
    private javax.swing.JMenuItem ListarP;
    private javax.swing.JDesktopPane contenedorprincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
