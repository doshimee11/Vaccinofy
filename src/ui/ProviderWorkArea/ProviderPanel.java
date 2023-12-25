/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProviderWorkArea;

import Business.Enterprise.ProviderEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kalindjoshi
 */

public class ProviderPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ProviderWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private ProviderEnterprise providerEnterprise;
    
    public ProviderPanel(JPanel userProcessContainer, ProviderEnterprise providerEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
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
        manageOrganizationButton = new javax.swing.JButton();
        manageHospitalButton = new javax.swing.JButton();
        managePharmacyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Provider Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 30, -1, -1));

        manageOrganizationButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageOrganizationButton.setText("Manage Organization ");
        manageOrganizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 138, 240, 50));

        manageHospitalButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageHospitalButton.setText("Manage Hospital ");
        manageHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalButtonActionPerformed(evt);
            }
        });
        add(manageHospitalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 240, 50));

        managePharmacyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePharmacyButton.setText("Manage Pharmacy ");
        managePharmacyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmacyButtonActionPerformed(evt);
            }
        });
        add(managePharmacyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 298, 240, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BluePlain-4.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 3, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationButtonActionPerformed
        
        ManageOrganizationPanel manageOrganizationPanel = new ManageOrganizationPanel(userProcessContainer, providerEnterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageOrganizationPanel",manageOrganizationPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageOrganizationButtonActionPerformed

    private void manageHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalButtonActionPerformed
        
        ManageHospitalPanel manageHospitalPanel = new ManageHospitalPanel(userProcessContainer, providerEnterprise);
        userProcessContainer.add("ManageHospitalPanel",manageHospitalPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageHospitalButtonActionPerformed

    private void managePharmacyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmacyButtonActionPerformed
        
        ManagePharmacyPanel managePharmacyPanel = new ManagePharmacyPanel(userProcessContainer, providerEnterprise);
        userProcessContainer.add("ManagePharmacyPanel",managePharmacyPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_managePharmacyButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageHospitalButton;
    private javax.swing.JButton manageOrganizationButton;
    private javax.swing.JButton managePharmacyButton;
    // End of variables declaration//GEN-END:variables
}
