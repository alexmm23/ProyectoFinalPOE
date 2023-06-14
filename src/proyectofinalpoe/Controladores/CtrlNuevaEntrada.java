/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaEntradas;
import proyectofinalpoe.Modelo.ListaProducto;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifNuevaEntrada;
import proyectofinalpoe.Vistas.jifRegistrarAnillo;
import proyectofinalpoe.Vistas.jifRegistrarArete;
import proyectofinalpoe.Vistas.jifRegistrarCollar;

/**
 *
 * @author aleja
 */
public class CtrlNuevaEntrada implements ActionListener{
    
    private CtrlMenu menu;
    private jifNuevaEntrada vista;
    private ListaProducto listaProductos;
    private ListaEntradas listaEntradas;
    
    public CtrlNuevaEntrada(CtrlMenu menu, jifNuevaEntrada vista,ListaEntradas listaEntradas, ListaProducto listaProductos ){
        this.menu = menu;
        this.vista = vista;
        this.listaEntradas = listaEntradas;
        this.listaProductos = listaProductos;
        this.vista.jbnRegresar.addActionListener(this);
        this.vista.jbnSiguiente.addActionListener(this);

    }
    void iniciar() {
        jdpEscritorio.add(vista);
        vista.show();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnRegresar){           
            vista.dispose();
            
        }else if(e.getSource() == vista.jbnSiguiente){
            Entrada entradaAux = new Entrada();
            String fecha;
            //validar los campos en una sola variable
            boolean estanVacios = vista.jtfCantProductos.getText().isEmpty() || vista.jtfCantProductos.getText().isEmpty()
                    || vista.jtfProveedor.getText().isEmpty() 
                    || vista.jcbMeses.getSelectedIndex() == 0
                    || vista.jcbAnio.getSelectedIndex() == 0
                    || vista.jcbDias.getSelectedIndex() == 0;
            
            //Validar que no haya campos vacios
            if(estanVacios){
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                fecha = String.valueOf(vista.jcbDias.getSelectedItem())+ "/" + String.valueOf(vista.jcbMeses.getSelectedItem()) + "/" + String.valueOf(vista.jcbAnio.getSelectedItem());
                entradaAux.setCostoCompra(Double.parseDouble(vista.jtfCostoCompra.getText()));
                entradaAux.setFecha(fecha);
                entradaAux.setNumProductos(Integer.parseInt(vista.jtfCantProductos.getText()));
                entradaAux.setProveedor(vista.jtfProveedor.getText());
                entradaAux.setTipoProducto(String.valueOf(vista.jcbTipoProducto.getSelectedItem()));
                
                listaEntradas.agregar(entradaAux);
                
                switch (vista.jcbTipoProducto.getSelectedIndex()) {
                    case 1 : {
                        jifRegistrarAnillo vistaRegistrarAnillo = new jifRegistrarAnillo();
                        CtrlAnillo ctrlAnillo = new CtrlAnillo(menu,vistaRegistrarAnillo,listaProductos, entradaAux);
                        ctrlAnillo.iniciar();
                        vista.dispose();
                    }
                    case 2 : {
                        jifRegistrarArete vistaRegistrarArete = new jifRegistrarArete();
                        CtrlArete ctrlArete = new CtrlArete(vistaRegistrarArete, listaProductos,entradaAux);
                        ctrlArete.iniciar();
                        vista.dispose();
                    }
                    case 3 : {
                        jifRegistrarCollar vistaRegistrarCollar = new jifRegistrarCollar();
                        CtrlCollar ctrlCollar = new CtrlCollar(vistaRegistrarCollar, listaProductos,entradaAux);
                        ctrlCollar.iniciar();
                        vista.dispose();
                    }

                }
            }   
        }
    }
}