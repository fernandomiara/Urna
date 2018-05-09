/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.telas;

import java.util.InputMismatchException;
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
    private Candidato deputado;
    private Candidato senador;
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
        
    
    
    public void ExibeVotacaoDeputado(int urna) {
        int turno = 1;
        
        int tamanho = owner.QuantidadedeVotos(urna);
        for(int i=1; i <= tamanho ; i++){
            System.out.println("VOTO PARA DEPUTADO");
            int voto = teclado.nextInt();
            deputado = owner.BuscaCandidato(voto);
            Votacao votando = new Votacao(deputado, urna, turno);
            owner.CadastraVoto(votando);
        }
    }
    
    public void ExibeVotacaoDois(int urna){
        turno = 1;
        int tamanho = owner.QuantidadedeVotos(urna);
        for(int i=1; i <= tamanho ; i++){
            System.out.println("VOTO PARA DEPUTADO"+i);
            int voto = teclado.nextInt();
            deputado = owner.BuscaCandidato(voto);
            Votacao votando = new Votacao(deputado, urna, turno);
            owner.CadastraVoto(votando);
            
            System.out.println("VOTO PARA SENADOR"+i);
            int voto1 = teclado.nextInt();
            senador = owner.BuscaCandidato(voto1);
            Votacao votando1 = new Votacao(senador, urna, turno);
            owner.CadastraVoto(votando1);
        }
    }
    public void ExibeVotacaoSenador(int urna) {
        int turno = 1;
        int tamanho = owner.QuantidadedeVotos(urna);
        for(int i=1; i <= tamanho ; i++){
            System.out.println("VOTO PARA SENADOR");
            int voto = teclado.nextInt();
            senador = owner.BuscaCandidato(voto);
            Votacao votando = new Votacao(senador, urna, turno);
            owner.CadastraVoto(votando);
        }
    }

    public void MenuVotacao() {
      int opcao = 0;

        try {
            do {

                System.out.println("-------- Tela Votação --------");
                System.out.println("1 - Iniciar Votação");
                System.out.println("2 - Lista Votos");
                System.out.println("0 - Encerra");
                System.out.println("Escolha a opcao: ");
                opcao = teclado.nextInt();
              

                switch (opcao) {
                    case 1:
                        BuscaUrna();
                        break;
                   
                    case 2:
                        System.out.println("Lista de Candidatos");
                        owner.listaVotacao();
                        break;

                }

            } while (opcao != 0);
        } catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            teclado.nextLine();

        }
    
    }
    
}
