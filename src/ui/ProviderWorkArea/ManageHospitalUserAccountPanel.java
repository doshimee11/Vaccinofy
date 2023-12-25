/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProviderWorkArea;

import Business.Employee.Employee;
import Business.Enterprise.ProviderEnterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalindjoshi
 */

public class ManageHospitalUserAccountPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ManageHospitalUserAccountJPanel
     */
    
    private JPanel userProcessContainer;
    private ProviderEnterprise providerEnterprise;
    
    public ManageHospitalUserAccountPanel(JPanel userProcessContainer, ProviderEnterprise providerEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.providerEnterprise = providerEnterprise;
        
        popOrganizationComboBox();
        popData();
    }
    
    public void popOrganizationComboBox() {
        organizationComboBox.removeAllItems();
        for (Organization organization : providerEnterprise.getOrganizationDirectory().getOrganizationDirectory()) {
            organizationComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeComboBox.removeAllItems();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeDirectory()){
            if(employee.getCheck().equalsIgnoreCase("Hospital"))
                employeeComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            if(role.toString().contains("Hospital"))
                roleComboBox.addItem(role);
        }
    }
    
    public void popData() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        
        for (Organization organization : providerEnterprise.getOrganizationDirectory().getOrganizationDirectory()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountDirectory()) {
                if(ua.getEmployee().getCheck().equalsIgnoreCase("Hospital")){
                    Object row[] = new Object[3];
                    row[0] = ua;
                    row[1] = ua.getRole();
                    row[2] = ua.getEmployee().getHospital();

                    ((DefaultTableModel) userTable.getModel()).addRow(row);
                }
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        employeeComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        createUserButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Hospital User Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 24, -1, -1));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role", "Hospital"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 71, 540, 179));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Organization :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 283, -1, -1));

        organizationComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 280, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Employee :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 329, -1, -1));

        employeeComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 326, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Role :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 375, -1, -1));

        roleComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 372, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 421, -1, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 418, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 464, -1, -1));

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 464, 190, -1));

        createUserButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createUserButton.setText("Create");
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
            }
        });
        add(createUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 518, 190, 40));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText(" Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 160, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Unknown.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -4, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
        
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserButtonActionPerformed
        
        String userName = nameTextField.getText();
        String password = passwordTextField.getText();
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        Employee employee = (Employee) employeeComboBox.getSelectedItem();
        Role role = (Role) roleComboBox.getSelectedItem();
        organization.getUserAccountDirectory().createNewUserAccount(userName, password, employee, role);
        
        nameTextField.setText(null);
        passwordTextField.setText(null);
        
        popData();
    }//GEN-LAST:event_createUserButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createUserButton;
    private javax.swing.JComboBox employeeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}