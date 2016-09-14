/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;

/**
 *
 * @author hv
 */
public class MainStudent {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int grade;
        double semaster1, semaster2, avg;

        System.out.println("1. Print list student");
        System.out.println("2. Add new student");
        System.out.println("3. Print list stident in block");
        System.out.println("4. Print number Student Excellent, Good, Average and Below Average, Weak");
        System.out.println("5. Print number student in of block");
        System.out.println("Please input your choise:");
        int choise = Integer.parseInt(input.readLine());
        if (choise == 1) {
            try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task3/tongketnamhoc.txt")))) {
                while (true) {
                    name = in.readUTF();
                    grade = in.readInt();
                    semaster1 = in.readDouble();
                    semaster2 = in.readDouble();
                    avg = (semaster1 + semaster2 * 2) / 3;
                    DecimalFormat df = new DecimalFormat("###.##");
                    avg = Double.parseDouble(df.format(avg));

                    System.out.println("Name: " + name + " - Grade: " + grade + "- Semaster 1: " + semaster1 + "- Semaster 2: " + semaster2 + " - AVG: " + avg);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else if (choise == 2) {
            System.out.println("Input name: ");
            name = input.readLine();
            System.out.println("Input grade: ");
            grade = Integer.parseInt(input.readLine());
            System.out.println("Input Mark Semaster I: ");
            semaster1 = Double.parseDouble(input.readLine());
            System.out.println("Input Mark Semaster II: ");
            semaster2 = Double.parseDouble(input.readLine());

            try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/task3/tongketnamhoc.txt", true)))) {
                out.writeUTF(name);
                out.writeInt(grade);
                out.writeDouble(semaster1);
                out.writeDouble(semaster2);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else if (choise == 3) {
            String grade10 = "";
            String grade11 = "";
            String grade12 = "";
            try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task3/tongketnamhoc.txt")))) {
                while (true) {
                    name = in.readUTF();
                    grade = in.readInt();
                    semaster1 = in.readDouble();
                    semaster2 = in.readDouble();
                    avg = (semaster1 + semaster2 * 2) / 3;
                    DecimalFormat df = new DecimalFormat("###.##");
                    avg = Double.parseDouble(df.format(avg));

                    if (grade == 10) {
                        grade10 += "Name: " + name + " - Grade: " + grade + "- Semaster 1: " + semaster1 + "- Semaster 2: " + semaster2 + " - AVG: " + avg + "\n";
                    }
                    if (grade == 11) {
                        grade11 += "Name: " + name + " - Grade: " + grade + "- Semaster 1: " + semaster1 + "- Semaster 2: " + semaster2 + " - AVG: " + avg + "\n";
                    }
                    if (grade == 12) {
                        grade12 += "Name: " + name + " - Grade: " + grade + "- Semaster 1: " + semaster1 + "- Semaster 2: " + semaster2 + " - AVG: " + avg + "\n";
                    }
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Grade 10: \n" + grade10);
            System.out.println("Grade 11: \n" + grade11);
            System.out.println("Grade 12: \n" + grade12);
        } else if (choise == 4) {

            int numExcellent = 0;
            int numGood = 0;
            int numAverageAndBelow = 0;
            int numWeak = 0;

            try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task3/tongketnamhoc.txt")))) {

                while (true) {
                    name = in.readUTF();
                    grade = in.readInt();
                    semaster1 = in.readDouble();
                    semaster2 = in.readDouble();
                    avg = (semaster1 + semaster2 * 2) / 3;
                    DecimalFormat df = new DecimalFormat("###.##");
                    avg = Double.parseDouble(df.format(avg));

                    if (avg >= 8) {
                        numExcellent++;
                    }
                    if (avg >= 7 && avg < 8) {
                        numGood++;
                    }
                    if (avg >= 5 && avg < 7) {
                        numAverageAndBelow++;
                    }
                    if (avg < 5) {
                        numWeak++;
                    }
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Number Student Excellent is: " + numExcellent);
            System.out.println("Number Student Good is: " + numGood);
            System.out.println("Number Student Average and Below Average is: " + numAverageAndBelow);
            System.out.println("Number Student Weak is: " + numWeak);
        } else if (choise == 5) {
            int numgGrade10 = 0;
            double avgGrade10 = 0;
            int numgGrade11 = 0;
            double avgGrade11 = 0;
            int numgGrade12 = 0;
            double avgGrade12 = 0;

            try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task3/tongketnamhoc.txt")))) {
                while (true) {
                    name = in.readUTF();
                    grade = in.readInt();
                    semaster1 = in.readDouble();
                    semaster2 = in.readDouble();
                    avg = (semaster1 + semaster2 * 2) / 3;
                    DecimalFormat df = new DecimalFormat("###.##");
                    avg = Double.parseDouble(df.format(avg));
                    if (grade == 10) {
                        numgGrade10++;
                        avgGrade10 += avg;
                    } else if (grade == 11) {
                        numgGrade11++;
                        avgGrade11 += avg;
                    } else if (grade == 12) {
                        numgGrade12++;
                        avgGrade12 += avg;
                    }

                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            if (numgGrade10 != 0) {
                System.out.println("Number Student grade 10 is: " + numgGrade10 + " - AVG: " + (avgGrade10 / numgGrade10));
            }
            if (numgGrade11 != 0) {
                System.out.println("Number Student grade 11 is: " + numgGrade11 + " - AVG: " + (avgGrade11 / numgGrade11));
            }
            if (numgGrade12 != 0) {
                System.out.println("Number Student grade 12 is: " + numgGrade12 + " - AVG: " + (avgGrade12 / numgGrade12));
            }
        }

    }
}
