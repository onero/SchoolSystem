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
public class PersonManager {

    private List<Person> persons;
    private List<Integer> ids;

    public PersonManager() {
        persons = new ArrayList<>();
        ids = new ArrayList<>();
    }

    public Person getPerson(int id) {
        return persons.get(id);
    }

    public void addPerson(Person p) {
        if (!ids.contains(p.getId())) {
            persons.add(p);
            ids.add(p.getId());
        } else {
            System.out.println("Sorry " + p.getName() + " another person with the id " + p.getId() + " already exists!");
        }

    }

    public void removePerson(int id) {
        if (ids.contains(id)) {
            persons.remove(ids.indexOf(id));
        } else {
            System.out.println("There is no person with this ID");
        }
    }

    public void getAllPersons() {
        System.out.println("ID" + "\tNAME" + "\t\tEMAIL" + "\t\tINITIALS" + "\tMAIN" + "\t\tEDUCATION" + "\tAVG. GRADE");
        for (Person testPerson : persons) {
            System.out.println(testPerson.toString());
        }
    }

    public List<Student> getAllStudents() {
        List<Student> allStudents = new ArrayList<>();
        for (Person person : persons) {
            if (person.getClass().getSimpleName().equals("Student")) {
                System.out.println(person.toString());
            }
        }
        return allStudents;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> allTeachers = new ArrayList<>();
        for (Person person : persons) {
            if (person.getClass().getSimpleName().equals("Teacher")) {
                System.out.println(person.toString());
            }
        }
        return allTeachers;
    }

    public void operation() {

    }

}
