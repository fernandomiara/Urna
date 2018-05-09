/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.telas;

import java.util.InputMismatchException;
import java.util.Scanner;
import urna.controladores.ControladorPartido;
import urna.entidades.Partidos;

/**
 *
 * @author Fernando
 */
public class TelaPartido {
    private ControladorPartido owner;
    private Scanner teclado;

    public TelaPartido(ControladorPartido owner) {
        teclado = new Scanner(System.in);
        this.owner = owner;
    }
    public void TelaCadastroPartido(){
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
                        telaCadastraPartido();
                        break;
                   
                    case 2:
                        System.out.println("Lista de Candidatos");
                        owner.listaPartido();
                        break;

                }

            } while (opcao != 0);
        } catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            teclado.nextLine();

        }
    }

    private void telaCadastraPartido() {
       System.out.println("Cadastro de Partido");
       System.out.println("Digite o numero do partido");
       int numero = teclado.nextInt();
       System.out.println("Digite a sigla do partido");
       String sigla = teclado.next();
       Partidos parti = new Partidos(numero, sigla);
       owner.CadastraPartido(parti);
    }
}
