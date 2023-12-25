/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author kalindjoshi
 */

public class VaccineDirectory {
    
    private ArrayList<Vaccine> vaccineDirectory;
    
    public VaccineDirectory(){
        vaccineDirectory = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineDirectory() {
        return vaccineDirectory;
    }
    
    public Vaccine createNewVaccine(){
        Vaccine vaccine = new Vaccine();
        vaccineDirectory.add(vaccine);
        return vaccine;
    }
    
    public void removeOldVaccine(Vaccine vaccine){
        vaccineDirectory.remove(vaccine);
    }
    
    public Vaccine searchVaccine(int vaccineId){
        for(Vaccine vaccine : vaccineDirectory){
            if(vaccineId == vaccine.getVaccineID()){
                return vaccine;
            }
        }
        return null;
    }
    
}
