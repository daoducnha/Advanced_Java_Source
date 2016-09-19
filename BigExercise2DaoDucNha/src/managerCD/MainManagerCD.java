/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class MainManagerCD {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        CDController cDController = new CDController();
        List<CD> listCds = new ArrayList<>();
        boolean flag = true;

        while (flag == true) {
            System.out.println("1. View list CD");
            System.out.println("2. Add a new CD");
            System.out.println("3. Search CD by name");
            System.out.println("4. Update CD by ID");
            System.out.println("5. Remove CD by ID");
            System.out.println("6. Exit");
            System.out.println("Please input your choise: ");
            int choise = Integer.parseInt(input.readLine());
            System.out.println("=========================");
            switch (choise) {
                case 1:
                    System.out.println("List CD: ");
                    cDController.printListCD();
                    System.out.println("===========================");
                    break;
                case 2:
                    CD cd = cDController.createNewCD();
                    cDController.addNewCD(cd);
                    break;
                case 3:
                    System.out.println("Input mane CD want search: ");
                    String nameSearch = input.readLine();
                    System.out.println("List CD: ");
                    cDController.searchCD(nameSearch);
                    System.out.println("============================");
                    break;
                case 4:
                    listCds = cDController.getListCD();
                    for (CD element : listCds) {
                        System.out.println(element.toString());
                    }
                    System.out.println("========================");
                    System.out.println("Please Input ID CD want update: ");
                    int idUpdate = Integer.parseInt(input.readLine());
                    while (cDController.searchCDByID(idUpdate) == false) {
                        System.out.println("Input ID Cd wrong, Please input ID in list CD: ");
                        idUpdate = Integer.parseInt(input.readLine());
                    }
                    cDController.updateCD(idUpdate);
                    System.out.println("===========================");
                    break;
                case 5:
                    listCds = cDController.getListCD();
                    for (CD element : listCds) {
                        System.out.println(element.toString());
                    }
                    System.out.println("========================");
                    
                   
                    
                    System.out.println("Please input ID CD want remove: ");
                    int idRemove = Integer.parseInt(input.readLine());
                    while (cDController.searchCDByID(idRemove) == false) {
                        System.out.println("Input ID Cd wrong, Please input ID in list CD: ");
                        idRemove = Integer.parseInt(input.readLine());
                    }
                    cDController.removeCD(idRemove);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Input Choise Wrong");
                    break;
            }
        }
    }

}
