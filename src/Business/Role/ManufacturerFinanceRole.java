/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VaccineManufacturerEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ManufacturerWorkArea.ManufacturerFinancePanel;

/**
 *
 * @author meetdoshi
 */

public class ManufacturerFinanceRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new ManufacturerFinancePanel(userProcessContainer, system, account, (VaccineManufacturerEnterprise)enterprise);
    }
    
}
