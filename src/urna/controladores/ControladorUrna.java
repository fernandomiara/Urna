/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.controladores;

import java.util.ArrayList;
import urna.entidades.Urna;
import urna.telas.TelaUrna;

/**
 *
 * @author Fernando
 */
public class ControladorUrna {

     private TelaUrna telaUrna;
    private ArrayList<Urna> urnas;
    private ControladorPrincipal owner;

    public ControladorUrna(ControladorPrincipal owner) {
        this.telaUrna = new TelaUrna(this);
        this.urnas = new ArrayList<>();
        this.owner = owner;
    }
    
    public void ExibeMenuUrna() {
       telaUrna.ExibeTelaUrna();
    }
    
    public void ExibeMenuVotacao(){
    
    }
    
    public Urna BuscaUrna(int urn){
        for (int u = 0; u < urnas.size(); u++) {
            Urna urna = urnas.get(u);
            if (urna.getNumero()== urn) {
                return urna;

            }
          
        }
        return null;
        
    }
    public void CadastraUrna(Urna urna){
        if(validaSessao(urna) == true){
            urnas.add(urna);
        }else{
            
        }
        }
    

    public void ListaUrnas() {
       for(Urna urn : urnas){
            System.out.println(urn);
       }
    }

    public void ExcluirUrna(int numero) {
       Urna urna = BuscaUrna(numero); 
       urnas.remove(urna);
    }

    public void AlteraUrna(int numero) {
        for (Urna urn : urnas) {
            if (urn.getNumero() == numero) {
                telaUrna.AlteraUrna(urn);
            }
        }
    }
    public boolean validaSessao(Urna urna) {
        boolean sessaovalida = true;
        if (urna != null) {
            for (Urna u : urnas) {
                if (u.getNumero()== urna.getNumero() && u.getEstado().equals(urna.getEstado()) && u.getNumeroSessao() == urna.getNumeroSessao() && u.getNumeroZona() == urna.getNumeroZona()) {
                    telaUrna.ZonaEleitoralJaCadastrada();
                    sessaovalida = false;

                }
            }
        }

        return sessaovalida;
    }
    
}
