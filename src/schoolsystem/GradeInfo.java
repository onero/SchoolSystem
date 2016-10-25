/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

/**
 *
 * @author gta1
 */
public class GradeInfo {
    
    private String subject;
    private int grade;
    
    public GradeInfo(String subject, int grade) {
        this.grade = grade;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }
    
    @Override
    public String toString() {
        return getSubject() + getGrade();
    }
    
}
