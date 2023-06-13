/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaCollares;
import proyectofinalpoe.Vistas.jifRegistrarCollar;

/**
 *
 * @author aleja
 */
public class CtrlCollar implements ActionListener{

    jifRegistrarCollar vista;
    ListaCollares collares;
    
    public CtrlCollar(jifRegistrarCollar registrarCollar, ListaCollares collares, Entrada entradaAux) {
        this.vista = registrarCollar;
        this.collares = collares;
        
    }
    
    
    public void CtrlCollar(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
    
    }
    void iniciar() {
    }
    
    
    
}
