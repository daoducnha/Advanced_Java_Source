/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0 Date 9/7/2016 Class MainManageStudent to view list student, add, remove a student
 * new student, search student, remove student
 */
public class MainManageStudent {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Student> mapStudent = new TreeMap();

        boolean flag = true;
        while (flag == true) {
            System.out.println("1. View all Student");
            System.out.println("2. Add new Student");
            System.out.println("3. Search a Student by ID");
            System.out.println("4. Remove a Student");
            System.out.println("5. Exit");

            System.out.println("Please input your choise: ");
            int choise = Integer.parseInt(input.readLine());

            if (choise == 1) {
                for (Object key : mapStudent.keySet()) {
                    Student values = (Student) mapStudent.get(key);
                    System.out.println("ID: " + key + " - " + values.toString());

                }
            } else if (choise == 2) {
                System.out.println("Inpur id of student: ");
                String id = input.readLine();
                System.out.println("Input name of student: ");
                String name = input.readLine();
                System.out.println("Input Age of student: ");
                int age = Integer.parseInt(input.readLine());
                System.out.println("Input Place of birth of student: ");
                String placeOfBirth = input.readLine();

                Student std = new Student(name, age, placeOfBirth);

                mapStudent.put(id, std);
            } else if (choise == 3) {
                System.out.println("Please input id Student want search");
                String idSearch = input.readLine();
                if (mapStudent.containsKey(idSearch) == true) {
                    Student std = mapStudent.get(idSearch);
                    System.out.println("ID: " + idSearch + " - " + std.toString());
                } else {
                    System.out.println("Not find Student");
                }
            } else if (choise == 4) {
                System.out.println("Please input id Student want remove");
                String idRemove = input.readLine();
                if (mapStudent.containsKey(idRemove) == true) {
                    mapStudent.remove(idRemove);
                } else {
                    System.out.println("Not find Student");
                }

            }
        }
    }
}
