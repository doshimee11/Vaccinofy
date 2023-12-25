/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.ManufacturerAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class VaccineManufacturerEnterprise extends Enterprise {
    
    public VaccineManufacturerEnterprise(String name){
        super(name, EnterpriseType.VaccineManufactures);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufacturerAdminRole());
        return roles;
    }
    
}
