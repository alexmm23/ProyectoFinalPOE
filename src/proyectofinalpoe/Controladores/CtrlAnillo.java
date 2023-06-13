/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectofinalpoe.Modelo.ListaAnillos;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifRegistrarAnillo;

/**
 *
 * @author aleja
 */
public class CtrlAnillo implements ActionListener {

    public CtrlAnillo(jifRegistrarAnillo registrarAnillo, ListaAnillos anillos1) {
    }
    
    private jifRegistrarAnillo vista;
    private ListaAnillos anillos;
    
    public void CtrlAnillo(jifRegistrarAnillo vista, ListaAnillos anillos){
        this.anillos = anillos;
        this.vista = vista;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    public void iniciar(){
        jdpEscritorio.add(vista);
        vista.show();
    }
    
}
