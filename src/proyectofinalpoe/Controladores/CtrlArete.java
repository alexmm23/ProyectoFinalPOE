/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Aretes;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaProducto;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifRegistrarArete;

/**
 *
 * @author aleja
 */
public class CtrlArete implements ActionListener{
    private ListaProducto listaProductos;
    private Entrada entrada;
    private jifRegistrarArete vista;
    private CtrlMenu menu;

    public CtrlArete(CtrlMenu menu, jifRegistrarArete vistaRegistrarArete, ListaProducto listaProductos, Entrada entradaAux) {
        this.vista = vistaRegistrarArete;
        this.entrada = entradaAux;
        this.menu = menu;
        this.listaProductos = listaProductos;
        this.vista.jbnGuardar.addActionListener(this);
        this.vista.jbnRegresar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource() == vista.jbnGuardar){
            boolean estanVacios = (vista.jtfForma.getText().isEmpty()) || !(vista.rbn1.isSelected() || vista.rbn2.isSelected())
                    || vista.jtfMaterial.getText().isEmpty() || vista.jtfColor.getText().isEmpty()
                    || vista.jtaDescripcion.getText().isEmpty();
                
            if(estanVacios){
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                System.out.println(entrada.getCostoCompra());
                double calcularPrecio = (entrada.getCostoCompra()/entrada.getNumProductos())*1.3;
                boolean tienePiedras = vista.rbn1.isSelected();
                
                int i = 0;
                while(i < entrada.getNumProductos()){
                    Aretes aux = new Aretes();
                    aux.setNombre(entrada.getTipoProducto());
                    aux.setColor(vista.jtfColor.getText());
                    aux.setDescripcion(vista.jtaDescripcion.getText());
                    aux.setMaterial(vista.jtfMaterial.getText());
                    aux.setPiedras(tienePiedras);
                    aux.setPrecio(calcularPrecio);
                    aux.setForma(vista.jtfForma.getText());
                    aux.setCierre(vista.jtfCierre.getText());
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
