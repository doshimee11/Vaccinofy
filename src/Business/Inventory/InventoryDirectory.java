/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Inventory;

import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class InventoryDirectory {
    
    private ArrayList<Inventory> inventoryDirectory;
    
    public InventoryDirectory(){
        inventoryDirectory = new ArrayList<>();
    }

    public ArrayList<Inventory> getInventoryDirectory() {
        return inventoryDirectory;
    }
    
    public Inventory createNewInventory(Vaccine vaccine){
        Inventory inventory = new Inventory();
        inventoryDirectory.add(inventory);
        inventory.setVaccine(vaccine);
        return inventory;
    }
    
    public void removeOldInventory(Inventory inventory){
        inventoryDirectory.remove(inventory);
    }
    
}
