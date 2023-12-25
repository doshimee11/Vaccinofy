/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationDirectory;
    
    public OrganizationDirectory(){
        organizationDirectory = new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public Organization createNewOrganization(Organization.OrganizationType type){
        Organization organization = null;
        if(type.getValue().equalsIgnoreCase(Organization.OrganizationType.Admin.getValue())){
            organization = new AdminOrganization();
            organizationDirectory.add(organization);
        } else if (type.getValue().equalsIgnoreCase(Organization.OrganizationType.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationDirectory.add(organization);
        } else if(type.getValue().equalsIgnoreCase(Organization.OrganizationType.Inventory.getValue())){
            organization = new InventoryOrganization();
            organizationDirectory.add(organization);
        } else if(type.getValue().equalsIgnoreCase(Organization.OrganizationType.Order.getValue())){
            organization = new OrderOrganization();
            organizationDirectory.add(organization);
        }
        return organization;
    }
    
}
