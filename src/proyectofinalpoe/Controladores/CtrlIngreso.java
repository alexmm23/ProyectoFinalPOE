/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Usuario;
import proyectofinalpoe.Vistas.frmIngresar;
import proyectofinalpoe.Vistas.frmMenuPrincipal;

/**
 *
 * @author aleja
 */
public class CtrlIngreso implements ActionListener {
    private frmIngresar vista;
    private Usuario[] usuarios;

    public CtrlIngreso(frmIngresar vista, Usuario[] usuarios){
        this.vista = vista;
        this.usuarios = usuarios;
        this.vista.jbnIngresar.addActionListener(this);
        this.vista.jbnSalir.addActionListener(this);
        
    }
    public void iniciar(){
        vista.setTitle("Iniciar sesión");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        //Primero validar que botón es el que se está presionando
        //Ingresar o salir
        if(e.getSource() == vista.jbnIngresar){
            String nombreUsuario = vista.jtfUsuario.getText();
            String contrasena = vista.jtfContrasena.getText();
            Usuario usuarioEncontrado = new Usuario();
            boolean usuarioExiste = false;
            
            if(vista.jtfUsuario.getText().isEmpty() || vista.jtfContrasena.getText().isEmpty()){//Validar que no haya campos vacios
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            
            }else{
                //Buscar si el usuario esta en el array
                for (Usuario usuario : usuarios) {
                    if (usuario.getNombre().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                        usuarioExiste = true;
                        usuarioEncontrado = usuario;
                        break;
                    }
                }

                if(usuarioExiste == true){
                    //Pasa el usuario encontrado al frame principal
                    frmMenuPrincipal menu = new frmMenuPrincipal();
                    CtrlMenu ctrlMenu = new CtrlMenu(menu,usuarioEncontrado,usuarios,this);
                    ctrlMenu.iniciar();
                    menu.setVisible(true);
                    vista.dispose();
                }else{
                    //Usuario o contrasena incorrectos
                    JOptionPane.showMessageDialog(vista, "Usuario o contrasena incorrectos", "Advertencia",JOptionPane.WARNING_MESSAGE);
                    this.limpiar();
                }

                
            }
        }else{//Boton salir
            vista.dispose();
        }

        
        
    }
    
    public void limpiar(){
        vista.jtfContrasena.setText(null);
        vista.jtfUsuario.setText(null);

    }
    

}
