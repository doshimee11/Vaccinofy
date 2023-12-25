/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Role.PublicHealthAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class PublicHealthEnterprise extends Enterprise {
    
    public PublicHealthEnterprise(String name){
        super(name, Enterprise.EnterpriseType.PublicHealth);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PublicHealthAdmin());
        return roles;
    }
    
}
