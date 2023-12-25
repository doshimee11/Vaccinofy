/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Order.Order;
import Business.Role.DistributorInventoryRole;
import Business.Role.ProviderInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class InventoryOrganization extends Organization {
    
    private InventoryDirectory inventoryDirectory;
    private Order order;
    
    public InventoryOrganization(){
        super(Organization.OrganizationType.Inventory.getValue());
        inventoryDirectory = new InventoryDirectory();
        order = new Order();
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public Order getOrder() {
        return order;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorInventoryRole());
        roles.add(new ProviderInventoryRole());
        return roles;
    }
    
}
