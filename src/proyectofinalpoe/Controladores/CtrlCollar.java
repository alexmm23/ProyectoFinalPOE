/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Aretes;
import proyectofinalpoe.Modelo.Collar;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaProducto;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifRegistrarCollar;

/**
 *
 * @author aleja
 */
public class CtrlCollar implements ActionListener{

    jifRegistrarCollar vista;
    ListaProducto listaProductos;
    Entrada entrada;
    CtrlMenu menu;
    
    public CtrlCollar(CtrlMenu menu, jifRegistrarCollar vistaRegistrarCollar, ListaProducto listaProductos, Entrada entradaAux) {
        this.vista = vistaRegistrarCollar;
        this.entrada = entradaAux;
        this.listaProductos = listaProductos;
        this.menu = menu;
        this.vista.jbnGuardar.addActionListener(this);
        this.vista.jbnRegresar.addActionListener(this);
       
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e){
            if(e.getSource() == vista.jbnGuardar){
            boolean estanVacios = (vista.jtfCadena.getText().isEmpty())
                    || vista.jtfMaterial.getText().isEmpty() || vista.jtfTipoGema.getText().isEmpty() || vista.jtfLongitud.getText().isEmpty()
                    || vista.jtaDescripcion.getText().isEmpty();
                
            if(estanVacios){
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                System.out.println(entrada.getCostoCompra());
                double calcularPrecio = (entrada.getCostoCompra()/entrada.getNumProductos())*1.3;
                boolean estilo = true;
                
                int i = 0;
                while(i < entrada.getNumProductos()){
                    Collar aux = new Collar();
                    aux.setNombre(entrada.getTipoProducto());
                    aux.setLongitud(Double.parseDouble(vista.jtfLongitud.getText()));
                    aux.setDescripcion(vista.jtaDescripcion.getText());
                    aux.setMaterial(vista.jtfMaterial.getText());
                    aux.setEstilo(estilo);
                    aux.setPrecio(calcularPrecio);
                    aux.setCadena(vista.jtfCadena.getText());
                    aux.setCadena(vista.jtfTipoGema.getText());
                    listaProductos.agregar(aux);
                    i++;
                    
                }
                    
            
                menu.setListaProductos(listaProductos);
                JOptionPane.showMessageDialog(vista, "Guardado con exito " , "Completado",JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            
        }else if(e.getSource() == vista.jbnRegresar){
            menu.setListaProductos(listaProductos);
            vista.dispose();
        }
    
    }
    void iniciar() {
        jdpEscritorio.add(vista);
        vista.show();
    }
    
    
    
}
