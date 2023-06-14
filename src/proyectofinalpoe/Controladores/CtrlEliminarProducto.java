
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifEliminarProducto;


public class CtrlEliminarProducto implements ActionListener{

    private jifEliminarProducto vista;
    private frmMenuPrincipal menu;
    private ListaProducto lista;
    
    public CtrlEliminarProducto(ListaProducto listaProducto, jifEliminarProducto vistaEliminarProducto ){
        this.vista = vistaEliminarProducto;
        this.lista = listaProducto;
        this.vista.jbnEliminarProducto.addActionListener(this);
        this.vista.jbnCancelar.addActionListener(this);
       
    }
    public void iniciar(){
        jdpEscritorio.add(vista);
        vista.show();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jbnEliminarProducto) {
            int id = Integer.parseInt(vista.jtfEliminarProducto.getText());
            
            if(vista.jtfEliminarProducto.getText().isEmpty()){
                JOptionPane.showMessageDialog(vista,"Ingresa el id del producto");
            }
            else{
                //Castear Objeto Producto y Anillo
                Boolean eliminado = lista.eliminarLista(id);
                if(eliminado == false){
                    JOptionPane.showMessageDialog(menu,"No se encontro el producto");
                }else if(eliminado == true){
                   JOptionPane.showMessageDialog(menu,"Se elimino correctamente");
               }
            }
        }
        if(e.getSource() == vista.jbnCancelar) {
            vista.dispose();
        }
    }
    
}
