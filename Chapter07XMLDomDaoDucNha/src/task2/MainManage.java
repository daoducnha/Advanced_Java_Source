/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.NodeList;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.time.Clock;
import java.util.Scanner;
import org.xml.sax.SAXException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 16-9-2016 Class MainManage to view list employee, departments, list
 * emloyee of departments, add a new employee,
 */
public class MainManage {

    public static void main(String[] args) throws ParserConfigurationException, IOException, NumberFormatException {
        try {

            Scanner sc = new Scanner(System.in);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            List<Employee> listEmployees = new ArrayList<>();
            List<Department> listDepartments = new ArrayList<>();

            boolean flag = true;
            while (flag == true) {
                System.out.println("1. View list Employee");
                System.out.println("2. View list Department");
                System.out.println("3. View List Employee of department");
                System.out.println("4. Add a new Employee");
                System.out.println("5. Exit");
                System.out.println("Please input your choise: ");
                int choise = sc.nextInt();

                switch (choise) {
                    case 1:
                        if (listEmployees != null) {
                            listEmployees = getListEmployee();
                            viewList(listEmployees);
                        } else {
                            System.out.println("No have employee");
                        }
                        break;
                    case 2:
                        if (listDepartments != null) {
                            listDepartments = getListDepartment();
                            viewList(listDepartments);
                        } else {
                            System.out.println("no have department");
                        }
                        break;
                    case 3:
                        System.out.println("input id of department");
                        String idD = input.readLine();
                        List<Employee> listOfDepartment = getListEmployeeofDe(idD);
                        for (Employee element : listOfDepartment) {
                            System.out.println(element.toString());
                        }
                        break;
                    case 4:
                        System.out.println("Input ID Employee");
                        String id = input.readLine();
                        System.out.println("Input name Employee");
                        String name = input.readLine();
                        System.out.println("Input Sex Employee");
                        int sex = Integer.parseInt(input.readLine());
                        System.out.println("Input Date Of Birth Employee");
                        String dateOfBirth = input.readLine();
                        System.out.println("Input salary Employee");
                        double salary = Double.parseDouble(input.readLine());
                        System.out.println("Input address Employee");
                        String address = input.readLine();
                        System.out.println("Input idDepartment Employee");
                        String idDepartment = input.readLine();

                        Employee emp = new Employee(id, name, sex, dateOfBirth, address, idDepartment, salary);

                        addEmployeeToXMLFile(emp);
                        break;
                    case 5:
                        flag = false;
                    default:
                        System.out.println("chon sai");
                }
            }

        } catch (ParserConfigurationException | IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
//Get an object Department

    public static Department getDepartment(Node node) {
        Department d = new Department();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element e = (Element) node;
            d.setId(e.getElementsByTagName("id").item(0).getChildNodes().item(0).getTextContent());
            d.setName(e.getElementsByTagName("name").item(0).getChildNodes().item(0).getTextContent());
        }
        return d;
    }

    //Get a list object Department
    public static List<Department> getListDepartment() throws ParserConfigurationException {
        List<Department> listDepartments = new ArrayList<>();
        String filePath = "src/task2/department.xml";
        File file = new File(filePath);
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        try {
            docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("department");
            for (int i = 0; i < nodeList.getLength(); i++) {
                listDepartments.add(getDepartment(nodeList.item(i)));
            }
            return listDepartments;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    //Get an object Employee
    public static Employee getEmployee(Node node) {
        Employee employee = new Employee();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element e = (Element) node;
            employee.setId(e.getElementsByTagName("id").item(0).getChildNodes().item(0).getTextContent());
            employee.setName(e.getElementsByTagName("name").item(0).getChildNodes().item(0).getTextContent());
            employee.setSex(Integer.parseInt(e.getElementsByTagName("sex").item(0).getChildNodes().item(0).getNodeValue()));
            employee.setDateOfBirth(e.getElementsByTagName("dateOfBirth").item(0).getChildNodes().item(0).getTextContent());
            employee.setAddress(e.getElementsByTagName("address").item(0).getChildNodes().item(0).getTextContent());
            employee.setIdDepartment(e.getElementsByTagName("idDepartment").item(0).getChildNodes().item(0).getTextContent());
            employee.setSalary(Double.parseDouble(e.getElementsByTagName("salary").item(0).getChildNodes().item(0).getNodeValue()));
        }
        return employee;
    }

    //Get a list object Employee
    public static List<Employee> getListEmployee() throws ParserConfigurationException {
        List<Employee> listEmployees = new ArrayList<>();
        String filePath = "src/task2/employee.xml";
        File file = new File(filePath);
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;

        try {
            docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("employee");
            for (int i = 0; i < nodeList.getLength(); i++) {
                listEmployees.add(getEmployee(nodeList.item(i)));
            }
            return listEmployees;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    //Get list emloyee of Department
    public static List<Employee> getListEmployeeofDe(String idD) throws ParserConfigurationException {
        List<Employee> listEmployees = new ArrayList<>();
        String filePath = "src/task2/employee.xml";
        File file = new File(filePath);
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;

        try {
            docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("employee");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Employee epl = getEmployee(nodeList.item(i));
                if(epl.idDepartment.equalsIgnoreCase(idD)){
                    listEmployees.add(getEmployee(nodeList.item(i)));
                }
                
            }
            return listEmployees;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
    //View list Object
    public static <E> void viewList(List<E> l) {
        for (E element : l) {
            System.out.println(element.toString());
        }
    }

    //View List Emloyee of department
    public static void viewListEmployeeOfDepartment(List<Employee> lstEmployees, String idDepart) {
        for (Employee employee : lstEmployees) {
            if (employee.getIdDepartment().equalsIgnoreCase(idDepart)) {
                System.out.println(employee.toString());
            }
        }
    }

    //add an employee to xml file
    public static void addEmployeeToXMLFile(Employee ee) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            Element rootElement;
            File xmlFile = new File("src/task2/employee.xml");

            if (xmlFile.isFile()) {
                doc = docBuilder.parse(new FileInputStream(xmlFile));
                doc.getDocumentElement().normalize();
                rootElement = doc.getDocumentElement();
            } else {
                rootElement = doc.createElement("department");
                doc.appendChild(rootElement);
            }

            Element employee = doc.createElement("employee");
            rootElement.appendChild(employee);

            Element id = doc.createElement("id");
            id.appendChild(doc.createTextNode(ee.getId()));
            employee.appendChild(id);

            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(ee.getName()));
            employee.appendChild(name);

            Element sex = doc.createElement("sex");
            sex.appendChild(doc.createTextNode(Integer.toString(ee.sex)));
            employee.appendChild(sex);

            Element dateOfBirth = doc.createElement("dateOfBirth");
            dateOfBirth.appendChild(doc.createTextNode(ee.dateOfBirth));
            employee.appendChild(dateOfBirth);

            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode(Double.toString(ee.salary)));
            employee.appendChild(salary);

            Element address = doc.createElement("address");
            address.appendChild(doc.createTextNode(ee.address));
            employee.appendChild(address);

            Element idDepartment = doc.createElement("idDepartment");
            idDepartment.appendChild(doc.createTextNode(ee.idDepartment));
            employee.appendChild(idDepartment);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);
            System.out.println("File saved");

        } catch (ParserConfigurationException | SAXException | IOException | DOMException | TransformerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
