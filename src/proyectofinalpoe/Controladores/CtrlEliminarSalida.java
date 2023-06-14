
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.ListaSalidas;
import proyectofinalpoe.Modelo.Salida;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifBuscarSalida;
import proyectofinalpoe.Vistas.jifEliminarSalida;

public class CtrlEliminarSalida implements ActionListener{
    
    private jifEliminarSalida vista;
    private frmMenuPrincipal menu;
    private ListaSalidas lista;
    
    public  CtrlEliminarSalida(ListaSalidas listaSalidas, jifEliminarSalida vistaEliminarSalida) {
        this.vista = vistaEliminarSalida;
        this.lista = listaSalidas;
        this.vista.jbnEliminarSalida.addActionListener(this);
        this.vista.jbnCancelar.addActionListener(this);
   
    }
    
    void iniciar() {
        jdpEscritorio.add(vista);
        vista.show();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnEliminarSalida) {
            String fecha = vista.jtfFechaSalida.getText();
            Salida aux = new Salida();
            
            if(vista.jtfFechaSalida.getText().isEmpty()){
                JOptionPane.showMessageDialog(vista,"Ingresa la fecha");
            }
            else{
                //Castear Objeto Producto y Anillo
                boolean eliminado = lista.eliminarLista(fecha);
                if(eliminado == false){
                    JOptionPane.showMessageDialog(menu,"No se encontro la entrada");
                }else if ( eliminado == true) {
                   JOptionPane.showMessageDialog(menu, "Se elimino correctamente");
                }
            }
        }
        if(e.getSource() == vista.jbnCancelar) {
            vista.dispose();
        }
     
    
    }
}
