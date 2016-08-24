/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Dao Duc Nha
 * Date 24/8/2016
 * @version 1.0 
 * Class ManageHuman
 */
public class ManageHuman {

    Teacher[] t;
    Student[] s;

    public ManageHuman() {
    }

    public ManageHuman(Teacher[] t, Student[] s) {
        this.t = t;
        this.s = s;
    }

    public Teacher[] getT() {
        return t;
    }

    public void setT(Teacher[] t) {
        this.t = t;
    }

    public Student[] getS() {
        return s;
    }

    public void setS(Student[] s) {
        this.s = s;
    }

    //input info a Teacher and return Teacher
    public Teacher inputInfoTeacher(String name, String dateOfBirth, String address, String phoneNunber) throws IOException, NumberFormatException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input class head: ");
        String classHead = input.readLine();
        System.out.println("Input Rank Salary: ");
        double rankSalary = Double.parseDouble(input.readLine());
        System.out.println("Input allowance: ");
        double allowance = Double.parseDouble(input.readLine());
        Teacher newT = new Teacher(classHead, rankSalary, allowance, name, dateOfBirth, address, phoneNunber);
        return newT;

    }

    //input info a Student and return Student
    public Student inputInfoStudent(String name, String dateOfBirth, String address, String phoneNunber) throws IOException, NumberFormatException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input name class: ");
        String nameClass = input.readLine();
        System.out.println("Input semester I: ");
        double semester1 = Double.parseDouble(input.readLine());
        System.out.println("Input samester II: ");
        double semester2 = Double.parseDouble(input.readLine());
        Student newS = new Student(nameClass, semester1, semester2, name, dateOfBirth, address, phoneNunber);
        return newS;
    }

    //add new Teacher into array Teacher return true if susscess else retuen false
    public boolean addTeacher(Teacher newT) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == null) {
                t[i] = newT;
                return true;
            }
        }
        return false;
    }
    //add new Student into array Student return true if susscess else retuen false
    public boolean addStudent(Student newS) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                s[i] = newS;
                return true;
            }
        }
        return false;
    }

    //check a Teacher Exist true if exist false not exist
    public boolean checkTeacherExist(Teacher tc) {
        for (int i = 0; i < t.length; i++) {
            if (tc.equals(t[i])) {
                return true;
            }
        }
        return false;
    }
    //check a Student Exist true if exist false not exist
    public boolean checkStudentExist(Student st) {
        for (Student s1 : s) {
            if (st.equals(s1)) {
                return true;
            }
        }
        return false;
    }

    //output info array Teacher
    public void outputArrayTeacher() {
        for (int i = 0; i < t.length; i++) {
            if (t[i] != null) {
                System.out.println(t[i].toString());
            }
        }
    }

    //output info array Student
    public void outputArrayStudent() {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                System.out.println(s[i].toString());
            }
        }
    }
}
