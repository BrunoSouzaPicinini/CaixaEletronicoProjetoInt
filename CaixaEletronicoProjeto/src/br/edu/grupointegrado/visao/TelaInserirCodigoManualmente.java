/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassMovimentacao;
import br.edu.grupointegrado.controle.ClassOperacao;
import br.edu.grupointegrado.controle.ClassPagamento;
import br.edu.grupointegrado.controle.ClassSessao;
import br.edu.grupointegrado.ferramentas.DocumentoLimitado;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class TelaInserirCodigoManualmente extends javax.swing.JFrame {

    ClassPagamento pagamento;
    ClassMovimentacao movimentacao;
    StringBuffer stringCodigoBarras = new StringBuffer();
    TelaOperacao operacao;
    StringBuffer valor = new StringBuffer();

    /**
     * Creates new form TelaOperacao
     */
    public TelaInserirCodigoManualmente() {
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
        jBCancelar = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();
        jBCorrigir = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jTFCodigodeBarras1 = new javax.swing.JTextField();
        jTFCodigodeBarras4 = new javax.swing.JTextField();
        jTFCodigodeBarras3 = new javax.swing.JTextField();
        jTFCodigodeBarras5 = new javax.swing.JTextField();
        jTFCodigodeBarras2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LEITURA MANUAL DO CÓDIGO DE BARRAS");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Digite o código de barras, conforme figura abaixo.");

        jBCancelar.setBackground(new java.awt.Color(255, 0, 0));
        jBCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setBorder(null);
        jBCancelar.setFocusable(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBConfirmar.setBackground(new java.awt.Color(51, 153, 0));
        jBConfirmar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBConfirmar.setText("Confirmar");
        jBConfirmar.setBorder(null);
        jBConfirmar.setFocusable(false);
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jBCorrigir.setBackground(new java.awt.Color(255, 255, 0));
        jBCorrigir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBCorrigir.setText("Corrigir");
        jBCorrigir.setBorder(null);
        jBCorrigir.setFocusable(false);
        jBCorrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCorrigirActionPerformed(evt);
            }
        });

        jB7.setBackground(new java.awt.Color(0, 0, 0));
        jB7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB7.setForeground(new java.awt.Color(255, 255, 255));
        jB7.setText("7");
        jB7.setBorder(null);
        jB7.setFocusable(false);
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB0.setBackground(new java.awt.Color(0, 0, 0));
        jB0.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB0.setForeground(new java.awt.Color(255, 255, 255));
        jB0.setText("0");
        jB0.setBorder(null);
        jB0.setFocusable(false);
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jB8.setBackground(new java.awt.Color(0, 0, 0));
        jB8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB8.setForeground(new java.awt.Color(255, 255, 255));
        jB8.setText("8");
        jB8.setBorder(null);
        jB8.setFocusable(false);
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setBackground(new java.awt.Color(0, 0, 0));
        jB9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB9.setForeground(new java.awt.Color(255, 255, 255));
        jB9.setText("9");
        jB9.setBorder(null);
        jB9.setFocusable(false);
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB4.setBackground(new java.awt.Color(0, 0, 0));
        jB4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB4.setForeground(new java.awt.Color(255, 255, 255));
        jB4.setText("4");
        jB4.setBorder(null);
        jB4.setFocusable(false);
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setBackground(new java.awt.Color(0, 0, 0));
        jB5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB5.setForeground(new java.awt.Color(255, 255, 255));
        jB5.setText("5");
        jB5.setBorder(null);
        jB5.setFocusable(false);
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setBackground(new java.awt.Color(0, 0, 0));
        jB6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB6.setForeground(new java.awt.Color(255, 255, 255));
        jB6.setText("6");
        jB6.setBorder(null);
        jB6.setFocusable(false);
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB3.setBackground(new java.awt.Color(0, 0, 0));
        jB3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB3.setForeground(new java.awt.Color(255, 255, 255));
        jB3.setText("3");
        jB3.setBorder(null);
        jB3.setFocusable(false);
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB1.setBackground(new java.awt.Color(0, 0, 0));
        jB1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB1.setForeground(new java.awt.Color(255, 255, 255));
        jB1.setText("1");
        jB1.setBorder(null);
        jB1.setFocusable(false);
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setBackground(new java.awt.Color(0, 0, 0));
        jB2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB2.setForeground(new java.awt.Color(255, 255, 255));
        jB2.setText("2");
        jB2.setBorder(null);
        jB2.setFocusable(false);
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jTFCodigodeBarras1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTFCodigodeBarras1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTFCodigodeBarras4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTFCodigodeBarras4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTFCodigodeBarras3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTFCodigodeBarras3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTFCodigodeBarras5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTFCodigodeBarras5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTFCodigodeBarras2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTFCodigodeBarras2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCodigodeBarras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigodeBarras2ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cod Boleto.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBCorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFCodigodeBarras1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTFCodigodeBarras2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTFCodigodeBarras3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTFCodigodeBarras4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCodigodeBarras5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodigodeBarras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodigodeBarras2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodigodeBarras3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodigodeBarras4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodigodeBarras5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jBCorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTFCodigodeBarras1.setDocument(new DocumentoLimitado(10));
        jTFCodigodeBarras4.setDocument(new DocumentoLimitado(1));
        jTFCodigodeBarras3.setDocument(new DocumentoLimitado(11));
        jTFCodigodeBarras5.setDocument(new DocumentoLimitado(14));
        jTFCodigodeBarras2.setDocument(new DocumentoLimitado(11));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        stringCodigoBarras.delete(0, stringCodigoBarras.length());
        stringCodigoBarras.append(jTFCodigodeBarras1.getText());
        stringCodigoBarras.append(jTFCodigodeBarras2.getText());
        stringCodigoBarras.append(jTFCodigodeBarras3.getText());
        stringCodigoBarras.append(jTFCodigodeBarras4.getText());
        stringCodigoBarras.append(jTFCodigodeBarras5.getText());
        pagamento.setCodBarra(stringCodigoBarras.toString());
        System.out.println(stringCodigoBarras.toString()); 
        
        pagamento.incluirPagamento();
        extrairValorBoleto();
        ClassOperacao.setCdPagamento(pagamento.getCdPagamento());
        
        operacao.operacao.incluirOperacaoPagamento();
        movimentacao = new ClassMovimentacao();
        movimentacao.setCdOperacao(operacao.operacao.getCdOperacao());
        movimentacao.setDsMovimentacao("PAGAMENTO");
        movimentacao.setVlMovimentacao(Double.parseDouble(valor.toString()));
        movimentacao.inserirMovimentacao(ClassSessao.getConta());
        
        setVisible(false);
        operacao.finalizar.setVisible(true);


    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jBCorrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCorrigirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCorrigirActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB0ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB2ActionPerformed

    private void jTFCodigodeBarras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigodeBarras2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigodeBarras2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInserirCodigoManualmente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInserirCodigoManualmente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInserirCodigoManualmente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInserirCodigoManualmente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInserirCodigoManualmente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBCorrigir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTFCodigodeBarras1;
    private javax.swing.JTextField jTFCodigodeBarras2;
    private javax.swing.JTextField jTFCodigodeBarras3;
    private javax.swing.JTextField jTFCodigodeBarras4;
    private javax.swing.JTextField jTFCodigodeBarras5;
    // End of variables declaration//GEN-END:variables

    public void setOperacao(TelaOperacao operacao) {
        this.operacao = operacao;
    }

    public void setPagamento(ClassPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String extrairValorBoleto() {
        valor.delete(0, valor.length());
        valor.append("-");
        boolean diferenteZero = false;
        for (int i = 4; i < 14; i++) {
           
            if(((jTFCodigodeBarras5.getText().toString().charAt(i))!= '0')||(diferenteZero)){
                diferenteZero = true;
                valor.append(jTFCodigodeBarras5.getText().toString().charAt(i));
        }}
        String valorTemp = valor.toString();
        int tamanho = valor.length();
        valor.delete(valor.length()-2, valor.length());
        valor.append(".");
        valor.append(valorTemp, tamanho -2, tamanho);
        System.out.println("valor:" + valor.toString());
        return (valor.toString());
    }

}
