

package simulaciondeunacola;


public class VentanaSimulador extends javax.swing.JFrame {

   
    public VentanaSimulador() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPCabeza = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDPPlanoCentral = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTArchivo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTNumeroDeArchivo = new javax.swing.JTable();
        jBtCargarDatos = new javax.swing.JButton();
        jBtIniciarSimulacion = new javax.swing.JButton();
        jBtSalir = new javax.swing.JButton();
        jLImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPCabeza.setBackground(new java.awt.Color(255, 255, 255));
        jPCabeza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Simulación de una cola de impresión");

        javax.swing.GroupLayout jPCabezaLayout = new javax.swing.GroupLayout(jPCabeza);
        jPCabeza.setLayout(jPCabezaLayout);
        jPCabezaLayout.setHorizontalGroup(
            jPCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCabezaLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCabezaLayout.setVerticalGroup(
            jPCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCabezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDPPlanoCentral.setBackground(new java.awt.Color(51, 102, 255));

        jTArchivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTArchivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivo"
            }
        ));
        jScrollPane1.setViewportView(jTArchivo);

        jTNumeroDeArchivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTNumeroDeArchivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°"
            }
        ));
        jScrollPane2.setViewportView(jTNumeroDeArchivo);

        jBtCargarDatos.setText("Cargar Datos");

        jBtIniciarSimulacion.setText("Iniciar Simulación");

        jBtSalir.setText("Salir");
        jBtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalirActionPerformed(evt);
            }
        });

        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simulaciondeunacola/Imagenes/cola.PNG"))); // NOI18N

        javax.swing.GroupLayout jDPPlanoCentralLayout = new javax.swing.GroupLayout(jDPPlanoCentral);
        jDPPlanoCentral.setLayout(jDPPlanoCentralLayout);
        jDPPlanoCentralLayout.setHorizontalGroup(
            jDPPlanoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDPPlanoCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLImagen)
                .addContainerGap())
            .addGroup(jDPPlanoCentralLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jBtCargarDatos)
                .addGap(233, 233, 233)
                .addComponent(jBtIniciarSimulacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(jBtSalir)
                .addGap(50, 50, 50))
        );
        jDPPlanoCentralLayout.setVerticalGroup(
            jDPPlanoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDPPlanoCentralLayout.createSequentialGroup()
                .addGroup(jDPPlanoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDPPlanoCentralLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jDPPlanoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDPPlanoCentralLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLImagen)))
                .addGap(65, 65, 65)
                .addGroup(jDPPlanoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCargarDatos)
                    .addComponent(jBtSalir)
                    .addComponent(jBtIniciarSimulacion))
                .addGap(10, 10, 10))
        );
        jDPPlanoCentral.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPPlanoCentral.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPPlanoCentral.setLayer(jBtCargarDatos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPPlanoCentral.setLayer(jBtIniciarSimulacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPPlanoCentral.setLayer(jBtSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPPlanoCentral.setLayer(jLImagen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDPPlanoCentral)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jDPPlanoCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(VentanaSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSimulador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCargarDatos;
    private javax.swing.JButton jBtIniciarSimulacion;
    private javax.swing.JButton jBtSalir;
    private javax.swing.JDesktopPane jDPPlanoCentral;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPCabeza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTArchivo;
    private javax.swing.JTable jTNumeroDeArchivo;
    // End of variables declaration//GEN-END:variables
}
