/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DistributorAdminRole;
import Business.Role.HospitalAdminRole;
import Business.Role.ManufacturerAdminRole;
import Business.Role.PharmacyAdminRole;
import Business.Role.ProviderAdminRole;
import Business.Role.PublicHealthAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class AdminOrganization extends Organization {
    
    public AdminOrganization(){
        super(OrganizationType.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorAdminRole());
        roles.add(new ManufacturerAdminRole());
        roles.add(new ProviderAdminRole());
        roles.add(new PublicHealthAdmin());
        roles.add(new HospitalAdminRole());
        roles.add(new PharmacyAdminRole());
        return roles;
    }
    
}
