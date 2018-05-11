/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.telas;

import java.util.InputMismatchException;
import java.util.Scanner;
import urna.controladores.ControladorEleitor;
import urna.entidades.Eleitor;

/**
 *
 * @author Fernando
 */
public class TelaEleitor {
    private ControladorEleitor owner;
    private Scanner teclado;

    public TelaEleitor(ControladorEleitor owner) {
        teclado = new Scanner(System.in);
        this.owner = owner;
    }
    public void ExibeTelaCadastro(){
            System.out.println("Digite o numero do Eleitor: ");
            int numero = teclado.nextInt();

            System.out.println("Digite o nome do Eleitor: ");
            String nome = teclado.next();

            System.out.println("Digite o numero da Urna de Votação: ");
            int urna = teclado.nextInt();

            Eleitor eleitor = new Eleitor(numero, nome, urna);
            owner.cadastraEleitor(eleitor);
    }

    public void ExibeMenuEleitor() {
       
        int opcao = 0;

        try {
            do {

                System.out.println("-------- Tela Eleitor --------");
                System.out.println("1 - Cadastra Eleitor");
                System.out.println("2 - Lista Eleitor");
                System.out.println("3 - Altera Eleitor");
                System.out.println("4 - Excluir Eleitor");
                System.out.println("0 - Encerra");
                System.out.println("Escolha a opcao: ");
                opcao = teclado.nextInt();
              

                switch (opcao) {
                    case 1:
                        ExibeTelaCadastro();
                        break;
                   
                    case 2:
                        System.out.println("Lista de Eleitores");
                        owner.listaEleitor();
                        break;
                        
                    case 3:
                        System.out.println("Digite o numero do eleitor para alterar:");
                        int eleitor = teclado.nextInt();
                        owner.alteraEleitor(eleitor);
                }

            } while (opcao != 0);
        } catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            teclado.nextLine();

        }
    }

    public void AlteraEleitor(Eleitor ele) {
        try {

            System.out.println("Digite o nome do Eleitor:");
            String nome = teclado.next();
            ele.setNome(nome);
            System.out.println("Digite o numero da nova urna de Votação:");
            int urna = teclado.nextInt();
            ele.setUrna(urna);           
            

        } catch (InputMismatchException error) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            owner.ExibeMenuEleitor();
            teclado.nextLine();
        }

    }

  

}