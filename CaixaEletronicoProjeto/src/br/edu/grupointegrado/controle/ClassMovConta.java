/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BSP
 */
public class ClassMovConta extends ConexaoOracle{
    private int cdMovimentacao;
    private int cdConta;
    private int cdAgencia;
    private int cdBanco;
    private double vlSaldo;
    private String date;
    private StringBuffer sql = new StringBuffer();

    public int getCdMovimentacao() {
        return cdMovimentacao;
    }

    public void setCdMovimentacao(int cdMovimentacao) {
        this.cdMovimentacao = cdMovimentacao;
    }

    public int getCdConta() {
        return cdConta;
    }

    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public int getCdAgencia() {
        return cdAgencia;
    }

    public void setCdAgencia(int cdAgencia) {
        this.cdAgencia = cdAgencia;
    }

    public int getCdBanco() {
        return cdBanco;
    }
    
    private String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
}

    public void setCdBanco(int cdBanco) {
        this.cdBanco = cdBanco;
    }
public void inserirMovimentacaoConta(Double saldoAntigo,Double saldoNovo) {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO MOV_CONTA (CD_CONTA,CD_AGENCIA,CD_BANCO,CD_MOV,VL_SALDO_NOVO,VL_SALDO_ANTIGO,DT_MOV) VALUES (");
        sql.append(getCdConta()).append(",");
        sql.append(getCdAgencia()).append(",");
        sql.append(getCdBanco()).append(",");
        sql.append(getCdMovimentacao()).append(",");
        sql.append(saldoNovo).append(",");
        sql.append(saldoAntigo).append(",To_Date('");
        sql.append(getDateTime()).append("', 'dd/mm/yyyy hh24:mi:ss'))");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        
        
    }

public ResultSet consultaMov(ClassConta conta, int periodoDias) {
        sql.delete(0, sql.length());
        
        sql.append("select cd_mov,cd_conta, cd_agencia, cd_banco,dt_mov,"
                + "vl_saldo_antigo,vl_saldo_novo,"
                + "(vl_saldo_novo-vl_saldo_antigo) AS MOV from mov_conta\n" +
                 "where cd_conta =");
        sql.append(conta.getCdConta()).append(" and cd_agencia=");
        sql.append(conta.getAgencia()).append(" and cd_banco =");
        sql.append(conta.getBanco()).append(" and\n" +
        " dt_mov between sysdate- ").append(""+periodoDias);
        sql.append(" and sysdate");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;
    }

}
