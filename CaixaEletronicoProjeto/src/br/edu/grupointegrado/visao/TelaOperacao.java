/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassConta;
import br.edu.grupointegrado.controle.ClassOperacao;
import br.edu.grupointegrado.controle.ClassPagamento;
import br.edu.grupointegrado.controle.ClassSaque;
import br.edu.grupointegrado.controle.ClassSessao;
import br.edu.grupointegrado.controle.ClassTransferencia;

/**
 *
 * @author Luan
 */
public class TelaOperacao extends javax.swing.JFrame {
    ClassConta conta;
    ClassSessao sessao;
    ClassSaque saque;
    ClassTransferencia transferencia;
    ClassOperacao operacao = new ClassOperacao();
    ClassPagamento pagamento;
    private boolean identificacao = false;
    TelaInicialCaixa inicial;
    TelaFinalizar finalizar = new TelaFinalizar();
    TelaSaldo saldo ;
    TipoExtrato tipoExtrato;
    TelaValorSaque valorSaque;
    TelaOutroValorSaque outroValorSaque;
    TelaContaDeposito contaDeposito ;
    TelaLeituraCodigoBarras leituraCodigoBarras;
    TelaFormaDeposito forma;
    TelaTransDepContaFavorecida telaTransferencia;
    
    
    
    public TelaOperacao() {
        initComponents();
        conta = ClassSessao.getConta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBSaldo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBExtrato = new javax.swing.JButton();
        jBDeposito = new javax.swing.JButton();
        jBFinalizarOperacao = new javax.swing.JButton();
        jBPagamento = new javax.swing.JButton();
        jBTransferencia = new javax.swing.JButton();
        jBSaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OPERAÇÃO");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jBSaldo.setBackground(new java.awt.Color(92, 102, 122));
        jBSaldo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jBSaldo.setText("Saldo");
        jBSaldo.setBorder(null);
        jBSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaldoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Selecione a opção desejada");

        jBExtrato.setBackground(new java.awt.Color(92, 102, 122));
        jBExtrato.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBExtrato.setForeground(new java.awt.Color(255, 255, 255));
        jBExtrato.setText("Extrato");
        jBExtrato.setBorder(null);
        jBExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExtratoActionPerformed(evt);
            }
        });

        jBDeposito.setBackground(new java.awt.Color(92, 102, 122));
        jBDeposito.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBDeposito.setForeground(new java.awt.Color(255, 255, 255));
        jBDeposito.setText("Depósito");
        jBDeposito.setBorder(null);
        jBDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDepositoActionPerformed(evt);
            }
        });

        jBFinalizarOperacao.setBackground(new java.awt.Color(92, 102, 122));
        jBFinalizarOperacao.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBFinalizarOperacao.setForeground(new java.awt.Color(255, 255, 255));
        jBFinalizarOperacao.setText("Finalizar");
        jBFinalizarOperacao.setBorder(null);
        jBFinalizarOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarOperacaoActionPerformed(evt);
            }
        });

        jBPagamento.setBackground(new java.awt.Color(92, 102, 122));
        jBPagamento.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBPagamento.setForeground(new java.awt.Color(255, 255, 255));
        jBPagamento.setText("Pagamento");
        jBPagamento.setBorder(null);
        jBPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPagamentoActionPerformed(evt);
            }
        });

        jBTransferencia.setBackground(new java.awt.Color(92, 102, 122));
        jBTransferencia.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        jBTransferencia.setText("Transferência");
        jBTransferencia.setBorder(null);
        jBTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTransferenciaActionPerformed(evt);
            }
        });

        jBSaque.setBackground(new java.awt.Color(92, 102, 122));
        jBSaque.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBSaque.setForeground(new java.awt.Color(255, 255, 255));
        jBSaque.setText("Saque");
        jBSaque.setBorder(null);
        jBSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaqueActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBFinalizarOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jBFinalizarOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        setSize(new java.awt.Dimension(896, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaldoActionPerformed
        saldo = new TelaSaldo();
        saldo.setCdConta(ClassSessao.getCdConta());
        saldo.setCdAgencia(ClassSessao.getCdAgencia());
        saldo.setCdBanco(ClassSessao.getCdBanco());
        saldo.setVlConta(ClassSessao.getSaldo());
       
        saldo.exibirSaldo();
        saldo.setOperacao(this);
        saldo.setInicial(inicial);
        setVisible(false);
        saldo.setVisible(true);
    }//GEN-LAST:event_jBSaldoActionPerformed

    private void jBExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExtratoActionPerformed
        tipoExtrato = new TipoExtrato();
        tipoExtrato.setOperacao(this);
        tipoExtrato.setInicial(inicial);
        
        setVisible(false);
        tipoExtrato.setVisible(true);
    }//GEN-LAST:event_jBExtratoActionPerformed

    private void jBDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDepositoActionPerformed
        transferencia = new ClassTransferencia();
        if ((ClassSessao.getIdentificado()) == 1){
        contaDeposito = new TelaContaDeposito();
        transferencia.setContaOrigem(ClassSessao.getCdConta());
        transferencia.setAgenciaOrigem(ClassSessao.getCdAgencia());
        transferencia.setBancoOrigem(ClassSessao.getCdBanco());
             System.out.println("Depósito");
        contaDeposito.setOperacao(this);
        contaDeposito.setInicial(inicial);
        contaDeposito.setDeposito(transferencia);
        
         setVisible(false);
         contaDeposito.setVisible(true);
        }else{
        forma = new TelaFormaDeposito();
        forma.setOperacao(this);
        forma.setInicial(inicial);
        }
        
       
        
    }//GEN-LAST:event_jBDepositoActionPerformed

    private void jBFinalizarOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarOperacaoActionPerformed
        setVisible(false);
        inicial.setVisible(true);
    }//GEN-LAST:event_jBFinalizarOperacaoActionPerformed

    private void jBPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPagamentoActionPerformed
        pagamento = new ClassPagamento();
        leituraCodigoBarras = new TelaLeituraCodigoBarras();
       
       
            pagamento.setCdConta(ClassSessao.getCdConta());
            pagamento.setCdAgencia(ClassSessao.getCdAgencia());
            pagamento.setCdBanco(ClassSessao.getCdBanco());
             System.out.println("Pagamento");
            
            leituraCodigoBarras.setPagamento(pagamento);
            leituraCodigoBarras.setOperacao(this);
         setVisible(false);
            leituraCodigoBarras.setVisible(true);
        
        
        
    }//GEN-LAST:event_jBPagamentoActionPerformed

    private void jBTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTransferenciaActionPerformed
       transferencia = new ClassTransferencia();
       telaTransferencia = new TelaTransDepContaFavorecida();
       
        transferencia.setContaOrigem(ClassSessao.getCdConta());
        transferencia.setAgenciaOrigem(ClassSessao.getCdAgencia());
        transferencia.setBancoOrigem(ClassSessao.getCdBanco());
        System.out.println("TRANSFERENCIA");
             
        telaTransferencia.setOperacao(this);
        
        telaTransferencia.setTransferencia(transferencia);
        telaTransferencia.setOrigem(2);
         setVisible(false);
         telaTransferencia.setVisible(true);
    }//GEN-LAST:event_jBTransferenciaActionPerformed

    private void jBSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaqueActionPerformed
        saque = new ClassSaque();
        valorSaque = new TelaValorSaque();
        System.out.println("SAQUE");
        saque.setCdConta(ClassSessao.getCdConta());
        saque.setCdAgencia(ClassSessao.getCdAgencia());
        saque.setCdBanco(ClassSessao.getCdBanco());
        
        
        valorSaque.setInicial(inicial);
        valorSaque.setSaque(saque);
        valorSaque.setFinalizar(finalizar);
        valorSaque.setOperacao(this);
        setVisible(false);
        valorSaque.setVisible(true);
    }//GEN-LAST:event_jBSaqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOperacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDeposito;
    private javax.swing.JButton jBExtrato;
    private javax.swing.JButton jBFinalizarOperacao;
    private javax.swing.JButton jBPagamento;
    private javax.swing.JButton jBSaldo;
    private javax.swing.JButton jBSaque;
    private javax.swing.JButton jBTransferencia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public boolean isIdentificacao() {
        return identificacao;
    }
    
    
    
    public void naoIdentificado() {
        identificacao = false;
        jBSaldo.setEnabled(false);
        jBExtrato.setEnabled(false);
        jBSaldo.setEnabled(false);
        jBSaque.setEnabled(false);
        jBTransferencia.setEnabled(false);
        jBPagamento.setEnabled(false);
        System.out.println("Operação - Não Identificada");

    }
    
   

    public void Identificado() {
        identificacao = true;
        jBSaldo.setEnabled(true);
        jBExtrato.setEnabled(true);
        jBSaldo.setEnabled(true);
        jBSaque.setEnabled(true);
        jBTransferencia.setEnabled(true);
        System.out.println("Operação - Identificada");
    }

    public void setInicial(TelaInicialCaixa inicial) {
        this.inicial = inicial;
    }

    public void setSessao(ClassSessao sessao) {
        this.sessao = sessao;
    }
    
    
    
}
