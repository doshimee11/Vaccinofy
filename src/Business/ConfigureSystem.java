/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Inventory.Inventory;
import Business.Network.Network;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.Role.NationalDistributorAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;

/**
 *
 * @author meetdoshi
 */

public class ConfigureSystem {
    
    public static Ecosystem configureEcoSystem(){
        Ecosystem system = Ecosystem.getInstance();
        
        Network network = system.createNetwork("Boston");
        system.createNetwork("Chicago");
        Employee employee = system.getEmployeeDirectory().createNewEmployee("CDC");
        UserAccount userAccount = system.getUserAccountDirectory().createNewUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee employee1 = system.getEmployeeDirectory().createNewEmployee("NationalDistributor");
        system.getUserAccountDirectory().createNewUserAccount("national", "national", employee1, new NationalDistributorAdminRole());
        
        Vaccine vaccine = system.getVaccineDirectory().createNewVaccine();
        vaccine.setVaccineName("Influenza");
        vaccine.setDiseaseName("Flu");
        
        Vaccine vaccine1 = system.getVaccineDirectory().createNewVaccine();
        vaccine1.setVaccineName("MMR");
        vaccine1.setDiseaseName("Mumps");
        
        DistributorEnterprise distributorEnterprise = (DistributorEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("Distributor", Enterprise.EnterpriseType.Distributor);
        InventoryOrganization organization = (InventoryOrganization)distributorEnterprise.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Inventory);
        Inventory inventory2 = organization.getInventoryDirectory().createNewInventory(vaccine);
        
        if (inventory2.getVaccine().getVaccineID() == vaccine.getVaccineID()) {
            inventory2.getVaccine().setVaccinePrice(10);
            inventory2.getVaccine().setVaccineManufactureDate("30-May-2022");
            inventory2.getVaccine().setVaccineExpiryDate("12-May-2024");
            inventory2.getVaccine().setAvailablity(20);
        }
        
        Inventory inventory3 = organization.getInventoryDirectory().createNewInventory(vaccine1);
        if (inventory3.getVaccine().getVaccineID() == vaccine1.getVaccineID()) {
            inventory3.getVaccine().setVaccinePrice(10);
            inventory3.getVaccine().setVaccineManufactureDate("12-May-2022");
            inventory3.getVaccine().setVaccineExpiryDate("12-May-2024");
            inventory3.getVaccine().setAvailablity(20);
        }
        return system;
    }
    
}
