/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeDirectory;
    
    public EmployeeDirectory(){
        employeeDirectory = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public Employee createNewEmployee(String employeeName){
        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        employeeDirectory.add(employee);
        return employee;
    }
    
}
