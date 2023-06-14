/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Anillo;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaProducto;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifRegistrarAnillo;

/**
 *
 * @author aleja
 */
public class CtrlAnillo implements ActionListener {

    private CtrlMenu menu;
    private jifRegistrarAnillo vista;
    private ListaProducto listaProductos;
    private Entrada entrada;
    //private int id = 1;
    
    public CtrlAnillo(CtrlMenu menu,jifRegistrarAnillo registrarAnillo, ListaProducto listaProductos, Entrada entradaAux) {
        this.menu = menu;
        this.vista = registrarAnillo;
        this.listaProductos = listaProductos;
        this.entrada = entradaAux;
        this.vista.jbnGuardar.addActionListener(this);
        this.vista.jbnRegresar.addActionListener(this);
    }
   
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnGuardar){
            boolean estanVacios = !(vista.rbnSi.isSelected() || vista.rbnNo.isSelected()) 
                    || vista.jtfMaterial.getText().isEmpty() || vista.jtfEstilo.getText().isEmpty()
                    || vista.jtfPiedra.getText().isEmpty() || vista.jtaDescripcion.getText().isEmpty()
                    || vista.jtaDescripcion.getText().isEmpty();
                
            if(estanVacios){
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                System.out.println(entrada.getCostoCompra());
                double calcularPrecio = (entrada.getCostoCompra()/entrada.getNumProductos())*1.3;
                boolean esAjustable = false;
                esAjustable = vista.rbnSi.isSelected();
                int i = 0;
                while(i < entrada.getNumProductos()){
                    Anillo aux = new Anillo();
                    //aux.setId(id);
                    aux.setNombre(entrada.getTipoProducto());
                    aux.setAjustable(esAjustable);
                    aux.setDescripcion(vista.jtaDescripcion.getText());
                    aux.setMaterial(vista.jtfMaterial.getText());
                    aux.setEstilo(vista.jtfEstilo.getText());
                    aux.setPiedra(vista.jtfPiedra.getText());
                    aux.setPrecio(calcularPrecio);
                    aux.setTamano(Integer.parseInt(vista.jtfTamano.getText()));
                    listaProductos.agregar(aux);
                    i++;
                    
                }

                menu.setListaProductos(listaProductos);
                JOptionPane.showMessageDialog(vista, "Guardado con exito " , "Completado",JOptionPane.INFORMATION_MESSAGE);
                //JOptionPane.showMessageDialog(vista, "Anillo " + listaProductos.lista.getId(), "Completado",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }else if(e.getSource() == vista.jbnRegresar){
            menu.setListaProductos(listaProductos);
            vista.dispose();
        }
        
    }
    
    public void iniciar(){
        jdpEscritorio.add(vista);
        vista.show();
    }
    
}
