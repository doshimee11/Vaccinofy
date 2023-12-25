/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vaccine;

/**
 *
 * @author kalindjoshi
 */

public class Vaccine {
    
    private int vaccineID;
    private String vaccineName;
    private int availablity;
    private String diseaseName;
    private String vaccineManufactureDate;
    private String vaccineExpiryDate;
    private float vaccinePrice;
    private int orginalQuantity;
    private static int count = 11;
    
    public Vaccine(){
        vaccineID = count;
        count++;
    }

    public int getVaccineID() {
        return vaccineID;
    }

    public void setVaccineID(int vaccineID) {
        this.vaccineID = vaccineID;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public int getAvailablity() {
        return availablity;
    }

    public void setAvailablity(int availablity) {
        this.availablity = availablity;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getVaccineManufactureDate() {
        return vaccineManufactureDate;
    }

    public void setVaccineManufactureDate(String vaccineManufactureDate) {
        this.vaccineManufactureDate = vaccineManufactureDate;
    }

    public String getVaccineExpiryDate() {
        return vaccineExpiryDate;
    }

    public void setVaccineExpiryDate(String vaccineExpiryDate) {
        this.vaccineExpiryDate = vaccineExpiryDate;
    }

    public float getVaccinePrice() {
        return vaccinePrice;
    }

    public void setVaccinePrice(float vaccinePrice) {
        this.vaccinePrice = vaccinePrice;
    }

    public int getOrginalQuantity() {
        return orginalQuantity;
    }

    public void setOrginalQuantity(int orginalQuantity) {
        this.orginalQuantity = orginalQuantity;
    }
    
    @Override
    public String toString(){
        return vaccineName;
    }
    
}
