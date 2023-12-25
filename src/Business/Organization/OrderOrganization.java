/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HospitalOrderRole;
import Business.Role.PharmacyOrderRole;
import Business.Role.ProviderOrderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class OrderOrganization extends Organization {
    
    public OrderOrganization(){
        super(Organization.OrganizationType.Order.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderOrderRole());
        roles.add(new HospitalOrderRole());
        roles.add(new PharmacyOrderRole());
        return roles;
    }
    
}
