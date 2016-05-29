/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassSessao;
import br.edu.grupointegrado.controle.ClassTransferencia;

/**
 *
 * @author Luan
 */
public class TelaFormaDeposito extends javax.swing.JFrame {

    TelaValorBoletoPropriaConta contaPropria;
    TelaDepositoContaFavorecida contaOutro;
    TelaOperacao operacao;
    TelaInicialCaixa inicial;
    private int contaDestino;
    ClassTransferencia deposito;

    public TelaFormaDeposito() {
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
        jBCheque = new javax.swing.JButton();
        jBFinalizarFormaDeposito = new javax.swing.JButton();
        jBDinheiroCheque = new javax.swing.JButton();
        jBMenuAnterior = new javax.swing.JButton();
        jBEmDinheiro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMA DEPÓSITO");
        setAlwaysOnTop(true);
        setFocusable(false);
        setFocusableWindowState(false);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Selecione a forma de depósito");

        jBCheque.setBackground(new java.awt.Color(92, 102, 122));
        jBCheque.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBCheque.setForeground(new java.awt.Color(255, 255, 255));
        jBCheque.setText("Em Cheque(s)");
        jBCheque.setBorder(null);
        jBCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBChequeActionPerformed(evt);
            }
        });

        jBFinalizarFormaDeposito.setBackground(new java.awt.Color(92, 102, 122));
        jBFinalizarFormaDeposito.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBFinalizarFormaDeposito.setForeground(new java.awt.Color(255, 255, 255));
        jBFinalizarFormaDeposito.setText("Finalizar");
        jBFinalizarFormaDeposito.setBorder(null);
        jBFinalizarFormaDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarFormaDepositoActionPerformed(evt);
            }
        });

        jBDinheiroCheque.setBackground(new java.awt.Color(92, 102, 122));
        jBDinheiroCheque.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBDinheiroCheque.setForeground(new java.awt.Color(255, 255, 255));
        jBDinheiroCheque.setText("Em Dinheiro e Cheque(s)");
        jBDinheiroCheque.setBorder(null);
        jBDinheiroCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDinheiroChequeActionPerformed(evt);
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

        jBEmDinheiro.setBackground(new java.awt.Color(92, 102, 122));
        jBEmDinheiro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBEmDinheiro.setForeground(new java.awt.Color(255, 255, 255));
        jBEmDinheiro.setText("Em Dinheiro");
        jBEmDinheiro.setBorder(null);
        jBEmDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmDinheiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jBMenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBDinheiroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEmDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBFinalizarFormaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jBEmDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBDinheiroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFinalizarFormaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBChequeActionPerformed
        setVisible(false);
        if (((ClassSessao.getIdentificado()) == 1)&&((getContaDestino()) == 1)) {
            contaPropria = new TelaValorBoletoPropriaConta();
            contaPropria.setOperacao(operacao);
            contaPropria.setDeposito(deposito);
            contaPropria.setVisible(true);
        } else {
            contaOutro = new TelaDepositoContaFavorecida();
            contaOutro.setOperacao(operacao);
            contaOutro.setVisible(true);
        }

    }//GEN-LAST:event_jBChequeActionPerformed

    private void jBFinalizarFormaDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarFormaDepositoActionPerformed
        setVisible(false);
        inicial.setVisible(true);
    }//GEN-LAST:event_jBFinalizarFormaDepositoActionPerformed

    private void jBDinheiroChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDinheiroChequeActionPerformed
        setVisible(false);
        if (((ClassSessao.getIdentificado()) == 1)&&((getContaDestino()) == 1)) {
            contaPropria = new TelaValorBoletoPropriaConta();
            contaPropria.setOperacao(operacao);
            contaPropria.setDeposito(deposito);
            contaPropria.setVisible(true);
        } else {
            contaOutro = new TelaDepositoContaFavorecida();
            contaOutro.setOperacao(operacao);
            contaOutro.setVisible(true);
        }
    }//GEN-LAST:event_jBDinheiroChequeActionPerformed

    private void jBMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuAnteriorActionPerformed
        setVisible(false);
        operacao.setVisible(true);
    }//GEN-LAST:event_jBMenuAnteriorActionPerformed

    private void jBEmDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmDinheiroActionPerformed
        setVisible(false);
        if (((ClassSessao.getIdentificado()) == 1)&&((getContaDestino()) == 1)) {
            contaPropria = new TelaValorBoletoPropriaConta();
            contaPropria.setOperacao(operacao);
            contaPropria.setVisible(true);
            contaPropria.setDeposito(deposito);
        } else {
            contaOutro = new TelaDepositoContaFavorecida();
            contaOutro.setOperacao(operacao);
            contaOutro.setVisible(true);
        }
    }//GEN-LAST:event_jBEmDinheiroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFormaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFormaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFormaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFormaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFormaDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCheque;
    private javax.swing.JButton jBDinheiroCheque;
    private javax.swing.JButton jBEmDinheiro;
    private javax.swing.JButton jBFinalizarFormaDeposito;
    private javax.swing.JButton jBMenuAnterior;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


    public void setOperacao(TelaOperacao operacao) {
        this.operacao = operacao;
    }

    public void setInicial(TelaInicialCaixa inicial) {
        this.inicial = inicial;
    }
     public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    public void setDeposito(ClassTransferencia deposito) {
        this.deposito = deposito;
    }
    
}
