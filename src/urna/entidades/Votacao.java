/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.entidades;

/**
 *
 * @author Fernando
 */
public class Votacao {
    
    private Candidato candidato;
    private int urna;
    private int turno;

   
    public Votacao(Candidato candidato, int urna, int turno){
        this.candidato = candidato;
        this.turno = turno;
        this.urna = urna;
    }

    /**
     * @return the candidato
     */
    public Candidato getCandidato() {
        return candidato;
    }

    /**
     * @param candidato the candidato to set
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    /**
     * @return the urna
     */
    public int getUrna() {
        return urna;
    }

    /**
     * @param urna the urna to set
     */
    public void setUrna(int urna) {
        this.urna = urna;
    }

    /**
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    
    
}
