/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01part02daoducnha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NHA
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

    //String classHead, double rankSalary, double allowance
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

    //String nameClass, double semester1, double semester2
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

    public boolean addTeacher(Teacher newT) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == null) {
                t[i] = newT;
                return true;
            }
        }
        return false;
    }

    public boolean addStudent(Student newS) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                s[i] = newS;
                return true;
            }
        }
        return false;
    }

    public boolean checkTeacherExist(Teacher tc) {
        for (int i = 0; i < t.length; i++) {
            if (tc.equals(t[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkStudentExist(Student st) {
        for (Student s1 : s) {
            if (st.equals(s1)) {
                return true;
            }
        }
        return false;
    }

    public void outputArrayTeacher() {
        for (int i = 0; i < t.length; i++) {
            if (t[i] != null) {
                System.out.println(t[i].toString());
            }
        }
    }

    public void outputArrayStudent() {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                System.out.println(s[i].toString());
            }
        }
    }
}
