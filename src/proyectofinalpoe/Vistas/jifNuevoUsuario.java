/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectofinalpoe.Vistas;

/**
 *
 * @author aleja
 */
public class jifNuevoUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifNuevoUsuario
     */
    public jifNuevoUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbnRegistrar = new javax.swing.JButton();
        jbnRegresar = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();
        jtfContrasena = new javax.swing.JTextField();
        jlbUsuario = new javax.swing.JLabel();
        jlbContrasena = new javax.swing.JLabel();

        setBackground(new java.awt.Color(22, 15, 41));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agregar Usuario");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Usuario");

        jbnRegistrar.setText("Registrar");

        jbnRegresar.setText("Regresar");

        jlbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlbUsuario.setText("Usuario");

        jlbContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jlbContrasena.setText("Contrasena");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jbnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jbnRegistrar)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbContrasena)
                    .addComponent(jlbUsuario)
                    .addComponent(jtfUsuario)
                    .addComponent(jtfContrasena)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jlbUsuario)
                .addGap(2, 2, 2)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnRegresar)
                    .addComponent(jbnRegistrar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton jbnRegistrar;
    public javax.swing.JButton jbnRegresar;
    private javax.swing.JLabel jlbContrasena;
    private javax.swing.JLabel jlbUsuario;
    public javax.swing.JTextField jtfContrasena;
    public javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
