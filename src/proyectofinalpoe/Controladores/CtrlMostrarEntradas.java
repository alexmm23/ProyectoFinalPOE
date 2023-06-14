/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaEntradas;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Modelo.Producto;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifMostrarEntradas;

/**
 *
 * @author aleja
 */
public class CtrlMostrarEntradas implements ActionListener{
    private jifMostrarEntradas vista;
    private CtrlMenu menu;
    private ListaEntradas listaEntradas;
    
    public CtrlMostrarEntradas(ListaEntradas listaEntradas, jifMostrarEntradas vistaMostrarEntradas) {
        this.listaEntradas = listaEntradas;
        this.vista = vistaMostrarEntradas;
        this.vista.jbnAtras.addActionListener(this);
        
        
        if (listaEntradas.estaVacia()){
           JOptionPane.showMessageDialog(vista, "La lista está vacía","Advertencia",JOptionPane.WARNING_MESSAGE);
        }else{
            Entrada[] arregloNodos = new Entrada[listaEntradas.getCantNodos()];
            arregloNodos = listaEntradas.imprimir();
            DefaultTableModel modelo = new DefaultTableModel(){
            @Override
                public boolean isCellEditable(int row, int column){
                return false;
                }
            };
            
            
            String[] cabecera = {"Fecha" ,"Proveedor", "Num Productos", "Costo Compra", "Tipo Producto"};
            modelo.setColumnIdentifiers(cabecera);
            Object[] datos = new Object[5];
            
            for(int i =0; i<arregloNodos.length; i++){
                datos[0] = arregloNodos[i].getFecha();
                datos[1] = arregloNodos[i].getProveedor();
                datos[2] = arregloNodos[i].getNumProductos();
                datos[3] = arregloNodos[i].getCostoCompra();
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
