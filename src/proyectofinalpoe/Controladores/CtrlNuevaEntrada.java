/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaAnillos;
import proyectofinalpoe.Modelo.ListaAretes;
import proyectofinalpoe.Modelo.ListaCollares;
import proyectofinalpoe.Modelo.ListaEntradas;
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
    private ListaAnillos anillos;
    private ListaAretes aretes;
    private ListaCollares collares;
    private ListaEntradas entradas;
    
    public CtrlNuevaEntrada(CtrlMenu menu, jifNuevaEntrada vista){
        this.menu = menu;
        this.vista = vista;
        this.anillos = menu.getAnillos();
        this.aretes = menu.getAretes();
        this.collares = menu.getCollares();
        this.entradas = menu.getEntradas();
        this.vista.jbnRegresar.addActionListener(this);
        this.vista.jbnSiguiente.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnRegresar){
            
            menu.setAnillos(anillos);
            menu.setAretes(aretes);
            menu.setCollares(collares);
            menu.setEntradas(entradas);
            
            vista.dispose();
            
        }else if(e.getSource() == vista.jbnSiguiente){
            Entrada entradaAux = new Entrada();
            String fecha = "";
            boolean estanVacios = vista.jtfCantProductos.getText().isEmpty() || vista.jtfCantProductos.getText().isEmpty()
                    || vista.jtfProveedor.getText().isEmpty() 
                    || vista.jcbMeses.getSelectedIndex() == 0
                    || vista.jcbAnio.getSelectedIndex() == 0
                    || vista.jcbDias.getSelectedIndex() == 0;
            if(estanVacios){//Validar que no haya campos vacios
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                fecha = String.valueOf(vista.jcbDias.getSelectedItem())+ "/" + String.valueOf(vista.jcbMeses.getSelectedItem()) + "/" + String.valueOf(vista.jcbAnio.getSelectedItem());
                entradaAux.setCostoCompra(Double.parseDouble(vista.jtfCostoCompra.getText()));
                entradaAux.setFecha(fecha);
                entradaAux.setNumProductos(Integer.parseInt(vista.jtfCantProductos.getText()));
                entradaAux.setProveedor(vista.jtfProveedor.getText());
                entradaAux.setTipoProducto(String.valueOf(vista.jcbTipoProducto.getSelectedItem()));
                
                entradas.agregar(entradaAux);
            switch (vista.jcbTipoProducto.getSelectedIndex()) {
                case 1 -> {
                    jifRegistrarAnillo registrarAnillo = new jifRegistrarAnillo();
                    CtrlAnillo ctrlAnillo = new CtrlAnillo(registrarAnillo, anillos, entradaAux);
                    ctrlAnillo.iniciar();
                    vista.dispose();
                }
                case 2 -> {
                    jifRegistrarArete registrarArete = new jifRegistrarArete();
                    CtrlArete ctrlArete = new CtrlArete(registrarArete, aretes,entradaAux);
                    ctrlArete.iniciar();
                    vista.dispose();
                }
                case 3 -> {
                    jifRegistrarCollar registrarCollar = new jifRegistrarCollar();
                    CtrlCollar ctrlCollar = new CtrlCollar(registrarCollar, collares,entradaAux);
                    ctrlCollar.iniciar();
                    vista.dispose();
                }
                default -> {
                }
            
            }
           
            }
        }
            
  
    }

    void iniciar() {
        jdpEscritorio.add(vista);
        vista.show();
    }
    
}
