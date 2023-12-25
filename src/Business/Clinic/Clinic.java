/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Clinic;

import Business.Patient.PatientDirectory;

/**
 *
 * @author meetdoshi
 */

public class Clinic {
    
    private String clinicName;
    private int clinicID;
    private PatientDirectory patientDirectory;
    private static int count = 1;
    
    public Clinic(){
        clinicID = count;
        ++count;
        patientDirectory = new PatientDirectory();
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public int getClinicID() {
        return clinicID;
    }

    public void setClinicID(int clinicID) {
        this.clinicID = clinicID;
    }
    
    @Override
    public String toString(){
        return clinicName;
    }
    
}
