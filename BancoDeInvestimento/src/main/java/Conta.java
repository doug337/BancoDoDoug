/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Conta {
    public Conta (){}
    private float saldo;

    /**
     *
     */
    protected float limite;
    private int agencia, numero;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }
    public synchronized void depositar() {
        
    }
    public synchronized void sacar(){
        
    }
    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }
    public float depositar (float valor){
        this.saldo= this.saldo + valor ;
        return this.saldo;
    }
    public boolean sacar(float valor){
        if (this.saldo + this.limite >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    
    
}
