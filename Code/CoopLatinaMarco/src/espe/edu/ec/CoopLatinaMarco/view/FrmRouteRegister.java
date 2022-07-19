package espe.edu.ec.CoopLatinaMarco.view;

import espe.edu.ec.CoopLatinaMarco.controller.RoutesController;
import espe.edu.ec.CoopLatinaMarco.model.Route;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

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
        txtAvaibleRoute = new javax.swing.JTextField();
        lblNameError = new javax.swing.JLabel();
        lblIdError = new javax.swing.JLabel();
        lblDistanceError = new javax.swing.JLabel();
        lblPriceError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnReturnToMainMenu = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Routes");

        jLabel2.setText("Name Route");

        jLabel3.setText("ID Route");

        jLabel4.setText("Distance KM");

        jLabel5.setText("Price of Route");

        jLabel6.setText("Avaible Route");

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

        lblNameError.setForeground(new java.awt.Color(204, 0, 0));
        lblNameError.setText("Name not valid!!");

        lblIdError.setForeground(new java.awt.Color(204, 0, 0));
        lblIdError.setText("Pls only digits");
        lblIdError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblIdErrorKeyPressed(evt);
            }
        });

        lblDistanceError.setForeground(new java.awt.Color(204, 0, 0));
        lblDistanceError.setText("Pls only digits");

        lblPriceError.setForeground(new java.awt.Color(204, 0, 0));
        lblPriceError.setText("Pls only digits");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameRoute, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtIdRoute)
                            .addComponent(txtDistanceKm)
                            .addComponent(txtPriceOfRoute)
                            .addComponent(txtAvaibleRoute))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNameError)
                            .addComponent(lblIdError)
                            .addComponent(lblDistanceError)
                            .addComponent(lblPriceError))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAvaibleRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReturnToMainMenu.setText("Return to main menu");
        btnReturnToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnToMainMenuActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");

        btnTable.setText("Table");
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnReturnToMainMenu)
                        .addGap(40, 40, 40)
                        .addComponent(btnTable))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnToMainMenu)
                    .addComponent(btnTable))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Route route;
        RoutesController saveRoutes;

        route = new Route();
        saveRoutes = new RoutesController();
       

        route.setNameRoute(txtNameRoute.getText());
        route.setIdRoute(JTValidation(txtIdRoute.getText()));
        route.setDistanceKm(JTValidation(txtDistanceKm.getText()));
        route.setPriceOfRoute(JTValidation(txtPriceOfRoute.getText()));
        //route.setAvalibleRoute(txtAvaibleRoute.getText());
        
        saveRoutes.CreateRoute(route);
        JOptionPane.showMessageDialog(null, "Route add succesfull");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
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
            lblNameError.setVisible(false);
        }else{
            lblNameError.setVisible(true);
        }
    }//GEN-LAST:event_txtNameRouteKeyPressed

    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
        FrmRoutes frmRoutes;
        frmRoutes = new FrmRoutes();
        frmRoutes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTableActionPerformed

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
    private javax.swing.JButton btnTable;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDistanceError;
    private javax.swing.JLabel lblIdError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPriceError;
    private javax.swing.JTextField txtAvaibleRoute;
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
            JOptionPane.showMessageDialog(null, "La ruta o distancia debe ser un numero");
        }
        return validateInput;
        
        
        
    }
}
