/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2and3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 *
 * @author hv
 */
public class MainUser {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        UserController userController = new UserController();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;
        while (flag == true) {
            System.out.println("1. Login");
            System.out.println("2. Add user");
            System.out.println("3. Exit");
            System.out.println("Please input your choise: ");
            int choise = Integer.parseInt(input.readLine());
            switch (choise) {
                case 1:
                    System.out.println("Input username: ");
                    String username = input.readLine();
                    System.out.println("Input password");
                    String passwd = input.readLine();

                    User user = userController.loginUser(username, passwd);
                    if (user != null) {
                        System.out.println(user.toString());
                    } else {
                        System.out.println("User not exist!!!");
                    }
                    break;
                case 2:

                    System.out.println("Input username: ");
                    String newuser1 = input.readLine();
                    System.out.println("Input password");
                    String newpasswd1 = input.readLine();
                    User user1 = new User(newuser1, newpasswd1);
                    userController.addUser(user1);
            }
        }

    }

}
