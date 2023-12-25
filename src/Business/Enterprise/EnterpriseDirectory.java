/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterprisesDirectory;
    
    public EnterpriseDirectory(){
        enterprisesDirectory = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterprisesDirectory() {
        return enterprisesDirectory;
    }
    
    public Enterprise createAndAddEnterprise(String enterpriseName, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Distributor){
            enterprise = new DistributorEnterprise(enterpriseName);
            enterprisesDirectory.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Provider){
            enterprise = new ProviderEnterprise(enterpriseName);
            enterprisesDirectory.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.PublicHealth){
            enterprise = new PublicHealthEnterprise(enterpriseName);
            enterprisesDirectory.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.VaccineManufactures){
            enterprise = new VaccineManufacturerEnterprise(enterpriseName);
            enterprisesDirectory.add(enterprise);
        }
        return enterprise;
    }
    
}
