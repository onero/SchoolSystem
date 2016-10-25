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
public class Student extends Person{
    
    private String education;
    private List<GradeInfo> gradeReport;
    
    public Student(int id, String name, String email, String education) {
        super(id, name, email);
        this.education = education;
        gradeReport = new ArrayList<>();
    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public String getEducation() {
        return education;
    }
    
    public double getAverageGrade() {
        int gradeSum = 0;
        double averageSum = 0;
        for (GradeInfo gradeInfo : gradeReport) {
        gradeSum += gradeInfo.getGrade();
        averageSum = gradeSum / gradeReport.size();
        }
        return averageSum;
    }
    
    public int getGrade(String subject) {
       return gradeReport.indexOf(subject);
    }
    
    public void addGrade(GradeInfo grade) {
        gradeReport.add(grade);
    }
    
    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getEmail() + "\t\t\t\t\t" + getEducation()+ "\t\t" + getAverageGrade();
    }
    
}
