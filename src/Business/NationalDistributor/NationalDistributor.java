/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NationalDistributor;

import Business.Enterprise.Enterprise;
import Business.Inventory.InventoryDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class NationalDistributor extends Enterprise {
    
    private InventoryDirectory inventoryDirectory;

    public NationalDistributor() {
        super(null, null);
    }
    
    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
