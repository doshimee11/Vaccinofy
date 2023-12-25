/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Inventory;

import Business.Vaccine.Vaccine;

/**
 *
 * @author ADMIN
 */

public class Inventory {
    
    private Vaccine vaccine;
    
    public Inventory(){
        vaccine = new Vaccine();
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    
}
