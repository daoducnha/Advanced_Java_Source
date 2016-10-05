/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author hv
 */
import java.util.*;
import org.hibernate.*;
import entities.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bookstore {

    /**
     * @param args the command line arguments
     */
    //Tao mot session factory de quan ly cac session
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        BookStoreManager bookstore = new BookStoreManager();
        boolean flag = true;
        while (flag == true) {
            System.out.println("1. One To One");
            System.out.println("2. One To Many");
            System.out.println("3. ManyTo Many");
            System.out.println("4. Create,Read, Update, Remove table");
            System.out.println("5. Exit");

            System.out.println("Input your choise: ");
            int choise = Integer.parseInt(input.readLine());
            switch (choise) {
                case 1:
                    boolean f = true;
                    while (f == true) {
                        System.out.println("1. View Detail a book");
                        System.out.println("2. Create a book and detail book");
                        System.out.println("3. Delete a book");
                        System.out.println("4. Exit");
                        System.out.println("Input your choise: ");
                        int choise1 = Integer.parseInt(input.readLine());
                        switch (choise1) {
                            case 1:
                                bookstore.viewDetaiBook();
                                break;
                            case 2:
                                bookstore.addOneToOne();
                                break;
                            case 3:
                                bookstore.removeOneToOne();
                                break;
                            case 4:
                                f = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean f2 = true;
                    while (f2 == true) {
                        System.out.println("1. View list book of category");
                        System.out.println("2. Add a category and list book of it");
                        System.out.println("3. Delete a category");
                        System.out.println("4. Exit");
                        System.out.println("Input your choise: ");
                        int choise2 = Integer.parseInt(input.readLine());
                        switch (choise2) {
                            case 1:
                                bookstore.viewListBookFromCategory();
                                break;
                            case 2:
                                bookstore.addOneToMany();
                                break;
                            case 3:
                                bookstore.removeCategoryOneToMany();
                                break;
                            case 4:
                                f2 = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean f3 = true;
                    while (f3 == true) {
                        System.out.println("1. View list book of an Author");
                        System.out.println("2. View list author of a Book");
                        System.out.println("3. Demo Add Many to many");
                        System.out.println("4. Demo Delete many to many");
                        System.out.println("5.Exit");
                        System.out.println("Input your choise: ");
                        int choise3 = Integer.parseInt(input.readLine());
                        switch (choise3) {
                            case 1:
                                bookstore.viewBookOfAuthor();
                                break;
                            case 2:
                                bookstore.viewAuthorOfBook();
                                break;
                            case 3:
                                bookstore.addManyToMany();
                                break;
                            case 4:
                                bookstore.deleteManyToMany();
                                break;
                            case 5:
                                f3 = false;
                                break;
                        }
                    }
                    break;
                case 4:
                    boolean f4 = true;
                    while (f4 == true) {
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Exit");
                        System.out.println("Please input your choise");
                        int choise4 = Integer.parseInt(input.readLine());
                        switch (choise4) {
                            case 1:
                                bookstore.createCategory();
                                break;
                            case 2:
                                bookstore.viewListCategory();
                                break;
                            case 3:
                                bookstore.updateCategory();
                                break;
                            case 4:
                                bookstore.removeCategory();
                                break;
                            case 5:
                                f4 = false;
                                break;
                        }
                    }                    
                    break;
                case 5:
                    flag = false;
                    break;
            }

        }
//        while (flag == true) {
//
//            System.out.println("1. One To One");
//            System.out.println("1. View list book of category");
//            System.out.println("2. View detail of a book");
//            System.out.println("3. View List book of an Author");
//            System.out.println("4. View list Author of a Book");
//            System.out.println("5. Add new category");
//            System.out.println("6. Remove Category");
//            System.out.println("7. Update Category");
//            System.out.println("8. View list Book");
//            System.out.println("9. One To Many");
//            System.out.println("10. Remove categoy one to many");
//            System.out.println("11. Add Many to Many");
//            System.out.println("12. Delete Many to many");
//            System.out.println("13. Add one to one");
//            System.out.println("14. Remove one to one");
//            System.out.println("15. Exit");
//            System.out.println("Please input your choise: ");
//            int choise = Integer.parseInt(input.readLine());
//
//            switch (choise) {
//                case 1:
//                    bookstore.viewListBookFromCategory();
//                    break;
//                case 2:
//                    bookstore.viewDetaiBook();
//                    break;
//                case 3:
//                    bookstore.viewBookOfAuthor();
//                    break;
//                case 4:
//                    bookstore.viewAuthorOfBook();
//                    break;
//                case 5:
//                    bookstore.createCategory();
//                    break;
//                case 6:
//                    bookstore.removeCategory();
//                    break;
//                case 7:
//                    bookstore.updateCategory();
//                    break;
//                case 8:
//                    bookstore.viewListBook();
//                    break;
//                case 9:
//                    bookstore.addOneToMany();
//                    break;
//                case 10:
//                    bookstore.removeCategoryOneToMany();
//                    break;
//                case 11:
//                    bookstore.addManyToMany();
//                    break;
//                case 12:
//                    bookstore.deleteManyToMany();
//                    break;
//                case 13:
//                    bookstore.addOneToOne();
//                    break;
//                case 14:
//                    bookstore.removeOneToOne();
//                    break;
//                case 15:
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Choise Wrong");
//            }
//        }

    }

}
