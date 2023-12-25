/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author kalindjoshi
 */

public class UserAccount {
    
    private String userAccUserName;
    private String userAccPassword;
    private Role role;
    private Employee employee;
    private WorkQueue workQueue;
    
    public UserAccount(){
        workQueue = new WorkQueue();
    }

    public String getUserAccUserName() {
        return userAccUserName;
    }

    public void setUserAccUserName(String userAccUserName) {
        this.userAccUserName = userAccUserName;
    }

    public String getUserAccPassword() {
        return userAccPassword;
    }

    public void setUserAccPassword(String userAccPassword) {
        this.userAccPassword = userAccPassword;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return userAccUserName;
    }
    
}
