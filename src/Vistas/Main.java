package Vistas;

import Entidades.Auto;
import Entidades.Servicio;
import Enumeradores.EnumTipoServicio;
import javax.swing.JOptionPane;

/**
 *
 * @author Pepe
 */
public class Main {

    public static void main(String[] args) {
        frmPrincipal princ = new frmPrincipal();
        princ.setVisible(true);
        
        Auto auto1 = new Auto(1, "WEB2431", "Nissan", "Tsuru", 2015, "Blanco", "Sedan", 5);
       Servicio s = new Servicio();
       s.setTipo(EnumTipoServicio.FRENOS);
        System.out.println(s.getTipo().name());
       
        int numAuto = Integer.parseInt(JOptionPane.showInputDialog("Dar num de auto a buscar"));
        Auto auto2 = new Auto(numAuto, "WEB2431", "Nissan", "Tsuru", 2015, "Blanco", "Sedan", 5);
        
        System.out.println(auto1.equals(auto2) ? "Encontrado " : "No encontrado ");

    }

}
