/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author meetdoshi
 */

public abstract class Role {
    
    public enum AllRoles{
        DistrubutorAdmin("Distributor Admin"),
        DistributorFinance("Distributor Finance"),
        DistributorInventory("Distributor Inventory"),
        ManufactureAdmin("Manufacture Admin"),
        ManufactureFinance("Manufacture Finance"),
        ManufactureOrder("Manufacture Order"),
        ProviderAdmin("Provider Admin"),
        ProviderFinance("Provider Finance"),
        ProviderInventory("Provider Inventory"),
        ProviderOrder("Provider Order"),
        PublicHealth("Public Health"),
        HospitalAdmin("Hospital Admin"),
        PharmacyAdmin("Pharmacy Admin"),
        HospitalOrder("Hospital Order"),
        PharmacyOrder("Pharmacy Order");
        
        private String value;
        private AllRoles(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system);
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
