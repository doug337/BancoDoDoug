/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class ContaMaster extends Conta {

    /**
     * @return the SaldoInvestimento
     */
    public float getSaldoInvestimento() {
        return SaldoInvestimento;
    }

    /**
     * @param SaldoInvestimento the SaldoInvestimento to set
     */
    public void setSaldoInvestimento(float SaldoInvestimento) {
        this.SaldoInvestimento = SaldoInvestimento;
    }

    /**
     * @return the LimiteExtra
     */
    public float getLimiteExtra() {
        return LimiteExtra;
    }

    /**
     * @param LimiteExtra the LimiteExtra to set
     */
    public void setLimiteExtra(float LimiteExtra) {
        this.LimiteExtra = LimiteExtra;
    }
    private float SaldoInvestimento;
    private float LimiteExtra;
    
    
}
