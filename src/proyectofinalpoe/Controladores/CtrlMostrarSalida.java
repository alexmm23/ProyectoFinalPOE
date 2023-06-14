/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Modelo.ListaSalidas;
import proyectofinalpoe.Modelo.Producto;
import proyectofinalpoe.Modelo.Salida;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifMostrarSalidas;

/**
 *
 * @author aleja
 */
public class CtrlMostrarSalida implements ActionListener {
    private ListaSalidas listaSalidas;
    private jifMostrarSalidas vista;
    
    public CtrlMostrarSalida(ListaSalidas listaSalidas, jifMostrarSalidas vistaMostrarSalidas) {
        this.listaSalidas = listaSalidas;
        this.vista = vistaMostrarSalidas;
        this.vista.jbnAtras.addActionListener(this);
        
        
        if (listaSalidas.estaVacia()){
           JOptionPane.showMessageDialog(vista, "La lista está vacía","Advertencia",JOptionPane.WARNING_MESSAGE);
        }else{
            Salida[] arregloNodos = new Salida[listaSalidas.getCantNodos()];
            arregloNodos = listaSalidas.imprimir();
            DefaultTableModel modelo = new DefaultTableModel(){
            @Override
                public boolean isCellEditable(int row, int column){
                return false;
                }
            };
            
            
            String[] cabecera = {"Fecha" ,"Cliente", "numProducto", "Costo venta", "Tipo Producto"};
            modelo.setColumnIdentifiers(cabecera);
            Object[] datos = new Object[5];
            
            for(int i =0; i<arregloNodos.length; i++){
                datos[0] = arregloNodos[i].getFecha();
                datos[1] = arregloNodos[i].getCliente();
                datos[2] = arregloNodos[i].getNumProductos();
                datos[3] = arregloNodos[i].getCostoVenta();
                datos[4] = arregloNodos[i].getTipoProducto();
                modelo.addRow(datos);
            }
            
            vista.jtListado.setModel(modelo);
        }      
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnAtras){
        vista.dispose();
        }
    
    }
    void iniciar() {
        jdpEscritorio.add(vista);
        vista.show();
    }
    
}
