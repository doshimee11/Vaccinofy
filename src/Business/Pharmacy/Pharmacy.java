/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmacy;

import Business.Patient.PatientDirectory;

/**
 *
 * @author kalindjoshi
 */

public class Pharmacy {
    
    private String pharmacyName;
    private int pharmacyID;
    private static int count = 11;
    private String pharmacyAddress;
    private PatientDirectory patientDirectory;
    private String pharmacyStatus;
    
    public Pharmacy(){
        pharmacyID = count;
        count++;
        patientDirectory = new PatientDirectory();
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public String getPharmacyAddress() {
        return pharmacyAddress;
    }

    public void setPharmacyAddress(String pharmacyAddress) {
        this.pharmacyAddress = pharmacyAddress;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public String getPharmacyStatus() {
        return pharmacyStatus;
    }

    public void setPharmacyStatus(String pharmacyStatus) {
        this.pharmacyStatus = pharmacyStatus;
    }
    
    @Override
    public String toString(){
        return pharmacyName;
    }
    
}
