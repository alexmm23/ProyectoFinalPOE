/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Vistas.jifRegistrarArete;

/**
 *
 * @author aleja
 */
public class CtrlArete implements ActionListener{
    private ListaProducto listaProductos;
    private Entrada entrada;
    private jifRegistrarArete vista;

    public CtrlArete(jifRegistrarArete vistaRegistrarArete, ListaProducto listaProductos, Entrada entradaAux) {
        this.vista = vistaRegistrarArete;
        this.entrada = entradaAux;
        this.listaProductos = listaProductos;
    }
    
    
    public void CtrlArete(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    public void iniciar(){
        
    }
    
}
