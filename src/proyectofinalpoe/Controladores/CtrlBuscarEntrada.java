
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Entrada;
import proyectofinalpoe.Modelo.ListaEntradas;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifBuscarEntrada;


public class CtrlBuscarEntrada implements ActionListener {

    private jifBuscarEntrada vista;
    private frmMenuPrincipal menu;
    private ListaEntradas lista;
    
    public CtrlBuscarEntrada(ListaEntradas listaEntradas, jifBuscarEntrada vistaBuscarEntrada ) {
        this.vista = vistaBuscarEntrada;
        this.lista = listaEntradas;
        this.vista.jbnBuscarEntrada.addActionListener(this);
        this.vista.jbnCancelar.addActionListener(this);
    }
    
    
    public void iniciar(){
        jdpEscritorio.add(vista);
        vista.show();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnBuscarEntrada) {
            String fecha = vista.jtfFechaEntrada.getText();
            Entrada aux = new Entrada();
            
            if(vista.jtfFechaEntrada.getText().isEmpty()){
                JOptionPane.showMessageDialog(vista,"Ingresa la fecha");
            }
            else{
                //Castear Objeto Producto y Anillo
                aux = lista.buscar(fecha);
                if(aux == null){
                    JOptionPane.showMessageDialog(menu,"No se encontro la entrada");
                }else {
                    Entrada entrada = aux;
                    JOptionPane.showMessageDialog(menu, "Fecha: " + entrada.getFecha() + "\n" + 
                                                        "Proveedor: " + entrada.getProveedor() + "\n" +
                                                        "Numero de Proveedor: " + entrada.getNumProductos() + "\n" +
                                                        "Costo de compra: $" + entrada.getCostoCompra() + "\n" +
                                                        "Tipo de producto: " + entrada.getTipoProducto() + "\n");
                }
            }
        }
        if(e.getSource() == vista.jbnCancelar) {
            vista.dispose();
        }
    
    }
    
}
