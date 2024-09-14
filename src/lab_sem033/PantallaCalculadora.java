/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab_sem033;

public class PantallaCalculadora extends javax.swing.JFrame {
    
    
    boolean isSumando = false;
    boolean isRestando = false;
    boolean isDividiendo = false;
    boolean isMultiplicando = false;
    
    double num1;
    
    public PantallaCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnResta = new javax.swing.JButton();
        btnMultiplica = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnLimpia = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplica.setText("*");
        btnMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicaActionPerformed(evt);
            }
        });

        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnLimpia.setText("CA");
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSuma)
                            .addComponent(btnDivide))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMultiplica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnResta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpia)))))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResta)
                    .addComponent(btnLimpia)
                    .addComponent(btnSuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplica)
                    .addComponent(btnIgual)
                    .addComponent(btnDivide))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        
        isSumando = true;
        
        String texto = txtValor.getText();
        num1 = Double.parseDouble(texto);
        txtValor.setText("");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        if(isSumando){
            String  texto = txtValor.getText();
            double num2 = Double.parseDouble(texto);
            txtValor.setText((num1 + num2) + "");
            isSumando = false;
        }
        
        if(isRestando){
            String  texto = txtValor.getText();
            double num2 = Double.parseDouble(texto);
            txtValor.setText((num1 - num2) + "");
            isRestando = false;
        }
        
        if(isMultiplicando){
            String  texto = txtValor.getText();
            double num2 = Double.parseDouble(texto);
            txtValor.setText((num1 * num2) + "");
            isMultiplicando = false;
        }
        
        if(isDividiendo){
            String  texto = txtValor.getText();
            double num2 = Double.parseDouble(texto);
            txtValor.setText((num1 / num2) + "");
            isDividiendo = false;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        isRestando = true;
        
        String texto = txtValor.getText();
        num1 = Double.parseDouble(texto);
        txtValor.setText("");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicaActionPerformed
        isMultiplicando = true;
        
        String texto = txtValor.getText();
        num1 = Double.parseDouble(texto);
        txtValor.setText("");
    }//GEN-LAST:event_btnMultiplicaActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        isDividiendo = true;
        
        String texto = txtValor.getText();
        num1 = Double.parseDouble(texto);
        txtValor.setText("");
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed
        txtValor.setText("");
        isSumando = false;
        isRestando = false;
        isMultiplicando = false;
        isDividiendo = false;
        num1 =0;
    }//GEN-LAST:event_btnLimpiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpia;
    private javax.swing.JButton btnMultiplica;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
