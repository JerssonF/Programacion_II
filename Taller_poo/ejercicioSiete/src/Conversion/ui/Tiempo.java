
package Conversion.ui;

import Conversion.bll.Convertir;

public class Tiempo extends javax.swing.JFrame {

    
    public Tiempo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSegundos = new javax.swing.JLabel();
        txtSEGUNDOS = new javax.swing.JTextField();
        btnCALCULAR = new javax.swing.JButton();
        lblMINUTOS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTitulo.setText("Conversion de segundos a minutos");

        lblSegundos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSegundos.setText("TIEMPO");

        btnCALCULAR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCALCULAR.setText("CALCULAR");
        btnCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCALCULARActionPerformed(evt);
            }
        });

        lblMINUTOS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMINUTOS.setText("MINUTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnCALCULAR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMINUTOS)
                            .addComponent(lblSegundos))
                        .addGap(82, 82, 82)
                        .addComponent(txtSEGUNDOS, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSegundos)
                    .addComponent(txtSEGUNDOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(btnCALCULAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lblMINUTOS)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCALCULARActionPerformed
        Convertir objConversor = new Convertir();
        objConversor.setSegundos(Double.parseDouble(txtSEGUNDOS.getText()));
        
        //Lamado del metodo
        objConversor.conteo();
        //salida
        lblMINUTOS.setText("Los minutos son: " + objConversor.getTiempoR());
        
    }//GEN-LAST:event_btnCALCULARActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tiempo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCALCULAR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMINUTOS;
    private javax.swing.JLabel lblSegundos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtSEGUNDOS;
    // End of variables declaration//GEN-END:variables
}
