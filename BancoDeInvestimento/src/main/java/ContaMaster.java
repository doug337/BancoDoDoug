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
    public ContaMaster () {
        super ();
    }
    private float limiteExtra, saldoInvestimento;

    /**
     *
     * @param valor
     * @return
     */
    @Override
    public boolean sacar (float valor){
        if (this.getSaldo()+ this.limite + this.limiteExtra >= valor){
            super.sacar(valor);
            return true;
        } else {
            return false;
        }
    }
    public void setlimiteExtra (float limite){
        this.limiteExtra = limite;
        
    }
    @Override
    public float getLimite(){
        return this.limite + this.limiteExtra;
    }
    public boolean investir (float valor){
        if (this.getSaldo() >= valor ){
            super.sacar (valor);
            this.saldoInvestimento = this.saldoInvestimento + valor;
            return true;
        } else {
            return false;
        }
    
}
}  
