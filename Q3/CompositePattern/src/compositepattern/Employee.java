/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ermias
 */
public class Employee {
    public String name;
    public String department;
    public int salary;
    public List<Employee> subordinate = new ArrayList<Employee>();
    
    Employee(String name, String dep, int salary){
        this.name = name;
        this.department = dep;
        this.salary = salary;
    }
    
    public void Add(Employee employee){
        this.subordinate.add(employee);
    }
    
    public void remove(Employee employee){
        subordinate.remove(employee);
    }
    
    public List<Employee> getSubordinates(){
        return this.subordinate;
    }
    

}
