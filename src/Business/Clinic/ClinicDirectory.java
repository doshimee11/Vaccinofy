/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Clinic;

import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class ClinicDirectory {
    
    private ArrayList<Clinic> clinicDirectory;
    
    public ClinicDirectory(){
        clinicDirectory = new ArrayList<>();
    }

    public ArrayList<Clinic> getClinicDirectory() {
        return clinicDirectory;
    }
    
    public Clinic createNewClinic(){
        Clinic clinic = new Clinic();
        clinicDirectory.add(clinic);
        return clinic;
    }
    
    public void removeOldClinic(Clinic clinic){
        clinicDirectory.remove(clinic);
    }
    
}
