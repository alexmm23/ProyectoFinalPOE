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
import proyectofinalpoe.Modelo.Producto;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifMostrarProductos;

/**
 *
 * @author aleja
 */
public class CtrlMostrarProductos implements ActionListener{
    
    private jifMostrarProductos vista;
    private CtrlMenu menu;
    private ListaProducto listaProductos;
    
    
    public CtrlMostrarProductos(ListaProducto listaProductos, jifMostrarProductos vista) {
        this.listaProductos = listaProductos;
        this.vista = vista;
        this.vista.jbnAtras.addActionListener(this);
        
        
        if (listaProductos.estaVacia()){
           JOptionPane.showMessageDialog(vista, "La lista está vacía","Advertencia",JOptionPane.WARNING_MESSAGE);
        }else{
            Producto[] arregloNodos = new Producto[listaProductos.getCantNodos()];
            arregloNodos = listaProductos.imprimir();
            DefaultTableModel modelo = new DefaultTableModel(){
            @Override
                public boolean isCellEditable(int row, int column){
                return false;
                }
            };
            
            
            String[] cabecera = {"ID." ,"Nombre", "Precio", "Descripción"};
            modelo.setColumnIdentifiers(cabecera);
            Object[] datos = new Object[5];
            
            for(int i =0; i<arregloNodos.length; i++){
                datos[0] = arregloNodos[i].getId();
                datos[1] = arregloNodos[i].getNombre();
                datos[2] = arregloNodos[i].getPrecio();
                datos[3] = arregloNodos[i].getDescripcion();
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

