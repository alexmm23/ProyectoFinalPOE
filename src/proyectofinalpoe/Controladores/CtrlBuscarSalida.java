
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.ListaSalidas;
import proyectofinalpoe.Modelo.Salida;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifBuscarSalida;


public class CtrlBuscarSalida implements ActionListener{
    
    private jifBuscarSalida vista;
    private frmMenuPrincipal menu;
    private ListaSalidas lista;
    
    public  CtrlBuscarSalida(ListaSalidas listaSalidas, jifBuscarSalida vistaBuscarSalida) {
        this.vista = vistaBuscarSalida;
        this.lista = listaSalidas;
        this.vista.jbnBuscarSalida.addActionListener(this);
        this.vista.jbnCancelar.addActionListener(this);
   
    }
    
    void iniciar() {
        jdpEscritorio.add(vista);
        vista.show();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnBuscarSalida) {
            String fecha = vista.jtfFechaSalida.getText();
            Salida aux = new Salida();
            
            if(vista.jtfFechaSalida.getText().isEmpty()){
                JOptionPane.showMessageDialog(vista,"Ingresa la fecha");
            }
            else{
                //Castear Objeto Producto y Anillo
                aux = lista.buscar(fecha);
                if(aux == null){
                    JOptionPane.showMessageDialog(menu,"No se encontro la entrada");
                }else {
                    Salida salida = aux;
                    JOptionPane.showMessageDialog(menu, "Fecha: " + salida.getFecha() + "\n" + 
                                                        "Cliente: " + salida.getCliente()+ "\n" +
                                                        "Numero de Productos: " + salida.getNumProductos()+ "\n" +
                                                        "Tipo de Productos: " + salida.getTipoProducto()+ "\n" +
                                                        "Costo de Venta: $" + salida.getCostoVenta()+ "\n");
                }
            }
        }
        if(e.getSource() == vista.jbnCancelar) {
            vista.dispose();
        }
     
    
    }
    
}
