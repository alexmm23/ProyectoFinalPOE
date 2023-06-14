/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectofinalpoe.Modelo.Anillo;
import proyectofinalpoe.Modelo.ListaAnillos;
import proyectofinalpoe.Modelo.ListaAretes;
import proyectofinalpoe.Modelo.ListaCollares;
import proyectofinalpoe.Modelo.ListaEntradas;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Modelo.Usuario;
import proyectofinalpoe.Vistas.frmIngresar;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import proyectofinalpoe.Vistas.jifBuscarProducto;
import proyectofinalpoe.Vistas.jifNuevoUsuario;
import proyectofinalpoe.Vistas.jifNuevaEntrada;

/**
 *
 * @author aleja
 */
public class CtrlMenu implements ActionListener{
    //private frmIngreso vistaIngreso;
    private frmMenuPrincipal vista;
    //private frmIngresar ingreso;
    private CtrlIngreso controlador;
    private Usuario usuario;
    private Usuario[] usuarios;
    private ListaProducto listaproductos;
    private ListaAnillos anillos;
    private ListaCollares collares;
    private ListaAretes aretes;
    private ListaEntradas entradas;
    
     public CtrlMenu(frmMenuPrincipal vista, Usuario usuario, Usuario[] usuarios,CtrlIngreso controlador){
        this.vista = vista;
        this.controlador = controlador;
        this.usuario = usuario;
        this.usuarios = usuarios;
        this.listaproductos = new ListaProducto();
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
        this.vista.jbnSalir.addActionListener(this);
        
        Anillo anillo = new Anillo();
        anillo.setId(123);
        anillo.setPiedra("Lapizlazuli");
        listaproductos.agregar(anillo);
        
    }
    public void actualizarArreglo(Usuario[] usuarios){
        this.usuarios = usuarios;
    }
      public void iniciar(){
        vista.setTitle("Menu Principal");
        vista.jlbTitulo.setText("Hola " + usuario.getNombre());
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
      @Override
      public void actionPerformed(ActionEvent e){
          if(e.getSource() == vista.jmiNuevoUsuario){
              jifNuevoUsuario vistaNuevoUsuario = new jifNuevoUsuario();
              CtrlNuevoUsuario ctrlnUsuario = new CtrlNuevoUsuario(usuarios,vistaNuevoUsuario,this);
              ctrlnUsuario.iniciar();
              
              
          }else if(e.getSource() == vista.jmiNuevaEntrada){
              jifNuevaEntrada vistaNuevaEntrada = new jifNuevaEntrada();
              CtrlNuevaEntrada ctrlnEntrada = new CtrlNuevaEntrada(this, vistaNuevaEntrada);
              ctrlnEntrada.iniciar();
              
          }else if(e.getSource() == vista.jmiNuevaSalida){
              
          }else if(e.getSource() == vista.jmiEliminarUsuario){
              
          }else if(e.getSource() == vista.jmiEliminarEntrada){
              
          }else if(e.getSource() == vista.jmiEliminarSalida){
              
          }else if(e.getSource() == vista.jmiBuscarProducto){
              jifBuscarProducto vistaBuscarProducto = new jifBuscarProducto();
              CtrlBuscarProducto ctrlnBuscarProducto = new CtrlBuscarProducto(listaproductos, vistaBuscarProducto );
              ctrlnBuscarProducto.iniciar();
              
          }else if(e.getSource() == vista.jmiBuscarEntrada){
              
          }else if(e.getSource() == vista.jmiBuscarSalida){
              
          }else if(e.getSource() == vista.jmiMostrarProductos){
              
          }else if(e.getSource() == vista.jmiMostrarEntradas){
              
          }else if(e.getSource() == vista.jmiMostrarSalidas){
              
          }else if(e.getSource() == vista.jbnSalir){//Salir
              this.controlador.iniciar();
              vista.dispose();
          }
      }

    public ListaAnillos getAnillos() {
        return anillos;
    }

    public void setAnillos(ListaAnillos anillos) {
        this.anillos = anillos;
    }

    public ListaCollares getCollares() {
        return collares;
    }

    public void setCollares(ListaCollares collares) {
        this.collares = collares;
    }

    public ListaAretes getAretes() {
        return aretes;
    }

    public void setAretes(ListaAretes aretes) {
        this.aretes = aretes;
    }

    public ListaEntradas getEntradas() {
        return entradas;
    }

    public void setEntradas(ListaEntradas entradas) {
        this.entradas = entradas;
    }
    
      

      
    
}
