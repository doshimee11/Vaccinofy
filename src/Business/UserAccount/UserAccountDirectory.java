/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kalindjoshi
 */

public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;
    
    public UserAccountDirectory(){
        userAccountDirectory = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public UserAccount authenticateUserAccount(String userAccUserName, String userAccPassword){
        for(UserAccount userAccount : userAccountDirectory){
            if(userAccount.getUserAccUserName().equalsIgnoreCase(userAccUserName) && userAccount.getUserAccPassword().equals(userAccPassword)){
                return userAccount;
            }
        }
        return null;
    }
    
    public UserAccount createNewUserAccount(String userAccUserName, String userAccPassword, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserAccUserName(userAccUserName);
        userAccount.setUserAccPassword(userAccPassword);
        userAccount.setEmployee(employee);
        userAccount.setRole(role); 
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String userAccUserName){
        for (UserAccount ua : userAccountDirectory){
            if (ua.getUserAccUserName().equals(userAccUserName)){
                return false;
            }
        }
        return true;
    }
    
}
