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
public class Urna {
    private int numero;
    private int numeroSessao;
    private int numeroZona;
    private String cidade;
    private String estado;
    
    public Urna(int numero, int numeroSessao, int numeroZona, String cidade, String estado){
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.numeroSessao = numeroSessao;
        this.numeroZona = numeroZona;
    }

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
     * @return the numeroSessao
     */
    public int getNumeroSessao() {
        return numeroSessao;
    }

    /**
     * @param numeroSessao the numeroSessao to set
     */
    public void setNumeroSessao(int numeroSessao) {
        this.numeroSessao = numeroSessao;
    }

    /**
     * @return the numeroZona
     */
    public int getNumeroZona() {
        return numeroZona;
    }

    /**
     * @param numeroZona the numeroZona to set
     */
    public void setNumeroZona(int numeroZona) {
        this.numeroZona = numeroZona;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Numero: "+ this.numero + " /Cidade:" + this.cidade +" /Estado:"+  this.estado + " /Sessão:"+  this.numeroSessao + " /Zona: " + this.numeroZona;
    }
    
    
}
