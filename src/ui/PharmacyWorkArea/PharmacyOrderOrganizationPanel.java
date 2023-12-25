/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PharmacyWorkArea;

import Business.Ecosystem;
import Business.Enterprise.ProviderEnterprise;
import Business.Organization.OrderOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.HospitalWorkArea.OrderVaccinePanel;

/**
 *
 * @author kalindjoshi
 */

public class PharmacyOrderOrganizationPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form PharmacyOrderOrganization
     */
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    private UserAccount userAccount;
    private OrderOrganization orderOrganization;
    private ProviderEnterprise providerEnterprise;
    
    public PharmacyOrderOrganizationPanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, OrderOrganization orderOrganization, ProviderEnterprise providerEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.orderOrganization = orderOrganization;
        this.providerEnterprise = providerEnterprise;
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
        orderVaccineButton = new javax.swing.JButton();
        viewOrderHistoryButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pharmacy Order Organization ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 21, -1, -1));

        orderVaccineButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderVaccineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OrderVacccine.jpg"))); // NOI18N
        orderVaccineButton.setText("Order Vaccine");
        orderVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderVaccineButtonActionPerformed(evt);
            }
        });
        add(orderVaccineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 122, 260, 60));

        viewOrderHistoryButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewOrderHistoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Order History Icon.jpg"))); // NOI18N
        viewOrderHistoryButton.setText("View Order History ");
        viewOrderHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderHistoryButtonActionPerformed(evt);
            }
        });
        add(viewOrderHistoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 260, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/high-angle-view-white-blue-candy-capsules-green-background_23-2147877557.jpg-2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1220, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void orderVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderVaccineButtonActionPerformed
        try{
            if(userAccount.getEmployee().getPharmacy().getPharmacyStatus().equalsIgnoreCase("Approved")){
                OrderVaccinePanel orderVaccinePanel = new OrderVaccinePanel(userProcessContainer, system, userAccount, orderOrganization, providerEnterprise);
                userProcessContainer.add("OrderVaccinePanel",orderVaccinePanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else if(userAccount.getEmployee().getPharmacy().getPharmacyStatus().equalsIgnoreCase("Rejected")){
                JOptionPane.showMessageDialog(null, "This pharmacy registration has been rejected by Health Dept", "Pharmacy Rejected", JOptionPane.ERROR_MESSAGE);
            }
            else if(userAccount.getEmployee().getPharmacy().getPharmacyStatus().equalsIgnoreCase("Processing")){
                JOptionPane.showMessageDialog(null, "This pharmacy registration request is pending with Health Dept", "Pharmacy Registration Pending", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Send a pharmacy registration request to Health Department", "Pharmacy Registration Not Initialized", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_orderVaccineButtonActionPerformed

    private void viewOrderHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderHistoryButtonActionPerformed
        try{
            ViewPharmacyOrderHistoryPanel pharmacyOrderHistory = new ViewPharmacyOrderHistoryPanel(userProcessContainer, userAccount);
            userProcessContainer.add("ViewPharmacyOrderHistoryPanel", pharmacyOrderHistory);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_viewOrderHistoryButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orderVaccineButton;
    private javax.swing.JButton viewOrderHistoryButton;
    // End of variables declaration//GEN-END:variables
}
