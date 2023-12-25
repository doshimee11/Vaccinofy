/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author kalindjoshi
 */

public class PharmacyDirectory {
    
    private ArrayList<Pharmacy> pharmacyDirectory;
    
    public PharmacyDirectory(){
        pharmacyDirectory = new ArrayList<>();
    }

    public ArrayList<Pharmacy> getPharmacyDirectory() {
        return pharmacyDirectory;
    }
    
    public Pharmacy createNewPharmacy(){
        Pharmacy pharmacy = new Pharmacy();
        pharmacyDirectory.add(pharmacy);
        return pharmacy;
    }
    
    public void removeOldPharmacy(Pharmacy pharmacy){
        pharmacyDirectory.remove(pharmacy);
    }
    
}
