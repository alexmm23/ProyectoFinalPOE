/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinalpoe.Vistas;

import proyectofinalpoe.Modelo.Usuario;

/**
 *
 * @author aleja
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuPrincipal
     */
    private Usuario usuario;
    public frmMenuPrincipal() {
        initComponents();
        //this.usuario = usuarioActual;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jlbTitulo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnNuevo = new javax.swing.JMenu();
        jmiNuevoUsuario = new javax.swing.JMenuItem();
        jmiNuevaEntrada = new javax.swing.JMenuItem();
        jmiNuevaSalida = new javax.swing.JMenuItem();
        jmnEliminar = new javax.swing.JMenu();
        jmiEliminarUsuario = new javax.swing.JMenuItem();
        jmiEliminarEntrada = new javax.swing.JMenuItem();
        jmiEliminarSalida = new javax.swing.JMenuItem();
        jmnBuscar = new javax.swing.JMenu();
        jmiBuscarProducto = new javax.swing.JMenuItem();
        jmiBuscarEntrada = new javax.swing.JMenuItem();
        jmiBuscarSalida = new javax.swing.JMenuItem();
        jmnMostrar = new javax.swing.JMenu();
        jmiMostrarProductos = new javax.swing.JMenuItem();
        jmiMostrarEntradas = new javax.swing.JMenuItem();
        jmiMostrarSalidas = new javax.swing.JMenuItem();
        jmnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpEscritorio.setBackground(new java.awt.Color(22, 15, 41));

        jlbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("Bienvenido");

        jdpEscritorio.setLayer(jlbTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jlbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(221, 190, 168));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jmnNuevo.setBackground(new java.awt.Color(221, 190, 168));
        jmnNuevo.setText("Nuevo");
        jmnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jmiNuevoUsuario.setBackground(new java.awt.Color(243, 223, 193));
        jmiNuevoUsuario.setText("Usuario");
        jmnNuevo.add(jmiNuevoUsuario);

        jmiNuevaEntrada.setBackground(new java.awt.Color(243, 223, 193));
        jmiNuevaEntrada.setText("Entrada");
        jmnNuevo.add(jmiNuevaEntrada);

        jmiNuevaSalida.setBackground(new java.awt.Color(243, 223, 193));
        jmiNuevaSalida.setText("Salida");
        jmnNuevo.add(jmiNuevaSalida);

        jMenuBar1.add(jmnNuevo);

        jmnEliminar.setBackground(new java.awt.Color(221, 190, 168));
        jmnEliminar.setText("Eliminar");

        jmiEliminarUsuario.setBackground(new java.awt.Color(243, 223, 193));
        jmiEliminarUsuario.setText("Usuario");
        jmnEliminar.add(jmiEliminarUsuario);

        jmiEliminarEntrada.setBackground(new java.awt.Color(243, 223, 193));
        jmiEliminarEntrada.setText("Entrada");
        jmnEliminar.add(jmiEliminarEntrada);

        jmiEliminarSalida.setBackground(new java.awt.Color(243, 223, 193));
        jmiEliminarSalida.setText("Salida");
        jmiEliminarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarSalidaActionPerformed(evt);
            }
        });
        jmnEliminar.add(jmiEliminarSalida);

        jMenuBar1.add(jmnEliminar);

        jmnBuscar.setBackground(new java.awt.Color(221, 190, 168));
        jmnBuscar.setText("Buscar");

        jmiBuscarProducto.setBackground(new java.awt.Color(243, 223, 193));
        jmiBuscarProducto.setText("Producto");
        jmnBuscar.add(jmiBuscarProducto);

        jmiBuscarEntrada.setBackground(new java.awt.Color(243, 223, 193));
        jmiBuscarEntrada.setText("Entrada");
        jmnBuscar.add(jmiBuscarEntrada);

        jmiBuscarSalida.setBackground(new java.awt.Color(243, 223, 193));
        jmiBuscarSalida.setText("Salida");
        jmnBuscar.add(jmiBuscarSalida);

        jMenuBar1.add(jmnBuscar);

        jmnMostrar.setBackground(new java.awt.Color(221, 190, 168));
        jmnMostrar.setText("Mostrar");

        jmiMostrarProductos.setBackground(new java.awt.Color(243, 223, 193));
        jmiMostrarProductos.setText("Productos");
        jmiMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMostrarProductosActionPerformed(evt);
            }
        });
        jmnMostrar.add(jmiMostrarProductos);

        jmiMostrarEntradas.setBackground(new java.awt.Color(243, 223, 193));
        jmiMostrarEntradas.setText("Entradas");
        jmnMostrar.add(jmiMostrarEntradas);

        jmiMostrarSalidas.setBackground(new java.awt.Color(243, 223, 193));
        jmiMostrarSalidas.setText("Salidas");
        jmnMostrar.add(jmiMostrarSalidas);

        jMenuBar1.add(jmnMostrar);

        jmnSalir.setBackground(new java.awt.Color(221, 190, 168));
        jmnSalir.setText("Salir");
        jMenuBar1.add(jmnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiEliminarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiEliminarSalidaActionPerformed

    private void jmiMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMostrarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiMostrarProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane jdpEscritorio;
    public javax.swing.JLabel jlbTitulo;
    public javax.swing.JMenuItem jmiBuscarEntrada;
    public javax.swing.JMenuItem jmiBuscarProducto;
    public javax.swing.JMenuItem jmiBuscarSalida;
    public javax.swing.JMenuItem jmiEliminarEntrada;
    public javax.swing.JMenuItem jmiEliminarSalida;
    public javax.swing.JMenuItem jmiEliminarUsuario;
    public javax.swing.JMenuItem jmiMostrarEntradas;
    public javax.swing.JMenuItem jmiMostrarProductos;
    public javax.swing.JMenuItem jmiMostrarSalidas;
    public javax.swing.JMenuItem jmiNuevaEntrada;
    public javax.swing.JMenuItem jmiNuevaSalida;
    public javax.swing.JMenuItem jmiNuevoUsuario;
    public javax.swing.JMenu jmnBuscar;
    public javax.swing.JMenu jmnEliminar;
    public javax.swing.JMenu jmnMostrar;
    public javax.swing.JMenu jmnNuevo;
    public javax.swing.JMenu jmnSalir;
    // End of variables declaration//GEN-END:variables
}