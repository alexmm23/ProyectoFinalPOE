/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.ListaAnillos;
import proyectofinalpoe.Modelo.ListaAretes;
import proyectofinalpoe.Modelo.ListaCollares;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifNuevaEntrada;
import proyectofinalpoe.Vistas.jifRegistrarAnillo;
import proyectofinalpoe.Vistas.jifRegistrarArete;

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
    
    public CtrlNuevaEntrada(CtrlMenu menu, jifNuevaEntrada vista){
        this.menu = menu;
        this.vista = vista;
        this.anillos = menu.getAnillos();
        this.aretes = menu.getAretes();
        this.collares = menu.getCollares();
        this.vista.jbnRegresar.addActionListener(this);
        this.vista.jbnSiguiente.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnRegresar){
            
            menu.setAnillos(anillos);
            menu.setAretes(aretes);
            menu.setCollares(collares);
            
            vista.dispose();
            
        }else if(e.getSource() == vista.jbnSiguiente){
            boolean estanVacios = vista.jtfCantProductos.getText().isEmpty() || vista.jtfCantProductos.getText().isEmpty()
                    || vista.jtfProveedor.getText().isEmpty() 
                    || vista.jcbMeses.getSelectedIndex() == 0;
            if(estanVacios){//Validar que no haya campos vacios
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }else
            switch (vista.jcbTipoProducto.getSelectedIndex()) {
                case 1 -> {
                    jifRegistrarAnillo registrarAnillo = new jifRegistrarAnillo();
                    CtrlAnillo ctrlAnillo = new CtrlAnillo(registrarAnillo, anillos);
                    ctrlAnillo.iniciar();
                    vista.dispose();
                }
                case 2 -> {
                    jifRegistrarArete registrarArete = new jifRegistrarArete();
                    CtrlArete ctrlArete = new CtrlArete(registrarArete, aretes);
                    ctrlArete.iniciar();
                    vista.dispose();
                }
                case 3 -> {
                }
                default -> {
                }
            }
        
        }
            
  
    }

    void iniciar() {
        jdpEscritorio.add(vista);
        vista.show();
    }
    
}
