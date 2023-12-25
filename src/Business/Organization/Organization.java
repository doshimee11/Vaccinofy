/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Inventory.InventoryDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public abstract class Organization {
    
    private String orgnizationName;
    private int organizationID;
    private static int count = 1;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private InventoryDirectory inventoryDirectory;
    
    public enum OrganizationType{
        Admin("Admin Organization"),
        Finance("Finance Organization"),
        Inventory("Inventory Organization"),
        Order("Order Organization");
        
        private String value;
        
        private OrganizationType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public Organization(String organizationName){
        this.orgnizationName = organizationName;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        inventoryDirectory = new InventoryDirectory();
        workQueue = new WorkQueue();
        organizationID = count;
        ++count;
    }

    public String getOrgnizationName() {
        return orgnizationName;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setOrgnizationName(String orgnizationName) {
        this.orgnizationName = orgnizationName;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    @Override
    public String toString() {
        return orgnizationName;
    }
    
}
