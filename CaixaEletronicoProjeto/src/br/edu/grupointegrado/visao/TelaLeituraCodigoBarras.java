/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

/**
 *
 * @author Luan
 */
public class TelaLeituraCodigoBarras extends javax.swing.JFrame {

    
    TelaOperacao operacao;
    TelaInserirCodigoManualmente cdManual;
    
    /**
     * 
     * Creates new form TelaOperacao
     */
    public TelaLeituraCodigoBarras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBFinalizarLeituraCodigo = new javax.swing.JButton();
        jBInserirManualmente = new javax.swing.JButton();
        jBMenuAnterior = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LEITURA DO CÓDIGO DE BARRAS");
        setFocusable(false);
        setFocusableWindowState(false);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Posicione o código de barras sob o feixe de luz");

        jBFinalizarLeituraCodigo.setBackground(new java.awt.Color(92, 102, 122));
        jBFinalizarLeituraCodigo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBFinalizarLeituraCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jBFinalizarLeituraCodigo.setText("Finalizar");
        jBFinalizarLeituraCodigo.setBorder(null);
        jBFinalizarLeituraCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarLeituraCodigoActionPerformed(evt);
            }
        });

        jBInserirManualmente.setBackground(new java.awt.Color(92, 102, 122));
        jBInserirManualmente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBInserirManualmente.setForeground(new java.awt.Color(255, 255, 255));
        jBInserirManualmente.setText("Inserir Manualmente");
        jBInserirManualmente.setBorder(null);
        jBInserirManualmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirManualmenteActionPerformed(evt);
            }
        });

        jBMenuAnterior.setBackground(new java.awt.Color(92, 102, 122));
        jBMenuAnterior.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBMenuAnterior.setForeground(new java.awt.Color(255, 255, 255));
        jBMenuAnterior.setText("Menu Anterior");
        jBMenuAnterior.setBorder(null);
        jBMenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuAnteriorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Caso não ocorra a leitura automática");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("do código de barras, selecione o");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("botao Inserir Manualmente");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Boleto.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBMenuAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBInserirManualmente, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBFinalizarLeituraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)))
                                .addGap(17, 17, 17)))))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jBInserirManualmente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFinalizarLeituraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBFinalizarLeituraCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarLeituraCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFinalizarLeituraCodigoActionPerformed

    private void jBMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuAnteriorActionPerformed
         setVisible(false);
         operacao.setVisible(true);
    }//GEN-LAST:event_jBMenuAnteriorActionPerformed

    private void jBInserirManualmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirManualmenteActionPerformed
        cdManual = new TelaInserirCodigoManualmente();
        setVisible(false);
        cdManual.setVisible(true);
        
    }//GEN-LAST:event_jBInserirManualmenteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLeituraCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLeituraCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLeituraCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLeituraCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLeituraCodigoBarras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFinalizarLeituraCodigo;
    private javax.swing.JButton jBInserirManualmente;
    private javax.swing.JButton jBMenuAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    public void setOperacao(TelaOperacao operacao) {
        this.operacao = operacao;
    }



    
}
