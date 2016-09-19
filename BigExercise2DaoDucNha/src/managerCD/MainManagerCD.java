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
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author hv
 */
public class MainManagerCD {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException, ParserConfigurationException, SAXException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        CDController cDController = new CDController();
        List<CD> listCds = new ArrayList<>();
        boolean flag = true;

        while (flag == true) {
            System.out.println("==========================");
            System.out.println("1. View list CD");
            System.out.println("2. Add a new CD");
            System.out.println("3. Search CD by name");
            System.out.println("4. Update CD by ID");
            System.out.println("5. Remove CD by ID");
            System.out.println("6. Work with I/O File");
            System.out.println("7. Work with XML File");
            System.out.println("8. Exit");
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
                    boolean flagIO = true;
                    while (flagIO == true) {
                        System.out.println("1. Write List CD from database to cd.txt");
                        System.out.println("2. Read file cd.txt");
                        System.out.println("3. Exit");
                        System.out.println("Please input your choise: ");
                        int choiseIO = Integer.parseInt(input.readLine());
                        System.out.println("====================================");
                        switch (choiseIO) {
                            case 1:
                                listCds = cDController.getListCD();
                                cDController.addCDToFile();
                                break;
                            case 2:
                                cDController.readCDtoFile();
                                System.out.println("============================");
                                break;
                            case 3:
                                flagIO = false;
                            default:
                                System.out.println("Choise wrong!!!");
                        }
                    }
                    break;
                case 7:
                    boolean flagXML = true;
                    while (flagXML==true) {                        
                        System.out.println("1. Write list CD from database to XML file");
                        System.out.println("2. Read list Cd from XML file");
                        System.out.println("3. Exit");
                        int choiseXML = Integer.parseInt(input.readLine());
                        System.out.println("==============================");
                        switch (choiseXML){
                            case 1:
                                cDController.addCDToXMLFile();
                                System.out.println("add xml file susscess!!!");
                                break;
                            case 2:
                                List<CD> listCDxml = cDController.printListCdFromXMLFile();
                                listCDxml.stream().forEach((CD cdd)->System.out.println(cdd.toString()));
                                break;
                            case 3: 
                                flagXML = false;
                                break;
                        }
                    }
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Input Choise Wrong");
                    break;
            }
        }
    }

}
