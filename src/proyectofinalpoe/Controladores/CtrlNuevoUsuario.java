/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectofinalpoe.Modelo.Usuario;
import proyectofinalpoe.Vistas.frmMenuPrincipal;
import static proyectofinalpoe.Vistas.frmMenuPrincipal.jdpEscritorio;
import proyectofinalpoe.Vistas.jifNuevoUsuario;

/**
 *
 * @author aleja
 */
public class CtrlNuevoUsuario implements ActionListener{

    private jifNuevoUsuario vista;
    private CtrlMenu menu;
    private Usuario[] usuarios;
    private int id;
    
    public CtrlNuevoUsuario(Usuario[] usuarios, jifNuevoUsuario vista, CtrlMenu menu) {
        this.id = 1;
        this.usuarios = usuarios;
        this.vista = vista;
        this.menu = menu;
        this.vista.jbnRegistrar.addActionListener(this);
        this.vista.jbnRegresar.addActionListener(this);
    }
    public void iniciar(){
        jdpEscritorio.add(vista);
        vista.show();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.jbnRegistrar){
            String nombreUsuario = vista.jtfUsuario.getText();
            String contrasena = vista.jtfContrasena.getText();
            
            if(vista.jtfUsuario.getText().isEmpty() || vista.jtfContrasena.getText().isEmpty()){//Validar que no haya campos vacios
                JOptionPane.showMessageDialog(vista, "Debes completar todos los campos", "Advertencia",JOptionPane.WARNING_MESSAGE);
            
            }else{
                if(id> usuarios.length -1){
                    JOptionPane.showMessageDialog(vista, "Ya no hay espacio para mas usuarios, elimina al menos uno primero",
                            "Advertencia",JOptionPane.WARNING_MESSAGE);
                }else{
                    usuarios[id] = new Usuario(id,nombreUsuario,contrasena);
                    menu.actualizarArreglo(usuarios);
                    JOptionPane.showMessageDialog(vista, "Registrado con éxito", "Completado",JOptionPane.INFORMATION_MESSAGE);

                    id++;
                }
            }
        }else{
            menu.actualizarArreglo(usuarios);
            vista.dispose();
        }
    }
    
    
}
