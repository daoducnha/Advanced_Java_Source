/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author hv
 */
public class MainManageContract {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Contact c1 = new Contact("Nha", "0989018536");
        Contact c2 = new Contact("Thang", "090989090");
        Contact c3 = new Contact("an", "0909090909");
        Contact c4 = new Contact("thao", "123456789");

        Set<Contact> setContacts = new TreeSet();
        setContacts.add(c1);
        setContacts.add(c2);
        setContacts.add(c3);
        setContacts.add(c4);

        boolean flag = true;
        while (flag == true) {
            System.out.println("1. View Contact");
            System.out.println("2. Add new contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Remove a contact");
            System.out.println("5. Update a contact");
            System.out.println("6. Exit");
            System.out.println("Please input your choise: ");
            int choise = Integer.parseInt(input.readLine());
            switch (choise) {
                case 1:
                    for (Object obj : setContacts) {
                        Contact element = (Contact) obj;
                        System.out.println(element.toString());
                    }
                    break;
                case 2:
                    System.out.println("Input name: ");
                    String name = input.readLine();
                    System.out.println("Input phone number: ");
                    String phone = input.readLine();
                    Contact c = new Contact(name, phone);
                    setContacts.add(c);
                    break;
                case 3:
                    System.out.println("Please input name want search: ");
                    String search = input.readLine();
                    for (Contact obj : setContacts) {
                        Contact element = (Contact) obj;
                        if (element.getName().compareToIgnoreCase(search) >= 0) {
                            System.out.println(element.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Please choise input name(1) or phone number(2)");
                    int choisenn = Integer.parseInt(input.readLine());
                    if (choisenn == 1) {
                        System.out.println("Input name remove");
                        String namerm = input.readLine();
                        boolean f = false;
                        Contact rm = new Contact();
                        for (Contact ct : setContacts) {
                            if (ct.getName().equalsIgnoreCase(namerm)) {
                                rm = ct;
                                f = true;
                            }
                        }
                        if (f == true) {
                            setContacts.remove(rm);
                        } else {
                            System.out.println("Not found name");
                        }
                    } else if (choise == 2) {
                        System.out.println("Input phone remove");
                        String phonerm = input.readLine();
                        
                        boolean f = false;
                        for (Contact ct : setContacts) {
                            if (ct.getName().equalsIgnoreCase(phonerm)) {
                                rm = ct;
                                f = true;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Please input name want update");
                    String update = input.readLine();
                    Contact ud = new Contact();
                    Contact elm = new Contact();
                    boolean f = false;
                    for (Contact obj : setContacts) {
                        if (obj.getName().equalsIgnoreCase(update)) {
                            System.out.println(obj.toString());
                            System.out.println("Please input phone number want update: ");
                            String updatePhone = input.readLine();
                            System.out.println("Do you quant update phone number?y/n");
                            String yOrN = input.readLine();
                            if (yOrN.equalsIgnoreCase("y")) {
                                elm = obj;
                                ud = new Contact(obj.getName(), updatePhone);
                                f = true;
                            }
                        }
                    }
                    if (f == true) {
                        setContacts.remove(elm);
                        setContacts.add(ud);
                    } else {
                        System.out.println("Don't Find name want update");
                    }

                    break;
                case 6:
                    break;
                default:
                    System.out.println("chosie wrong");
                    break;
            }
        }
    }

    public static void searchByName(Set setContacts, String name) {

    }
}
