/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author hayam tarek
 */
public class Student {

    private String name;
    private int age;
    private String track;
    private String id;
    private double gpa;

    public Student(String name, int age, String track, String id, double gpa) {
        this.name = name;
        this.age = age;
        this.track = track;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 17 && age <= 60) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Illegal age");
        }
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa > 0 && gpa < 5) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("Illegal gpa");
        }
    }

    public void printStudentInfo() {
        System.out.println("Student Info:");
        System.out.println("---------------------");
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tTrack: " + track);
        System.out.println("\tID: " + id);
        System.out.println("\tGPA: " + gpa);
        System.out.println("---------------------");
    }
}
