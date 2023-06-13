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
import proyectofinalpoe.Modelo.ListaAnillos;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifRegistrarAnillo;

/**
 *
 * @author aleja
 */
public class CtrlAnillo implements ActionListener {

    private jifRegistrarAnillo vista;
    private ListaAnillos anillos;
    private Entrada entrada;
    private int id = 1;
    
    public CtrlAnillo(jifRegistrarAnillo registrarAnillo, ListaAnillos anillos1, Entrada entradaAux) {
        this.vista = registrarAnillo;
        this.anillos = anillos1;
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
                boolean esAjustable = false;
                esAjustable = vista.rbnSi.isSelected();
                
                Anillo aux = new Anillo();
                aux.setId(id);
                aux.setNombre(entrada.getTipoProducto());
                aux.setAjustable(esAjustable);
                aux.setDescripcion(vista.jtaDescripcion.getText());
                aux.setMaterial(vista.jtfMaterial.getText());
                aux.setEstilo(vista.jtfEstilo.getText());
                aux.setPiedra(vista.jtfPiedra.getText());
                aux.setPrecio((entrada.getCostoCompra()/entrada.getNumProductos())*1.3);
                aux.setStock(entrada.getNumProductos());
                aux.setTamano(Integer.parseInt(vista.jtfTamano.getText()));
                id++;
                anillos.agregar(aux);
                JOptionPane.showMessageDialog(vista, "Guardado con exito " + aux.getMaterial(), "Completado",JOptionPane.INFORMATION_MESSAGE);

            }
            
            
        }else if(e.getSource() == vista.jbnRegresar){
            
            vista.dispose();
        }
        
    }
    
    public void iniciar(){
        jdpEscritorio.add(vista);
        vista.show();
    }
    
}
