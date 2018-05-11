/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.controladores;

import java.util.ArrayList;
import urna.entidades.Candidato;
import urna.entidades.Eleitor;
import urna.entidades.Partidos;
import urna.telas.TelaCandidato;
import urna.telas.TelaPartido;

/**
 *
 * @author Fernando
 */
public class ControladorPartido {

    private TelaPartido telaPartido;
    private ArrayList<Partidos> partidos;
    private ControladorPrincipal owner;

    public ControladorPartido(ControladorPrincipal owner) {
        this.telaPartido = new TelaPartido(this);
        this.partidos = new ArrayList<>();
        this.owner = owner;
    }
    
    public void ExibeMenuPartido() {
       telaPartido.ExibeMenuPartido();
    }

    public void CadastraPartido(Partidos parti) {
        partidos.add(parti);
    }
    
    public void listaPartido() {
        
            for (Partidos parti : partidos) {
                System.out.println(parti);
            
        }

    }

    public Partidos BuscaPartido(int numeropartido) {
       
        for (int p = 1; p < partidos.size(); p++) {
            Partidos parti = partidos.get(p);
            if (parti.getNumeroPartido()== numeropartido) {
                return parti;

            }
          
        }
        Partidos parti = partidos.get(0);
        return parti;
        
    }
    
}
