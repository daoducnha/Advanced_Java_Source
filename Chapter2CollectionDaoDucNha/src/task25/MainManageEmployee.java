/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0 
 * Date 9/7/2016 
 * Class MainManageEmployee to Print list employee, search employee, add employee, remove employee
 */
public class MainManageEmployee {

    public static void main(String[] args) throws IOException {
        List<Employee> listEmployee = new ArrayList();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;

        Employee emp1 = new Employee("001", "nha", 24, 5000000);
        Employee emp2 = new Employee("002", "thang", 24, 7500000);
        Employee emp3 = new Employee("003", "dai", 24, 6000000);
        Employee emp4 = new Employee("004", "dinh", 24, 5500000);

        listEmployee.add(emp1);
        listEmployee.add(emp2);
        listEmployee.add(emp3);
        listEmployee.add(emp4);
        while (flag == true) {
            System.out.println("1. View List Employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Sort by Salary");
            System.out.println("4. Search employee by ID");
            System.out.println("5. Remove employee by ID");
            System.out.println("6. Exit");
            System.out.println("Please input your choise");
            int choise = Integer.parseInt(input.readLine());
            if (choise == 1) {
                PrintListEmployee(listEmployee);
            } else if (choise == 2) {
                Employee newEmployee = new Employee();
                listEmployee.add(createEmployee(newEmployee));
                System.out.println("add employee susscess");
            } else if (choise == 3) {
                Collections.sort(listEmployee);
                Collections.reverse(listEmployee);
            } else if (choise == 4) {
                System.out.println("Please input ID of employee");
                String search = input.readLine();
                searchEmployee(listEmployee, search);
            } else if (choise == 5) {
                System.out.println("Please input ID of employee");
                String search = input.readLine();

                removeEmployee(listEmployee, search);
            } else if (choise == 6) {
                flag = false;
            }
        }
    }

    //Create a employee and ouput a employee
    public static Employee createEmployee(Employee e) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Id of employee");
        String id = input.readLine();
        System.out.println("Input name employee");
        String name = input.readLine();
        System.out.println("Input age of employee");
        int age = Integer.parseInt(input.readLine());
        System.out.println("Input salary ò employee");
        double salary = Double.parseDouble(input.readLine());

        e = new Employee(id, name, age, salary);
        return e;
    }
    //Search a employee by id and ouput information of employee
    public static void searchEmployee(List listEmployee, String id) {
        for (Object values : listEmployee) {
            Employee e = (Employee) values;
            if (e.getId().equalsIgnoreCase(id)) {
                System.out.println(e.toString());
            }
        }
    }
    //Remove a employee by id and return true if susscess else return false
    public static boolean removeEmployee(List listEmployee, String id) {
        Employee eR = new Employee();
        for (Object values : listEmployee) {
            Employee e = (Employee) values;
            if (e.getId().equalsIgnoreCase(id)) {
                eR = e;
            }
        }
        if (eR != null) {
            listEmployee.remove(eR);
            return true;
        } else {
            return false;
        }
    }
    //output list employee
    public static void PrintListEmployee(List listEmployee) {
        for (Object values : listEmployee) {
                    Employee e = (Employee) values;
                    System.out.println(e.toString());
                }
    }
}
