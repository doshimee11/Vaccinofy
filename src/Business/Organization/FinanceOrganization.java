/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DistributorFinanceRole;
import Business.Role.HospitalFinanceRole;
import Business.Role.ManufacturerFinanceRole;
import Business.Role.ProviderFinanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class FinanceOrganization extends Organization {
    
    public FinanceOrganization(){
        super(Organization.OrganizationType.Finance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorFinanceRole());
        roles.add(new ProviderFinanceRole());
        roles.add(new ManufacturerFinanceRole());
        roles.add(new HospitalFinanceRole());
        return roles;
    }
    
}
