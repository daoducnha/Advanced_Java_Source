/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class MainEmployee {

    public static void main(String[] args) throws IOException {

        List<Employee> lst = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Add a Employee");
        System.out.println("2. View list Employee");
        System.out.println("3. Search A Employee by name");
        int choise = Integer.parseInt(input.readLine());
        if (choise == 1) {
            ObjectOutputStream out;
            try {
                Employee epl = createEmployee();

                out = new ObjectOutputStream(new FileOutputStream("src/task4/employee.txt", true));
//                {
//                    @Override
//                    protected void writeStreamHeader() throws IOException {
//                        reset();
//                    }
//                };
                out.writeObject(epl);
                out.close();
                System.out.println("Add new employee susscess!!!");
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } else if (choise == 2) {

            try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/task4/employee.txt")))) {
                while (true) {
                    Employee epl = (Employee) in.readObject();
                    lst.add(epl);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            lst.stream().forEach((Employee e) -> System.out.println(e.toString()));
        } else if (choise == 3) {
            System.out.println("Input name want search: ");
            String nameSearch = input.readLine();
             try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/task4/employee.txt")))) {
                while (true) {
                    Employee epl = (Employee) in.readObject();
                    if(epl.getName().equalsIgnoreCase(nameSearch)){
                        System.out.println(epl.toString());
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        //            System.out.println("Personal Income: " + String.format("%f", e.calPersonalIncome()));
        //            System.out.println("Tax Income: " + String.format("%f", e.calTaxIncome()));
        //            System.out.println("Tax Persionnal Income: " + String.format("%f", e.calTaxPersionnal()));
        //            System.out.println("Real Income: " + String.format("%f", e.calRealIncome()));
        //        
        //"src/task4/employee.txt"
        {

        }
    }

    public static Employee createEmployee() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input your name: ");
        String name = input.readLine();
        System.out.println("Input your pay rate: ");
        double pr = Double.parseDouble(input.readLine());
        System.out.println("Input num people appendant: ");
        int npa = Integer.parseInt(input.readLine());
        System.out.println("Input your Fringe Benefits: ");
        double fb = Double.parseDouble(input.readLine());

        Employee e = new Employee(name, pr, npa, fb);

        return e;
    }
}
