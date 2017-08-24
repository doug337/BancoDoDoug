
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *sss
 * @author aluno
 */
public class Cliente extends Conta {

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the Dt_Nasc
     */
    public Date getDt_Nasc() {
        return Dt_Nasc;
    }

    /**
     * @param Dt_Nasc the Dt_Nasc to set
     */
    public void setDt_Nasc(Date Dt_Nasc) {
        this.Dt_Nasc = Dt_Nasc;
    }
    private String Nome;
    private int rg;
    private int cpf;
    private Date Dt_Nasc;

    
    
}
