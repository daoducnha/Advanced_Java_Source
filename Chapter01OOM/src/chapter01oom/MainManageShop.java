/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01oom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainManageShop {

    public static void main(String[] args) throws IOException {
        Product[] product = new Product[100];

        Order[] listOrder = new Order[100];

        Customer customer = null;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int j = 0;
        boolean newOrder = true;
        while (newOrder == true) {
            System.out.println("do yeu want add new order?y/n");
            String yOrN = input.readLine();
            if (yOrN.equalsIgnoreCase("n")) {
                newOrder = false;
            } else if (yOrN.equalsIgnoreCase("y")) {
                OrderDetail[] list = new OrderDetail[100];

                boolean flag = true;
                System.out.println("input Order Day: ");
                String orderDay = input.readLine();
                System.out.println("input Status order: ");
                String status = input.readLine();
                while (flag == true && i < 100) {
                    System.out.println("do you want input new product?y/n");
                    String choiseInput = input.readLine();
                    if (choiseInput.equalsIgnoreCase("n")) {
                        flag = false;
                    } else if (choiseInput.equalsIgnoreCase("y")) {
                        System.out.println("Input Name Producr: ");
                        String name = input.readLine();
                        System.out.println("Input Price Product: ");
                        double price = Double.parseDouble(input.readLine());
                        product[i] = new Product(name, price);
                        System.out.println("Input quantity of product");
                        int quantity = Integer.parseInt(input.readLine());
                        list[i] = new OrderDetail(quantity, product[i]);
                        i++;
                    } else {
                        System.out.println("Wrong choise!!!");
                    }
                }

                listOrder[j] = new Order("29/08/2016", false, "new", list);
                j++;
            } else {
                System.out.println("Choise Wrong!!!");
            }
        }

        System.out.println("Do You have customer card?Y/N");
        String yn = input.readLine();
        if (yn.equalsIgnoreCase("y")) {
            customer = new Customer("10010", listOrder, "abc", "aabbcc@gmail.com", "197798420", "Thang", "09090909");
        } else {

        }

        double amount = 0;
        for (Order values : listOrder) {
            if (values != null) {
                amount += values.calTotalAmount();
            }
        }

        System.out.println("Choise Type Payment: ATM(1) or Creadit Card(2)");
        int choise = Integer.parseInt(input.readLine());

        if (choise == 1) {
            ATMCard atm = new ATMCard(1000000, "100", "10/10/2015", listOrder);
            if (amount > atm.getBalance()) {
                System.out.println("not enough money");
            } else {
                double rs = atm.getBalance() - amount;
                atm.setBalance(rs);
                if (customer != null) {
                    System.out.println("Customer ID: " + customer.getCustomerID());
                }

                System.out.println("Name Of ATM: " + atm.getName());
                System.out.println("List order: ");
                for (Order values : listOrder) {
                    if (values != null) {
                        values.printListOderDetail();
                    }
                }
            }
        } else if (choise == 2) {
            CreditCard credit = new CreditCard("10/10/2015", 5000000, "Visa", "123456", "10/10/2010", listOrder);
            if (amount > credit.getMaxDebt()) {
                System.out.println("not enough money");
            } else {
                double rs = credit.getMaxDebt() - amount;
                credit.setMaxDebt(rs);
                if(customer!=null){
                    System.out.println("Customer ID: " + customer.getCustomerID());
                }
                System.out.println("Name Of Credit Card: " + credit.getName());
                System.out.println("List order: ");
                for (Order values : listOrder) {
                    if (values != null) {
                        values.printListOderDetail();                        
                    }                    
                }
            }
        }

    }
}
