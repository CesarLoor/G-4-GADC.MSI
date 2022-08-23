package espe.edu.ec.CoopLatinaMarco.view;

import espe.edu.ec.CoopLatinaMarco.controller.RoutesController;
import espe.edu.ec.CoopLatinaMarco.model.Connection;
import espe.edu.ec.CoopLatinaMarco.model.Route;
import java.awt.Image;
import java.awt.Toolkit;
<<<<<<< HEAD
import java.util.ArrayList;
=======
import java.util.Set;
>>>>>>> e04ef2aa0f88b76115d1acd6925bb7dcd229fbb5
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class FrmRouteRegister extends javax.swing.JFrame {

    /**
     * Creates new form FrmRoute
     */
    public FrmRouteRegister() {
        initComponents();
        setTitle("Route Register");
        setIconImage(getIconImage());
        lblIdError.setVisible(false);
        lblNameError.setVisible(false);
        lblDistanceError.setVisible(false);
        lblPriceError.setVisible(false);
        setDefaultCloseOperation(0);
<<<<<<< HEAD
=======
        
>>>>>>> e04ef2aa0f88b76115d1acd6925bb7dcd229fbb5
        Connection connection = new Connection();
        connection.connectionDataBase();

    }
    @Override
        public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("pictures/logo.jpeg"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNameRoute = new javax.swing.JTextField();
        txtIdRoute = new javax.swing.JTextField();
        txtDistanceKm = new javax.swing.JTextField();
        txtPriceOfRoute = new javax.swing.JTextField();
        lblNameError = new javax.swing.JLabel();
        lblIdError = new javax.swing.JLabel();
        lblDistanceError = new javax.swing.JLabel();
        lblPriceError = new javax.swing.JLabel();
        cmbAvaibleRoute = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnReturnToMainMenu = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Rutas");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de la ruta");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Id de la ruta");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Distancia (KM)");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Precio de la ruta");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Ruta disponible");

        txtNameRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameRouteActionPerformed(evt);
            }
        });
        txtNameRoute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameRouteKeyPressed(evt);
            }
        });

        txtIdRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRouteActionPerformed(evt);
            }
        });
        txtIdRoute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdRouteKeyPressed(evt);
            }
        });

        txtDistanceKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanceKmActionPerformed(evt);
            }
        });
        txtDistanceKm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDistanceKmKeyPressed(evt);
            }
        });

        txtPriceOfRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceOfRouteActionPerformed(evt);
            }
        });
        txtPriceOfRoute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceOfRouteKeyPressed(evt);
            }
        });

        lblNameError.setForeground(new java.awt.Color(153, 0, 153));
        lblNameError.setText("Nombre no valido!!");

        lblIdError.setForeground(new java.awt.Color(153, 0, 153));
        lblIdError.setText("Sólo digitos");
        lblIdError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblIdErrorKeyPressed(evt);
            }
        });

        lblDistanceError.setForeground(new java.awt.Color(153, 0, 153));
        lblDistanceError.setText("Sólo digitos");

        lblPriceError.setForeground(new java.awt.Color(153, 0, 153));
        lblPriceError.setText("Sólo digitos");

        cmbAvaibleRoute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No disponible" }));
        cmbAvaibleRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAvaibleRouteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbAvaibleRoute, javax.swing.GroupLayout.Alignment.LEADING, 0, 117, Short.MAX_VALUE)
                            .addComponent(txtNameRoute, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdRoute, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDistanceKm, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPriceOfRoute, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdError)
                                    .addComponent(lblDistanceError)
                                    .addComponent(lblPriceError))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNameRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNameError)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIdError)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDistanceKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDistanceError)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPriceOfRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPriceError)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbAvaibleRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnReturnToMainMenu.setText("Volver al menú principal");
        btnReturnToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnToMainMenuActionPerformed(evt);
            }
        });

        btnSearch.setText("Actualizar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(50, 50, 50)
                        .addComponent(btnSearch)
                        .addGap(55, 55, 55)
                        .addComponent(btnDelete)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReturnToMainMenu)
                        .addGap(121, 121, 121))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReturnToMainMenu)
                .addGap(34, 34, 34))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rutas.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceOfRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceOfRouteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceOfRouteActionPerformed

    private void btnReturnToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnToMainMenuActionPerformed
        FrmCoopLatina frmCoopLatina;
        frmCoopLatina = new FrmCoopLatina();
        frmCoopLatina.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_btnReturnToMainMenuActionPerformed

<<<<<<< HEAD
=======
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        

        String nameRoute;
        int idRoute;
        int distanceKm;
        int priceOfRoute;
        boolean avalibleRoute = true;
        
        nameRoute = txtNameRoute.getText();
        idRoute = Integer.parseInt(txtIdRoute.getText());
        distanceKm = Integer.parseInt(txtDistanceKm.getText());
        priceOfRoute = Integer.parseInt(txtPriceOfRoute.getText());
        AvailableRoute(cmbAvaibleRoute.getActionCommand());
        
        Route route = new Route(nameRoute, idRoute, distanceKm, priceOfRoute, avalibleRoute);
        
        RoutesController routesController = new RoutesController(route,"Routes");
        routesController.create();
        
        
        
        
        
        
//        Route route;
//        RoutesController saveRoute;
//        
//        route = new Route();
//        saveRoute = new RoutesController();
//        
//        route.setNameRoute(txtNameRoute.getText());
//        route.setIdRoute(JTValidation(txtIdRoute.getText()));
//        route.setDistanceKm(JTValidation(txtDistanceKm.getText()));
//        route.setPriceOfRoute(JTValidation(txtPriceOfRoute.getText()));
//        route.setAvalibleRoute(AvailableRoute(cmbAvaibleRoute.getSelectedItem().toString()));
//        
//       saveRoute.CreateRoute(route);
//       JOptionPane.showMessageDialog(null, "Route added succesfull");
//       CleanTxtFields();
       
    }//GEN-LAST:event_btnAddActionPerformed

>>>>>>> e04ef2aa0f88b76115d1acd6925bb7dcd229fbb5
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i = JOptionPane.showConfirmDialog(this,"¿Esta segur@ de que quiere eliminar esta ruta?");
        if (i == 0){
            JOptionPane.showMessageDialog(this,"La ruta ha sido eliminada exitosamente");
        } else if (i == 1){
            JOptionPane.showMessageDialog(this,"La ruta no fue removida");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lblIdErrorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIdErrorKeyPressed
        
    }//GEN-LAST:event_lblIdErrorKeyPressed

    private void txtIdRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRouteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRouteActionPerformed

    private void txtIdRouteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdRouteKeyPressed
        String value = txtIdRoute.getText();
        int length = value.length();
        if(evt.getKeyChar()>='0' && evt.getKeyChar() <='9'){
            txtIdRoute.setEditable(true);
            lblIdError.setText("");
            if(length>=10){
            txtIdRoute.setEditable(false);
            lblIdError.setText("Max 9 digits");
            }
        }else{
            lblIdError.setVisible(true);
        }
    }//GEN-LAST:event_txtIdRouteKeyPressed

    private void txtDistanceKmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistanceKmKeyPressed
        String value = txtDistanceKm.getText();
        int length = value.length();
        if(evt.getKeyChar()>='0' && evt.getKeyChar() <='9'){
            txtDistanceKm.setEditable(true);
            lblDistanceError.setText("");
            if(length>=10){
            txtDistanceKm.setEditable(false);
            lblDistanceError.setText("Max 9 digits");
            }
        }else{
            lblDistanceError.setVisible(true);
        }
    }//GEN-LAST:event_txtDistanceKmKeyPressed

    private void txtPriceOfRouteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceOfRouteKeyPressed
        String value = txtPriceOfRoute.getText();
        int length = value.length();
        if(evt.getKeyChar()>='0' && evt.getKeyChar() <='9'){
            txtPriceOfRoute.setEditable(true);
            lblPriceError.setText("");
            if(length>=10){
            txtPriceOfRoute.setEditable(false);
            lblPriceError.setText("Max 9 digits");
            }
        }else{
            lblPriceError.setVisible(true);
        }
    }//GEN-LAST:event_txtPriceOfRouteKeyPressed

    private void txtNameRouteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameRouteKeyPressed
        String name = String.valueOf(evt.getKeyChar());
        if(!name.matches("[0-9]")){
            evt.consume();
            txtNameRoute.setEditable(true);
            lblNameError.setVisible(false);
            
            
        }else{
            txtNameRoute.setEditable(true);
            lblNameError.setVisible(true);
        }
    }//GEN-LAST:event_txtNameRouteKeyPressed

    private void txtNameRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameRouteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameRouteActionPerformed


    private void txtDistanceKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanceKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanceKmActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        JOptionPane.showMessageDialog(null, "The route has been updated");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbAvaibleRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAvaibleRouteActionPerformed
        
    }//GEN-LAST:event_cmbAvaibleRouteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nameRoute;
        int idRoute;
        int distanceKm;
        int priceOfRoute;
        boolean avalibleRoute=true;
        
        nameRoute = txtNameRoute.getText();
        idRoute = Integer.parseInt(txtIdRoute.getText());
        distanceKm = Integer.parseInt(txtDistanceKm.getText());
        priceOfRoute = Integer.parseInt(txtPriceOfRoute.getText());
        AvailableRoute(cmbAvaibleRoute.getActionCommand());
        
        Route route = new Route(nameRoute, idRoute, distanceKm, priceOfRoute, avalibleRoute);
        
        RoutesController routesController = new RoutesController(route,"Routes");
        routesController.create();
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRouteRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRouteRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRouteRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRouteRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRouteRegister().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReturnToMainMenu;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbAvaibleRoute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDistanceError;
    private javax.swing.JLabel lblIdError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPriceError;
    private javax.swing.JTextField txtDistanceKm;
    private javax.swing.JTextField txtIdRoute;
    private javax.swing.JTextField txtNameRoute;
    private javax.swing.JTextField txtPriceOfRoute;
    // End of variables declaration//GEN-END:variables

    public int JTValidation(String Age) {
    
        InputNumbersValidation input;
        input= new InputNumbersValidation();
        int validateInput = 0;
        
        boolean inputJT;
        inputJT= input.ValidationNumbers(Age);
       
        if(inputJT!=false){
            
            validateInput= Integer.parseInt(Age);
                    
        }else{
            JOptionPane.showMessageDialog(null, "Customers must be in number format");
        }
        return validateInput;
        
        
        
    }
    public boolean AvailableRoute(String option){
        
        return option.toLowerCase().equals("yes");
    }
     public void CleanTxtFields(){
    
        txtNameRoute.setText("");
        txtIdRoute.setText("");
        txtDistanceKm.setText("");
        txtPriceOfRoute.setText("");
        
    }
}   
