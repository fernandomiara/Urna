/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.controladores;

import java.util.ArrayList;
import java.util.Scanner;
import urna.entidades.Candidato;
import static urna.entidades.TipoCandidato.DEPUTADO;
import static urna.entidades.TipoCandidato.SENADOR;
import urna.entidades.Urna;
import urna.entidades.Votacao;
import urna.telas.TelaVotacao;

/**
 *
 * @author Fernando
 */
public class ControladorVotacao {

    private TelaVotacao telaVotacao;
    private ArrayList<Votacao> votos;
    private ControladorPrincipal owner;
    private Urna urn;

    public ControladorVotacao(ControladorPrincipal owner) {
        this.telaVotacao = new TelaVotacao(this);
        this.votos = new ArrayList<>();
        this.owner = owner;
    }
    
    public void ExibeMenuVotacao() {
       telaVotacao.MenuVotacao();
    }
    
    public int QuantidadedeVotos(int urna){
        return owner.getCtrlEleitor().QuantidadedeVotos(urna);
        
    }

    public void CadastraVoto(Votacao votando) {
        votos.add(votando);
    }
    
    public Candidato BuscaCandidato(int voto){
        return owner.getCtrlCandidato().BuscaCandidato(voto);
    }

    public void BuscaUrna(int urna) {
        ArrayList<Candidato> candi = new ArrayList<>();
        urn = owner.getCtrlUrna().BuscaUrna(urna);
        String estado = urn.getEstado();
        candi = BuscaCandidatoPelaUrna(estado);
        int senador = 0;
        int deputado = 0;
            for (int i = 0 ; i <= candi.size()-1; i++){
                Candidato candida = candi.get(i);
                if(candida.getTipocandidato().equals(SENADOR)){
                   senador++;
                    
                }else if(candida.getTipocandidato().equals(DEPUTADO)){
                    deputado++;
                    
                }else{}
            }
            
            if(deputado != 0 && senador != 0){
                telaVotacao.ExibeVotacaoDois(urna);
                
            }else if(deputado !=0 && senador == 0){
                telaVotacao.ExibeVotacaoDeputado(urna);
            }else{
                telaVotacao.ExibeVotacaoSenador(urna);
                
            }
    }
    
    public ArrayList<Candidato>BuscaCandidatoPelaUrna(String estado){
        ArrayList<Candidato> candi = new ArrayList<>();
        candi = owner.getCtrlCandidato().BuscaCandidatoPeloEstado(estado);
        return candi;
    }
    
    public void listaVotacao() {
        for (Votacao vot : votos) {
            System.out.println(vot);

        }
    }
}
