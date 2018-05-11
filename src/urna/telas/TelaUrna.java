/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.telas;

import java.util.InputMismatchException;
import java.util.Scanner;
import urna.controladores.ControladorUrna;
import urna.entidades.Urna;

/**
 *
 * @author Fernando
 */
public class TelaUrna {
    
    private ControladorUrna owner;
    private Scanner teclado;

    public TelaUrna(ControladorUrna owner) {
        teclado = new Scanner(System.in);
        this.owner = owner;
    }
    
    public void ExibeTelaUrna(){
        int opcao = 0;

        try {
            do {

                System.out.println("---- Tela Principal ----");
                System.out.println("1 - cadastrar Urna \n2 - Listar Urna \n3 - Excluir Urna \n4 - AlterarUrna \n ---------------------\nEscolha opcao:");

                opcao = teclado.nextInt();

                switch (opcao) {
                    case 1:

                        ExibeCadastrarUrna();
                        break;

                    case 2:

                        owner.ListaUrnas();
                        break;
                       
                    case 3:
                        ExcluirUrna();
                        break;
                        
                    case 4:
                        System.out.println("Numero da Urna a ser alterado:");
                        owner.AlteraUrna(teclado.nextInt());
                     
                }
            }
            
            while (opcao != 0);
            
        } catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            teclado.nextLine();
            ExibeTelaUrna();
           
        }
    }

    private void ExibeCadastrarUrna() {
        System.out.println("Digite o numero da urna");
        int numero = teclado.nextInt();
        System.out.println("Digite a cidade da urna");
        String cidade = teclado.next();
        System.out.println("Digite a sigla do estado(SC/PR/RS)");
        String estado = teclado.next();
        System.out.println("Digite o numero da Sessão Eleitoral");
        int sessao = teclado.nextInt();
        System.out.println("Digite o numero da Zona Eleitoral");
        int zona = teclado.nextInt();
        Urna urna = new Urna(numero, sessao, zona, cidade, estado);
        owner.CadastraUrna(urna);
    }

    private void ExcluirUrna() {
        System.out.println("Digite o numero da urna:");
        int numero = teclado.nextInt();
        owner.ExcluirUrna(numero);
    }

    public void AlteraUrna(Urna urn) {
        try {

            System.out.println("Digite a nova Cidade:");
            String cidade = teclado.next();
            urn.setCidade(cidade);
            System.out.println("Digite o novo Estado:");
            String estado = teclado.next();
            urn.setEstado(estado);
            System.out.println("Digite a nova Sessão:");
            int sessao = teclado.nextInt();
            urn.setNumeroSessao(sessao);

            System.out.println("Digite a nova Zona Eleitoral");
            int zona = teclado.nextInt();
            urn.setNumeroZona(zona);
            

        } catch (InputMismatchException error) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            ExibeTelaUrna();
            teclado.nextLine();
        }

    }

    public void ZonaEleitoralJaCadastrada() {
        System.out.println("NANANINÂO ja tem essa zona ai.");
    }
    
    
}
