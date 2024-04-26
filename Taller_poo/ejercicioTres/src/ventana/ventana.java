
package ventana;
import principal.Main;
public class ventana extends javax.swing.JFrame {
    Main obj = new Main();
    public double Total;
    public double procentajeU;
    public double procentajeD;
    public double procentajeT;
    public double procentajeC;
 
    public ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMontoU = new javax.swing.JLabel();
        lblMontoT = new javax.swing.JLabel();
        lblMontoD = new javax.swing.JLabel();
        lblMontoC = new javax.swing.JLabel();
        txtMontoU = new javax.swing.JTextField();
        txtMontoD = new javax.swing.JTextField();
        txtMontoT = new javax.swing.JTextField();
        txtMontoC = new javax.swing.JTextField();
        btnCAlcular = new javax.swing.JButton();
        lblU = new javax.swing.JLabel();
        lblS = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblPorcentajeU = new javax.swing.JLabel();
        lblPorcentajeD = new javax.swing.JLabel();
        lblPorcentajeT = new javax.swing.JLabel();
        lblPorcentajeC = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMontoU.setText("Primera persona que ingrese su aporte en dinero ");

        lblMontoT.setText("Tercera persona que ingrese su aporte en dinero ");

        lblMontoD.setText("Segunda persona que ingrese su aporte en dinero ");

        lblMontoC.setText("Caurta persona que ingrese su aporte en dinero ");

        btnCAlcular.setText("Calcular");
        btnCAlcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAlcularActionPerformed(evt);
            }
        });

        lblU.setText("El porcentaje de la Primera persona de invertido es de");

        lblS.setText("El porcentaje de la Segunda persona de invertido es de");

        lblT.setText("El porcentaje de la Tercera persona de invertido es de");

        lblC.setText("El porcentaje de la Cuarta persona de invertido es de");

        lblPorcentajeU.setText(".");

        lblPorcentajeD.setText(".");

        lblPorcentajeT.setText(".");

        lblPorcentajeC.setText(".");

        lblTotal.setText("el total es de ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPorcentajeC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblT, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPorcentajeT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMontoU)
                            .addComponent(lblMontoT)
                            .addComponent(lblMontoD)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCAlcular)
                                .addComponent(lblMontoC)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMontoD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoU, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblS, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPorcentajeU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPorcentajeD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoU)
                    .addComponent(txtMontoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoT)
                    .addComponent(txtMontoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoC)
                    .addComponent(txtMontoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCAlcular)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblU)
                    .addComponent(lblPorcentajeU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblS)
                    .addComponent(lblPorcentajeD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblT)
                    .addComponent(lblPorcentajeT))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblC)
                    .addComponent(lblPorcentajeC))
                .addGap(18, 18, 18)
                .addComponent(lblTotal)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCAlcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAlcularActionPerformed
        obj.porcentaje(Double.parseDouble(txtMontoU.getText()), Double.parseDouble(txtMontoD.getText()), Double.parseDouble(txtMontoT.getText()), Double.parseDouble(txtMontoC.getText()));
        procentajeU = obj.getProcentajeU();
        procentajeD = obj.getProcentajeD();
        procentajeT = obj.getProcentajeT();
        procentajeC = obj.getProcentajeC();
        Total = obj.getTotal();
        
        lblPorcentajeU.setText(" "+procentajeU+"%");
        lblPorcentajeD.setText(" "+procentajeD+"%");
        lblPorcentajeT.setText(" "+procentajeT+"%");
        lblPorcentajeC.setText(" "+procentajeC+"%");
        lblTotal.setText("el total es de "+Total);
    }//GEN-LAST:event_btnCAlcularActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCAlcular;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblMontoC;
    private javax.swing.JLabel lblMontoD;
    private javax.swing.JLabel lblMontoT;
    private javax.swing.JLabel lblMontoU;
    private javax.swing.JLabel lblPorcentajeC;
    private javax.swing.JLabel lblPorcentajeD;
    private javax.swing.JLabel lblPorcentajeT;
    private javax.swing.JLabel lblPorcentajeU;
    private javax.swing.JLabel lblS;
    private javax.swing.JLabel lblT;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblU;
    private javax.swing.JTextField txtMontoC;
    private javax.swing.JTextField txtMontoD;
    private javax.swing.JTextField txtMontoT;
    private javax.swing.JTextField txtMontoU;
    // End of variables declaration//GEN-END:variables
}
