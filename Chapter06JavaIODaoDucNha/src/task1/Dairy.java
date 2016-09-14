/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.InflaterInputStream;

/**
 *
 * @author hv
 */
public class Dairy {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Print Dairy\n2. Input Dairy");
        int choise = Integer.parseInt(input.readLine());
        if (choise == 1) {
            String dairy = "";
            String date;
            String content;
            //chek file is exitt and print file daily.txt
            try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task1/daily.txt")))) {
                while (true) {
                    date = in.readUTF();
                    content = in.readUTF();
                    dairy += date + "\n" + content + "\n\n";
                }
                
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println(dairy);
        }else  if(choise == 2){
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:");            
            Date d = new Date();
            String date = df.format(d);
            System.out.println("Input content");
            String content = input.readLine();
            //chek file is exitt and update file daily.txt
            try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/task1/daily.txt", true)))){
                out.writeUTF(date);
                out.writeUTF(content);
                System.out.println("Dairy update");                
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }

    }
}
