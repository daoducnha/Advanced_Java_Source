/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01part02daoducnha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainManageHuman {

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Teacher[] arrTeacher = new Teacher[100];
        Student[] arrStudent = new Student[100];

        ManageHuman mNH = new ManageHuman(arrTeacher, arrStudent);

        int i = 0;
        int j = 0;
        boolean flag = true;
        while (flag == true) {
            System.out.println("Are you want add new Teacher/Student? y/n");
            String choise = input.readLine();
            if (choise.equalsIgnoreCase("n")) {
                flag = false;
            } else if (choise.equalsIgnoreCase("y")) {
                //String name, String dayOfBirth, String address, String phoneNumber
                System.out.println("Input name: ");
                String name = input.readLine();
                System.out.println("Input day of birth: ");
                String dayOfBirth = input.readLine();
                System.out.println("Input address: ");
                String address = input.readLine();
                System.out.println("Input Phone number: ");
                String phoneNumber = input.readLine();

                System.out.println("Do you want to enter teacher(1) or studen(2)");
                int choiseType = Integer.parseInt(input.readLine());
                if (choiseType == 1) {
                    Teacher newT = mNH.inputInfoTeacher(name, dayOfBirth, address, phoneNumber);
                    if (mNH.checkTeacherExist(newT) == true) {
                        System.out.println("Teacher is Exist");
                    } else {
                        mNH.addTeacher(newT);
                        System.out.println("Add a teacher is susscess");
                        System.out.println("List Teacher:===============");
                        mNH.outputArrayTeacher();
                        System.out.println("================");
                    }
                } else if (choiseType == 2) {
                    Student newS = mNH.inputInfoStudent(name, dayOfBirth, address, phoneNumber);
                    if (mNH.checkStudentExist(newS) == true) {
                        System.out.println("Student is Exist");
                    } else {
                        mNH.addStudent(newS);
                        System.out.println("Add a student is susscess");
                        System.out.println("List Student:====================");
                        mNH.outputArrayStudent();
                        System.out.println("================");
                    }
                } else {
                    System.out.println("Choise wrong");
                }
            } else {
                System.out.println("choise wrong!");
            }
        }
    }
}
