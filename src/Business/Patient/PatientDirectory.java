/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }
    
    public Patient createNewPatient(){
        Patient patient = new Patient();
        patientDirectory.add(patient);
        return patient;
    }
    
    public void removeOldPatient(Patient patient){
        patientDirectory.remove(patient);
    }
    
}
