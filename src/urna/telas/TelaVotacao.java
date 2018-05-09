/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.telas;

import java.util.Scanner;
import urna.controladores.ControladorCandidato;
import urna.controladores.ControladorVotacao;
import urna.entidades.Candidato;
import urna.entidades.Urna;
import urna.entidades.Votacao;

/**
 *
 * @author Fernando
 */
public class TelaVotacao {
    private ControladorVotacao owner;
    private Scanner teclado;
    private Candidato candidato;
    private Urna urn;

    public TelaVotacao(ControladorVotacao owner) {
        teclado = new Scanner(System.in);
        this.owner = owner;
    }
    /** 3 vagas **/
    int urna = 0;
    int turno = 0;
    public void BuscaUrna(){
        
        System.out.println("Digite o numero da urna de votacao:");
        urna = teclado.nextInt();
        turno = 1;
        owner.BuscaUrna(urna);
        
        }
        
    
    
    public void ExibeVotacaoDeputado() {
        int turno = 1;
        System.out.println("Digite o numero da urna de votacao:");
        int urna = teclado.nextInt();
        int tamanho = owner.QuantidadedeVotos(urna);
        for(int i=1; i <= tamanho ; i++){
            System.out.println("VOTO");
            int voto = teclado.nextInt();
            candidato = owner.BuscaCandidato(voto);
            Votacao votando = new Votacao(candidato, urna, turno);
            owner.CadastraVoto(votando);
        }
    }
    
    public void ExibeVotacaoDois(){}
    public void ExibeVotacaoSenador() {
        
        int tamanho = owner.QuantidadedeVotos(urna);
        for(int i=1; i <= tamanho ; i++){
            System.out.println("VOTO");
            int voto = teclado.nextInt();
            candidato = owner.BuscaCandidato(voto);
            Votacao votando = new Votacao(candidato, urna, turno);
            owner.CadastraVoto(votando);
        }
    }
}
