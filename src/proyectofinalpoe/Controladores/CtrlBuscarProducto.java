
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Anillo;
import proyectofinalpoe.Modelo.Aretes;
import proyectofinalpoe.Modelo.Collar;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Modelo.Producto;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifBuscarProducto;


public class CtrlBuscarProducto implements ActionListener{

    private jifBuscarProducto vista;
    private frmMenuPrincipal menu;
    private Producto productos;
    private Anillo anillo;
    private ListaProducto lista;
    
    public CtrlBuscarProducto(ListaProducto listaProducto, jifBuscarProducto vistaBuscarProducto ){
        this.vista = vistaBuscarProducto;
        this.lista = listaProducto;
        this.vista.jbnBuscarProducto.addActionListener(this);
        this.vista.jbnCancelar.addActionListener(this);
       
    }
    public void iniciar(){
        jdpEscritorio.add(vista);
        vista.show();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jbnBuscarProducto) {
            int id = Integer.parseInt(vista.jtfIdProducto.getText());
            Producto aux = new Producto();
            boolean productoExiste = false;
            
            if(vista.jtfIdProducto.getText().isEmpty()){
                JOptionPane.showMessageDialog(vista,"Ingresa el id del producto");
            }
            else{
                //Castear Objeto Producto y Anillo
               aux = lista.buscar(id);
               if(aux instanceof Anillo ){
                   Anillo anillo = (Anillo) aux;
                   JOptionPane.showMessageDialog(menu, "Anillo:" + anillo.getPiedra());
               }
               if(aux instanceof Collar) {
                   Collar collar = (Collar) aux;
                   JOptionPane.showMessageDialog(menu, "Collar: " + collar.getMaterial());
               }
               if(aux instanceof Aretes) {
                   Aretes aretes = (Aretes) aux;
                   JOptionPane.showMessageDialog(menu, "Aretes: " + aretes.getCierre());
               }
       
            }
        }
        if(e.getSource() == vista.jbnCancelar) {
            vista.dispose();
        }
    }
    
}
