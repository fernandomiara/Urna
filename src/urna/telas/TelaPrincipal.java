/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.telas;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import urna.controladores.ControladorPrincipal;

/**
 *
 * @author Fernando
 */
public class TelaPrincipal {

     private Scanner teclado;
    private ControladorPrincipal owner;

    public TelaPrincipal(ControladorPrincipal owner) {
        this.teclado = new Scanner(System.in);
        this.owner = owner;
    }

    public void ExibeMenuPrincipal() throws ParseException {
        int opcao = 0;

        try {
            do {

                System.out.println("---- Tela Principal ----");
                System.out.println("1 - Urna \n2 - Candidato\n3 - Partido\n4 - Eleitor\n5 - Votação ---------------------\nEscolha opcao:");

                opcao = teclado.nextInt();

                switch (opcao) {
                    case 1:

                        owner.getCtrlUrna().ExibeMenuUrna();
                        break;

                    case 2:

                        owner.getCtrlCandidato().ExibeMenuCandidato();
                        break;
                    case 3:
                        owner.getCtrlPartido().ExibeMenuPartido();
                        break;
                        
                    case 4:
                        owner.getCtrlEleitor().ExibeMenuEleitor();
                        break;
                        
                    case 5:
                        owner.getCtrlVotacao().ExibeMenuVotacao();
                        break;
                }
            }
            
            while (opcao != 0);
            
        } catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            teclado.nextLine();
            ExibeMenuPrincipal();
           
        }
    }

    
}
