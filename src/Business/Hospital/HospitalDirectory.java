/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalDirecotry;
    
    public HospitalDirectory(){
        hospitalDirecotry = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDirecotry() {
        return hospitalDirecotry;
    }
    
    public Hospital createNewHospital(){
        Hospital hospital = new Hospital();
        hospitalDirecotry.add(hospital);
        return hospital;
    }
    
    public void removeOldHospital(Hospital hospital){
        hospitalDirecotry.remove(hospital);
    }
    
}
