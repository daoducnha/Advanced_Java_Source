/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author hv
 */
public class MainContact {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Contact> l = new ArrayList<>();
        System.out.println("1. Add a contact into contact.xml");
        System.out.println("2. View List contact");
        System.out.println("3. Search contact by name");
        System.out.println("4. Delete contact by name");
        System.out.println("Please input you choise: ");
        int choise = Integer.parseInt(input.readLine());
        if (choise == 1) {
            addContact();
        } else if (choise == 2) {
            l = getListContacts();
            for (Contact contact : l) {
                System.out.println(contact.toString());
            }
        }else if(choise == 3){
            System.out.println("Input name want search: ");
            String search = input.readLine();
            l = getListContacts();
            Contact c = searchContact(search, l);
            System.out.println(c.toString());
        }

    }

    public static void addContact() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input name: ");
            String n = sc.nextLine();
            System.out.println("Input Phone number: ");
            String phone = sc.nextLine();

            Contact c = new Contact(n, phone);

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = (Document) docBuilder.newDocument();

            Element rootElemnet;
            String filePath = "src/task1/contact.xml";
            File xmlFile = new File(filePath);

            if (xmlFile.isFile()) {
                doc = docBuilder.parse(new FileInputStream(xmlFile));
                doc.getDocumentElement().normalize();
                rootElemnet = doc.getDocumentElement();
            } else {
                rootElemnet = doc.createElement("contacts");
                doc.appendChild(rootElemnet);
            }

            Element contact = doc.createElement("contact");
            rootElemnet.appendChild(contact);

            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(c.name));
            contact.appendChild(name);

            Element phoneNumber = doc.createElement("phoneNumber");
            phoneNumber.appendChild(doc.createTextNode(c.phoneNumber));
            contact.appendChild(phoneNumber);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);
            System.out.println("Add contact is sussess!!!");

        } catch (Exception e) {
        }
    }

    public static Contact getContact(Node node) {
        Contact c = new Contact();
        if (node.getNodeType() == node.ELEMENT_NODE) {
            Element element = (Element) node;
            c.setName(element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
            c.setPhoneNumber(element.getElementsByTagName("phoneNumber").item(0).getChildNodes().item(0).getNodeValue());
        }
        return c;
    }

    public static List<Contact> getListContacts() {
        String filePath = "src/task1/contact.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("contact");

            List<Contact> listContacts = new ArrayList<>();

            for (int i = 0; i < nodeList.getLength(); i++) {
                listContacts.add(getContact(nodeList.item(i)));
            }
            return listContacts;
        } catch (Exception e) {
        }
        return null;
    }

    public static Contact searchContact(String name, List<Contact> l) {
        for (Contact contact : l) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
    
    public static boolean deleteContact(String name) {
        return true;
    }
}
