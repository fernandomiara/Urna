/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.controladores;

import java.text.ParseException;
import urna.telas.TelaPrincipal;

/**
 *
 * @author Fernando
 */
public class ControladorPrincipal {
    private ControladorCandidato ctrlCandidato;
    private ControladorPartido ctrlPartido;
    private ControladorUrna ctrlUrna;
    private ControladorVotacao ctrlVotacao;
    private TelaPrincipal telaPrincipal;
    private ControladorEleitor ctrleleitor;

    
    public ControladorPrincipal() {
        this.telaPrincipal = new TelaPrincipal(this);
        this.ctrlCandidato = new ControladorCandidato(this);
        this.ctrlVotacao = new ControladorVotacao(this);
        this.ctrlPartido = new ControladorPartido(this);
        this.ctrlUrna = new ControladorUrna(this);
        this.ctrleleitor = new ControladorEleitor(this);
    }
    
    public void ExibeMenuPrincipal() throws ParseException{
        telaPrincipal.ExibeMenuPrincipal();
    }

    public ControladorCandidato getCtrlCandidato() {
        return ctrlCandidato;
    }
    
    public ControladorVotacao getCtrlVotacao(){
        return ctrlVotacao;
    }
    
    public ControladorPartido getCtrlPartido(){
        return ctrlPartido;
    }
    
    public ControladorUrna getCtrlUrna(){
        return ctrlUrna;
    }
    
    public ControladorEleitor getCtrlEleitor(){
        return ctrleleitor;
    }

}
