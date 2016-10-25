/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gta1
 */
public class Teacher extends Person{
    
    private List<String> subjects = new ArrayList<>();
    private String initials;
    private double salary;
    
    public Teacher(int id, String name, String email, String initials) {
        super(id, name, email);
        this.initials = initials;
        
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }
    
    public void addSubjects(String subject) {
        subjects.add(subject);
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getEmail() + "\t" + getInitials() + "\t\t" + subjects.get(0);
    }
    
}
