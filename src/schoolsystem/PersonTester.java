/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

/**
 * Tester class for the SchoolSystem. Will add persons of different types to the
 * List og persons
 *
 * @author Adamino
 */
public class PersonTester extends PersonManager {
//    List<Person> testPersons = new ArrayList();

    public void testPersons() {
        Person hansNielsen = new Person(100, "Hans Nielsen", "hni@easv.dk") {
        };
        Person nielsHansen = new Person(101, "Niels Hansen", "nha@easv.dk") {
        };
        Person ibBoesen = new Person(102, "Ib Boesen", "ibo@easv.dk") {
        };

        Teacher bentPedersen = new Teacher(200, "Bent Pedersen", "bhp@easv", "bp");
        bentPedersen.addSubjects("Programming");
        bentPedersen.addSubjects("System Design");
        Teacher adamHansen = new Teacher(201, "Adam L. Hansen", "alh@easv.dk", "alh");
        adamHansen.addSubjects("Programming");

        Student boIpsen = new Student(0, "Bo Ipsen", "bo@easv.dk", "CS");
        GradeInfo grade = new GradeInfo("Programming", 8);
        boIpsen.addGrade(grade);
        GradeInfo grade2 = new GradeInfo("Programming", 10);
        boIpsen.addGrade(grade2);

        //Test for failure
        Person failureJensen = new Person(101, "Failure Jensen", "failure@jensen.dk") {
        };

//        testPersons.add(hansNielsen);
//        testPersons.add(nielsHansen);
//        testPersons.add(ibBoesen);
//        testPersons.add(bentPedersen);
//        testPersons.add(adamHansen);
//        testPersons.add(boIpsen);
        addPerson(hansNielsen);
        addPerson(nielsHansen);
        addPerson(ibBoesen);
        addPerson(bentPedersen);
        addPerson(adamHansen);
        addPerson(boIpsen);
        addPerson(failureJensen);
        removePerson(101);

        getAllPersons();

    }

}
