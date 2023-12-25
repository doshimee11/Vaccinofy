/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Role.DistributorAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class DistributorEnterprise extends Enterprise{
    
    public DistributorEnterprise(String name){
        super(name, EnterpriseType.Distributor);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorAdminRole());
        return roles;
    }
    
}
