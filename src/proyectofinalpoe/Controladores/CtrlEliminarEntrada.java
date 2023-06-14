
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaEntradas;
import proyectofinalpoe.Modelo.ListaProducto;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifEliminarEntrada;
import proyectofinalpoe.Vistas.jifEliminarProducto;


public class CtrlEliminarEntrada implements ActionListener{
    
    private jifEliminarEntrada vista;
    private frmMenuPrincipal menu;
    private ListaEntradas lista;
    
    public CtrlEliminarEntrada(ListaEntradas listaEntradas, jifEliminarEntrada vistaEliminarEntrada ){
        this.vista = vistaEliminarEntrada;
        this.lista = listaEntradas;
        this.vista.jbnEliminarEntrada.addActionListener(this);
        this.vista.jbnCancelar.addActionListener(this);
       
    }
    public void iniciar(){
        jdpEscritorio.add(vista);
        vista.show();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jbnEliminarEntrada) {
            String fecha = vista.jtfFechaEntrada.getText();
            Entrada aux = new Entrada();
            
            if(vista.jtfFechaEntrada.getText().isEmpty()){
                JOptionPane.showMessageDialog(vista,"Ingresa la fecha");
            }
            else{
                //Castear Objeto Producto y Anillo
                boolean eliminado = lista.eliminarLista(fecha);
                if(eliminado == false){
                    JOptionPane.showMessageDialog(menu,"No se encontro la entrada");
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
