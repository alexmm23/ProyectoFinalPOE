/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectofinalpoe.Modelo.Anillo;
import proyectofinalpoe.Modelo.ListaEntradas;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Modelo.ListaSalidas;
import proyectofinalpoe.Modelo.Producto;
import proyectofinalpoe.Modelo.Usuario;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import proyectofinalpoe.Vistas.jifBuscarProducto;
import proyectofinalpoe.Vistas.jifMostrarEntradas;
import proyectofinalpoe.Vistas.jifMostrarProductos;
import proyectofinalpoe.Vistas.jifMostrarSalidas;
import proyectofinalpoe.Vistas.jifNuevoUsuario;
import proyectofinalpoe.Vistas.jifNuevaEntrada;
import proyectofinalpoe.Vistas.jifNuevaSalida;

/**
 *
 * @author aleja
 */
public class CtrlMenu implements ActionListener{
    private frmMenuPrincipal vista;
    private CtrlIngreso controlador;
    private Usuario usuario;
    private Usuario[] usuarios;
    private ListaProducto listaProductos;
    private ListaEntradas entradas;
    private ListaSalidas salidas;
    
     public CtrlMenu(frmMenuPrincipal vista, Usuario usuario, Usuario[] usuarios,CtrlIngreso controlador){
        this.vista = vista;
        this.controlador = controlador;
        this.usuario = usuario;
        this.usuarios = usuarios;
        this.entradas = new ListaEntradas();
        this.salidas = new ListaSalidas();
        this.listaProductos = new ListaProducto();
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
              CtrlNuevaEntrada ctrlnEntrada = new CtrlNuevaEntrada(this, vistaNuevaEntrada, entradas, listaProductos);
              ctrlnEntrada.iniciar();
              
          }else if(e.getSource() == vista.jmiNuevaSalida){
              jifNuevaSalida vistaNuevaSalida = new jifNuevaSalida();
              CtrlNuevaSalida ctrlnSalida = new CtrlNuevaSalida(this,vistaNuevaSalida, salidas);
              ctrlnSalida.iniciar();
              
          }else if(e.getSource() == vista.jmiEliminarUsuario){
              
          }else if(e.getSource() == vista.jmiEliminarEntrada){
              
          }else if(e.getSource() == vista.jmiEliminarSalida){
              
          }else if(e.getSource() == vista.jmiBuscarProducto){
              jifBuscarProducto vistaBuscarProducto = new jifBuscarProducto();
              CtrlBuscarProducto ctrlnBuscarProducto = new CtrlBuscarProducto(listaProductos, vistaBuscarProducto );
              ctrlnBuscarProducto.iniciar();
              
          }else if(e.getSource() == vista.jmiBuscarEntrada){
              
          }else if(e.getSource() == vista.jmiBuscarSalida){
              
          }else if(e.getSource() == vista.jmiMostrarProductos){
              jifMostrarProductos vistaMostrarProducto = new jifMostrarProductos();
              CtrlMostrarProductos ctrlMostrarProductos = new CtrlMostrarProductos(listaProductos, vistaMostrarProducto);
              ctrlMostrarProductos.iniciar();
              
          }else if(e.getSource() == vista.jmiMostrarEntradas){
              jifMostrarEntradas vistaMostrarEntradas = new jifMostrarEntradas();
              CtrlMostrarEntradas ctrlMostrarEntradas = new CtrlMostrarEntradas(entradas, vistaMostrarEntradas);
              ctrlMostrarEntradas.iniciar();
              
          }else if(e.getSource() == vista.jmiMostrarSalidas){
              jifMostrarSalidas vistaMostrarSalidas = new jifMostrarSalidas();
              CtrlMostrarSalida ctrlMostrarSalidas = new CtrlMostrarSalida(salidas, vistaMostrarSalidas);
              ctrlMostrarSalidas.iniciar();
              
          }else if(e.getSource() == vista.jbnSalir){//Salir
              this.controlador.iniciar();
              vista.dispose();
          }
      }

    

    public ListaEntradas getEntradas() {
        return entradas;
    }

    public void setEntradas(ListaEntradas entradas) {
        this.entradas = entradas;
    }

    public ListaProducto getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ListaProducto listaProductos) {
        this.listaProductos = listaProductos;
    }
    
      

      
    
}
