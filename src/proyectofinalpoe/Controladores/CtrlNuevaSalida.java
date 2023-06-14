/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.ListaSalidas;
import proyectofinalpoe.Modelo.Salida;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifNuevaSalida;

/**
 *
 * @author aleja
 */
public class CtrlNuevaSalida implements ActionListener{
    
    private CtrlMenu menu;
    private jifNuevaSalida vista;
    private ListaSalidas listaSalidas;
    
    public CtrlNuevaSalida(CtrlMenu menu, jifNuevaSalida vista, ListaSalidas listaSalidas) {
        this.menu = menu;
        this.vista = vista;
        this.listaSalidas = listaSalidas;
        this.vista.jbnRegresar.addActionListener(this);
        this.vista.jbnGuardar.addActionListener(this);
        
        
    }
    void iniciar() {
        jdpEscritorio.add(vista);
        vista.show();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        Salida salidaAux = new Salida();
        if(e.getSource() == vista.jbnRegresar){
            vista.dispose();
        }else if(e.getSource() == vista.jbnGuardar){
             boolean estanVacios = vista.jtfCantProductos.getText().isEmpty() || vista.jtfCantProductos.getText().isEmpty()
                    || vista.jtfCliente.getText().isEmpty() 
                    || vista.jcbMeses.getSelectedIndex() == 0
                    || vista.jcbAnio.getSelectedIndex() == 0
                    || vista.jcbDias.getSelectedIndex() == 0;
            String fecha;
            //Validar que no haya campos vacios
            if(estanVacios){
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                fecha = String.valueOf(vista.jcbDias.getSelectedItem())+ "/" + String.valueOf(vista.jcbMeses.getSelectedItem()) + "/" + String.valueOf(vista.jcbAnio.getSelectedItem());
                salidaAux.setCostoVenta(Double.parseDouble(vista.jtfCostoVenta.getText()));
                salidaAux.setFecha(fecha);
                salidaAux.setNumProductos(Integer.parseInt(vista.jtfCantProductos.getText()));
                salidaAux.setCliente(vista.jtfCliente.getText());
                salidaAux.setTipoProducto(String.valueOf(vista.jcbTipoProducto.getSelectedItem()));
                
                listaSalidas.agregar(salidaAux);
                JOptionPane.showMessageDialog(vista, "Guardado con exito", "Completado",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    
    }

    
    
    
}
