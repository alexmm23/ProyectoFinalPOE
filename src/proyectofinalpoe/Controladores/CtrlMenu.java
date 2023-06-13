/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectofinalpoe.Modelo.Usuario;
import proyectofinalpoe.Vistas.frmIngresar;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import proyectofinalpoe.Vistas.jifNuevoUsuario;
import proyectofinalpoe.Vistas.jifNuevaEntrada;

/**
 *
 * @author aleja
 */
public class CtrlMenu implements ActionListener{
    //private frmIngreso vistaIngreso;
    private frmMenuPrincipal vista;
    private Usuario usuario;
    
     public CtrlMenu(frmMenuPrincipal vista, Usuario usuario){
        this.vista = vista;
        this.usuario = usuario;
        this.vista.jmiNuevoUsuario.addActionListener(this);
        this.vista.jmiNuevaEntrada.addActionListener(this);
        this.vista.jmiNuevaSalida.addActionListener(this);
        this.vista.jmiEliminarEntrada.addActionListener(this);
        this.vista.jmiEliminarSalida.addActionListener(this);
        this.vista.jmiEliminarUsuario.addActionListener(this);
        this.vista.jmiBuscarProducto.addActionListener(this);
        this.vista.jmiBuscarEntrada.addActionListener(this);
        this.vista.jmiBuscarSalida.addActionListener(this);
        this.vista.jmiMostrarProductos.addActionListener(this);
        this.vista.jmiMostrarEntradas.addActionListener(this);
        this.vista.jmiMostrarSalidas.addActionListener(this);
        this.vista.jmnSalir.addActionListener(this);
      

        
    }
      public void iniciar(){
        vista.setTitle("Menu Principal");
        vista.setLocationRelativeTo(null);
    }
      @Override
      public void actionPerformed(ActionEvent e){
          if(e.getSource() == vista.jmiNuevoUsuario){
              jifNuevoUsuario vistaNuevoUsuario = new jifNuevoUsuario();
              CtrlNuevoUsuario ctrlnUsuario = new CtrlNuevoUsuario(vista);
              vista.jdpEscritorio.add(vistaNuevoUsuario);
              vistaNuevoUsuario.show();
              
              
          }else if(e.getSource() == vista.jmiNuevaEntrada){
              jifNuevaEntrada vistaNuevaEntrada = new jifNuevaEntrada();
              CtrlNuevaEntrada ctrlnEntrada = new CtrlNuevaEntrada();
              
          }else if(e.getSource() == vista.jmiNuevaSalida){
              
          }else if(e.getSource() == vista.jmiEliminarUsuario){
              
          }else if(e.getSource() == vista.jmiEliminarEntrada){
              
          }else if(e.getSource() == vista.jmiEliminarSalida){
              
          }else if(e.getSource() == vista.jmiBuscarProducto){
              
          }else if(e.getSource() == vista.jmiBuscarEntrada){
              
          }else if(e.getSource() == vista.jmiBuscarSalida){
              
          }else if(e.getSource() == vista.jmiMostrarProductos){
              
          }else if(e.getSource() == vista.jmiMostrarEntradas){
              
          }else if(e.getSource() == vista.jmiMostrarSalidas){
              
          }else{//Salir
              frmIngresar ingreso = new frmIngresar();
              ingreso.setVisible(true);
              vista.dispose();
          }
      }
    
    
}
