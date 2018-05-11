/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.controladores;

import java.text.ParseException;
import java.util.ArrayList;
import urna.entidades.Eleitor;
import urna.telas.TelaEleitor;

/**
 *
 * @author Fernando
 */
public class ControladorEleitor {

    private TelaEleitor telaEleitor;
    private ArrayList<Eleitor> eleitores;
    private ControladorPrincipal owner;

    public ControladorEleitor(ControladorPrincipal owner) {
        this.telaEleitor = new TelaEleitor(this);
        this.eleitores = new ArrayList<>();
        this.owner = owner;
    }
    
    public void ExibeMenuEleitor() {
       telaEleitor.ExibeMenuEleitor();
    }
    public void cadastraEleitor(Eleitor eleitor){
        eleitores.add(eleitor);
    }
    public void listaEleitor() {
        
            for (Eleitor elei : eleitores) {
                System.out.println(elei);
            
        }

    }
    int tamanho = 0;
    public int QuantidadedeVotos(int urna){
        for(int i=0; i <= eleitores.size()-1; i++){
            Eleitor ele = eleitores.get(i);
            if(ele.getUrna() == urna){
            tamanho += 1;
            }else{
            tamanho = tamanho;
            }
                
        }
        return tamanho;
    }
    public Eleitor BuscaEleitor(int ele){
        for (int u = 0; u < eleitores.size(); u++) {
            Eleitor elei = eleitores.get(u);
            if (elei.getNumero()== ele) {
                return elei;

            }
          
        }
        return null;
        
    }
    public void alteraEleitor(int eleitor) {
        for (Eleitor ele : eleitores) {
            if (ele.getNumero() == eleitor) {
                telaEleitor.AlteraEleitor(ele);
            }
        }
    }

    
    
}
