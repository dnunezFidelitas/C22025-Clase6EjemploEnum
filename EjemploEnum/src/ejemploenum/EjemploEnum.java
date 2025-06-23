/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploenum;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class EjemploEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una instancia de la clase de empleado y luego se le modifca el valor
        Empleado empleado = new Empleado(0, "Natasha", EstadoEmpleado.Inactivo);
        JOptionPane.showMessageDialog(null, empleado.toString());
        String solicitaNuevoEstado= JOptionPane.showInputDialog("Digite el nuevo estado segun lo siguientes datos\n 1-Activo \n 2-Inativo \n 3-Despedido");
        switch (Integer.parseInt(solicitaNuevoEstado)) {
            case 1:
                empleado.setEstado(EstadoEmpleado.Activo);
                break;
            case 2:
                empleado.setEstado(EstadoEmpleado.Inactivo);
                break;
                
            case 3:
                empleado.setEstado(EstadoEmpleado.Despedido);
                break;    
                
            default:
                JOptionPane.showMessageDialog(null, "Error digitando estado");
        }
        JOptionPane.showMessageDialog(null, empleado.toString());

    }
    
}
