
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
            
            if(vista.jtfIdProducto.getText().isEmpty()){
                JOptionPane.showMessageDialog(vista,"Ingresa el id del producto");
            }
            else{
                //Castear Objeto Producto y Anillo
                aux = lista.buscar(id);
                if(aux == null){
                    JOptionPane.showMessageDialog(menu,"No se encontro el producto");
                }else if(aux instanceof Anillo ){
                   Anillo anillo = (Anillo) aux;
                   JOptionPane.showMessageDialog(menu, "ID: " + anillo.getId()+ "\n" +
                                                       "Nombre: " + anillo.getNombre() + "\n" +
                                                       "Precio: " +anillo.getPrecio() + "\n" + 
                                                       "Descripcion: " + anillo.getDescripcion() + "\n" + 
                                                       "Material: " + anillo.getMaterial() + "\n" + 
                                                       "Tamaño: " + anillo.getTamano() + "\n" + 
                                                       "Piedra: " + anillo.getPiedra() + "\n" + 
                                                       "Ajustable: " + anillo.isAjustable() + "\n" + 
                                                       "Estilo: " + anillo.getEstilo() + "n");
               }
                else if(aux instanceof Collar) {
                   Collar collar = (Collar) aux;
                   JOptionPane.showMessageDialog(menu, "ID: " + collar.getId()+ "\n" +
                                                       "Nombre: " + collar.getNombre() + "\n" +
                                                       "Precio: " +collar.getPrecio() + "\n" + 
                                                       "Descripcion: " + collar.getDescripcion() + "\n" + 
                                                       "Longitud: " + collar.getLongitud()+ "\n" + 
                                                       "Material: " + collar.getMaterial()+ "\n" + 
                                                       "Tipo de Gema: " + collar.getTipoGema()+ "\n" + 
                                                       "Cadena: " + collar.getCadena()+ "\n" + 
                                                       "Estilo: " + collar.isEstilo()+ "n");
               }
                else if(aux instanceof Aretes) {
                   Aretes aretes = (Aretes) aux;
                   JOptionPane.showMessageDialog(menu, "ID: " + aretes.getId()+ "\n" +
                                                       "Nombre: " + aretes.getNombre() + "\n" +
                                                       "Precio: " +aretes.getPrecio() + "\n" + 
                                                       "Descripcion: " + aretes.getDescripcion() + "\n" + 
                                                       "Material: " + aretes.getMaterial() + "\n" + 
                                                       "Forma: " + aretes.getForma()+ "\n" + 
                                                       "Cierre: " + aretes.getCierre()+ "\n" + 
                                                       "Color: " + aretes.getColor()+ "\n" + 
                                                       "Tipo Gema: " + aretes.isPiedras() + "\n");
               }
            }
        }
        if(e.getSource() == vista.jbnCancelar) {
            vista.dispose();
        }
    }
    
}
