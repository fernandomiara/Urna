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
public class Partidos {
    private int numeroPartido;
    private String siglaPartido;

       
    public Partidos(int numeroPartido, String siglaPartido){
        this.numeroPartido = numeroPartido;
        this.siglaPartido = siglaPartido;
    }

    /**
     * @return the numeroPartido
     */
    public int getNumeroPartido() {
        return numeroPartido;
    }

    /**
     * @param numeroPartido the numeroPartido to set
     */
    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    /**
     * @return the siglaPartido
     */
    public String getSiglaPartido() {
        return siglaPartido;
    }

    /**
     * @param siglaPartido the siglaPartido to set
     */
    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }
    
    @Override
    public String toString(){
        return "Numero:"+ this.numeroPartido+ " /Sigla:"+this.siglaPartido;
    }
}
