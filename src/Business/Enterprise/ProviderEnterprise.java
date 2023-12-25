/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Hospital.HospitalDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.ProviderAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class ProviderEnterprise extends Enterprise{
    
    private HospitalDirectory hospitalDirectory;
    private PharmacyDirectory pharmacyDirectory;
    
    public ProviderEnterprise(String name){
        super(name, EnterpriseType.Provider);
        hospitalDirectory = new HospitalDirectory();
        pharmacyDirectory = new PharmacyDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderAdminRole());
        return roles;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }
    
}
    