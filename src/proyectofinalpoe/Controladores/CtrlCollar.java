/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Vistas.jifRegistrarCollar;

/**
 *
 * @author aleja
 */
public class CtrlCollar implements ActionListener{

    jifRegistrarCollar vista;
    ListaProducto listaProductos;
    Entrada entrada;
    
    public CtrlCollar(jifRegistrarCollar vistaRegistrarCollar, ListaProducto listaProductos, Entrada entradaAux) {
        this.vista = vistaRegistrarCollar;
        this.entrada = entradaAux;
        this.listaProductos = listaProductos;
        
    }
    
    
    public void CtrlCollar(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
    
    }
    void iniciar() {
    }
    
    
    
}
