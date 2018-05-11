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
        Partidos partido = new Partidos(0, "KXA2");
        
        Candidato c0 = new Candidato(99, EMBRANCO, "EMBranco", partido, "ZZ");
        Candidato c1 = new Candidato(01, SENADOR, "sena", partido, "ZZ");
        Candidato c2 = new Candidato(22, SENADOR, "sena", partido, "ZZ");
        Candidato c3 = new Candidato(33, SENADOR, "depu", partido, "ZZ");
        Candidato c4 = new Candidato(45, DEPUTADO, "depu", partido, "ZZ");
        
        Urna u = new Urna(1,1,1, "SEILA", "ZZ");
        
        Eleitor e0 = new Eleitor(1,"Fernando",1);
        Eleitor e1 = new Eleitor(2,"Cainã",1);
        Eleitor e2 = new Eleitor(3,"Lucas",1);
        Eleitor e3 = new Eleitor(4,"José",1);
        Eleitor e4 = new Eleitor(5,"Maria",1);
               
        
        ControladorPrincipal ctrl = new ControladorPrincipal();
        
        ctrl.getCtrlPartido().CadastraPartido(partido);
        ctrl.getCtrlCandidato().CadastraCandidato(c0);
        ctrl.getCtrlCandidato().CadastraCandidato(c1);
        ctrl.getCtrlCandidato().CadastraCandidato(c2);
        ctrl.getCtrlCandidato().CadastraCandidato(c3);
        ctrl.getCtrlCandidato().CadastraCandidato(c4);
        ctrl.getCtrlUrna().CadastraUrna(u);
        ctrl.getCtrlEleitor().cadastraEleitor(e0);
        ctrl.getCtrlEleitor().cadastraEleitor(e1);
        ctrl.getCtrlEleitor().cadastraEleitor(e2);
        ctrl.getCtrlEleitor().cadastraEleitor(e3);
        ctrl.getCtrlEleitor().cadastraEleitor(e4);
        
        
        ctrl.ExibeMenuPrincipal();
        
    }
    
}
