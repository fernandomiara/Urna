/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.entidades;

import java.text.ParseException;
import urna.controladores.ControladorPrincipal;
import static urna.entidades.TipoCandidato.DEPUTADO;
import static urna.entidades.TipoCandidato.EMBRANCO;
import static urna.entidades.TipoCandidato.SENADOR;

/**
 *
 * @author Fernando
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Partidos partido = new Partidos(0, "SEM PARTIDO");
        
        Candidato c0 = new Candidato(99, EMBRANCO, "EMBranco", partido, "ZZ");
        Candidato c1 = new Candidato(01, SENADOR, "sena", partido, "ZZ");
        Candidato c2 = new Candidato(99, SENADOR, "sena", partido, "ZZ");
        Candidato c3 = new Candidato(99, SENADOR, "depu", partido, "ZZ");
        
        Urna u = new Urna(1,1,1, "SEILA", "ZZ");
        
             
               
        
        ControladorPrincipal ctrl = new ControladorPrincipal();
        
        ctrl.getCtrlPartido().CadastraPartido(partido);
        ctrl.getCtrlCandidato().CadastraCandidato(c0);
        ctrl.getCtrlCandidato().CadastraCandidato(c1);
        ctrl.getCtrlCandidato().CadastraCandidato(c2);
        ctrl.getCtrlCandidato().CadastraCandidato(c3);
        ctrl.getCtrlUrna().CadastraUrna(u);
        
        
        ctrl.ExibeMenuPrincipal();
        
    }
    
}
