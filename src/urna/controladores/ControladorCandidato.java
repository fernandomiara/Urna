/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.controladores;

import java.util.ArrayList;
import urna.entidades.Candidato;
import urna.entidades.Partidos;
import urna.entidades.TipoCandidato;
import urna.telas.TelaCandidato;

/**
 *
 * @author Fernando
 */
public class ControladorCandidato {
    private TelaCandidato telaCandidato;
    private ArrayList<Candidato> candidatos;
    private ControladorPrincipal owner;

    public ControladorCandidato(ControladorPrincipal owner) {
        this.telaCandidato = new TelaCandidato(this);
        this.candidatos = new ArrayList<>();
        this.owner = owner;
    }
    
    public void ExibeMenuCandidato() {
        telaCandidato.ExibeMenuCandidato();
       
    }
    
    public void CadastraCandidato(Candidato candidato){
        if(validaCandidato(candidato) == true){
        candidatos.add(candidato);
        }
    }
    
    public Candidato BuscaCandidato(int voto) {
        for (int c = 1; c < candidatos.size(); c++) {
            Candidato candi = candidatos.get(c);
            if (candi.getNumeroCandidato() == voto) {
                return candi;

            }
          
        }
        Candidato candi = candidatos.get(0);
        return candi;
        
    }

    public void BuscaPartido(TipoCandidato candidato, int numero, String nome, int numeropartido, String estado) {
       Partidos parti = owner.getCtrlPartido().BuscaPartido(numeropartido);
       Candidato candi = new Candidato(numero,candidato, nome, parti, estado);
       CadastraCandidato(candi);
    }

    public void listaCandidato() {
        for (Candidato candi : candidatos) {
                System.out.println(candi);
            
        }
    }
    
     public ArrayList<Candidato> BuscaCandidatoPeloEstado(String estado) {
         ArrayList<Candidato> retornaCandi = new ArrayList<>();
        for (int c = 1; c < candidatos.size(); c++) {
            Candidato candi = candidatos.get(c);
            if (candi.getEstado() == estado) {
                retornaCandi.add(candi);

            }
          
        }
        return retornaCandi;
        
    }
     
     public boolean validaCandidato(Candidato candidato) {
        boolean candidatovalido = true;
        if (candidato != null) {
            for (Candidato c : candidatos) {
                if (c.getNumeroCandidato()== candidato.getNumeroCandidato()) {
                    telaCandidato.CandidatoNumeroDuplicado();
                    candidatovalido = false;

                }
            }
        }

        return candidatovalido;
    }
    
}
