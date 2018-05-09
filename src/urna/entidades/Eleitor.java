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
public class Eleitor {
    private int numero;
    private String nome;
    private int urna;

    public Eleitor(int numero, String nome, int urna){
        this.numero = numero;
        this.nome = nome;
        this.urna = urna;
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
    @Override
    public String toString(){
        return "Numero:"+ this.numero+ " /Nome:"+this.nome + " /Urna:"+ this.urna;
    }
}
