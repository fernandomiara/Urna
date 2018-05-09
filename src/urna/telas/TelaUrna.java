/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.telas;

import java.util.Scanner;
import urna.controladores.ControladorUrna;

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
    
    
}
