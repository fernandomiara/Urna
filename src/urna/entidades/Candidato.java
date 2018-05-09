package urna.entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Candidato {
    private int numeroCandidato;
    private TipoCandidato tipocandidato;
    private String nome;
    private Partidos partido;
    private String estado;
    
    public Candidato(int numeroCandidato, TipoCandidato tipocandidato, String nome, Partidos partido, String estado){
        this.nome = nome;
        this.setNumeroCandidato(numeroCandidato);
        this.setPartido(partido);
        this.setTipocandidato(tipocandidato);
        this.estado = estado;
    }
    
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    /**
     * @return the numeroCandidato
     */
    
    
    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    /**
     * @param numeroCandidato the numeroCandidato to set
     */
    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    /**
     * @return the tipocandidato
     */
    public TipoCandidato getTipocandidato() {
        return tipocandidato;
    }

    /**
     * @param tipocandidato the tipocandidato to set
     */
    public void setTipocandidato(TipoCandidato tipocandidato) {
        this.tipocandidato = tipocandidato;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the partido
     */
    public Partidos getPartido() {
        return partido;
    }

    /**
     * @param partido the partido to set
     */
    public void setPartido(Partidos partido) {
        this.partido = partido;
    }
    
    @Override
    public String toString(){
        return "Numero:"+ this.numeroCandidato+ " /Nome:"+this.nome + " /Partido:"+ this.partido + " /Cargo:"+this.tipocandidato;
    }
}
