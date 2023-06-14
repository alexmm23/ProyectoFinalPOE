/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalpoe;

import proyectofinalpoe.Controladores.CtrlIngreso;
import proyectofinalpoe.Modelo.Usuario;
import proyectofinalpoe.Vistas.frmIngresar;

/**
 *
 * @author aleja
 */
public class ProyectoFinalPOE {

    /**
     * @param args the command line arguments
     */
   
 
    public static void main(String[] args) {
        frmIngresar f = new frmIngresar();
        Usuario usuarios[] = new Usuario[10];
        usuarios[0] = new Usuario(0,"admin", "admin");
        CtrlIngreso ctrlIngreso = new CtrlIngreso(f, usuarios);
        ctrlIngreso.iniciar();
    }
    
}
