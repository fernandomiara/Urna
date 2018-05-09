/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.telas;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import urna.controladores.ControladorCandidato;
import urna.entidades.Candidato;
import urna.entidades.Partidos;
import urna.entidades.TipoCandidato;
import static urna.entidades.TipoCandidato.DEPUTADO;
import static urna.entidades.TipoCandidato.SENADOR;

/**
 *
 * @author Fernando
 */
public class TelaCandidato {
    
    private ControladorCandidato owner;
    private Scanner teclado;

    public TelaCandidato(ControladorCandidato owner) {
        teclado = new Scanner(System.in);
        this.owner = owner;
    }

    public void ExibeCadastraCandidato(TipoCandidato candidato) {
       
       System.out.println("Digite o numero do candidato");
       int numero = teclado.nextInt();
       System.out.println("Digite o nome de Candidato");
       String nome = teclado.next();
       System.out.println("Digite o numero do candidato");
       String estado = teclado.next();
       ExibeTelaPartido(candidato, numero, nome, estado);
       
    }
    
    public TipoCandidato telaCandidato() {

        TipoCandidato candidato = null;
        System.out.println("Cadastro de Candidato");
        System.out.println("1 - DEPUTADO\n2 - SENADOR\nEscolha opcao:");
        int opcaoCargo = teclado.nextInt();
        if (opcaoCargo > 0 && opcaoCargo <= 5) {
            switch (opcaoCargo) {
                case 1:
                    candidato = DEPUTADO;
                    break;
                case 2:
                    candidato = SENADOR;
                    break;
            }
            ExibeCadastraCandidato(candidato);
        } else {
            System.out.println("Opcao invalida");
            ExibeMenuCandidato();
        }
        return candidato;

        
    }

    public void ExibeMenuCandidato() {
        
       
        int opcao = 0;

        try {
            do {

                System.out.println("-------- Tela Candidato --------");
                System.out.println("1 - Cadastra Candidato");
                System.out.println("2 - Lista Candidato");
                System.out.println("0 - Encerra");
                System.out.println("Escolha a opcao: ");
                opcao = teclado.nextInt();
              

                switch (opcao) {
                    case 1:
                        telaCandidato();
                        break;
                   
                    case 2:
                        System.out.println("Lista de Candidatos");
                        owner.listaCandidato();
                        break;

                }

            } while (opcao != 0);
        } catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            teclado.nextLine();

        }
    }

    private void ExibeTelaPartido(TipoCandidato candidato, int numero, String nome, String estado) {
       System.out.println("Digite o numero do partido");
       int numeropartido = teclado.nextInt();
       owner.BuscaPartido(candidato, numero, nome, numeropartido, estado);
    }

    
    }

    

