
package bigexercise1daoducnha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class main to manage a list class
 */
public class MainClass {

    public static void main(String[] args) throws IOException, NumberFormatException {
        try {
            DetailAttendance[] listAtt1 = new DetailAttendance[100];
            DetailAttendance[] listAtt2 = new DetailAttendance[100];
            Mark[] listMark1 = new Mark[100];
            Mark[] listMark2 = new Mark[100];
            Student[] listStudent = new Student[100];

            listStudent[0] = new Student("001", "10/10/1992", listAtt1, listMark1, "abc@gmail.com", "Nguyen van A", "09090909");
            listStudent[1] = new Student("002", "11/10/1992", listAtt2, listMark2, "def@gmail.com", "Nguyen van B", "09091234");

            Subject java = new Subject("Java", 12, "10/10", "10/11");
            Subject linux = new Subject("Linux", 12, "8/8", "9/10");
            Subject[] listSubjectcls1 = new Subject[100];
            listSubjectcls1[0] = java;
            listSubjectcls1[1] = linux;

            Subject[] list1 = {java};
            Subject[] list2 = {linux};

            Teacher[] listTeacher = {
                new Teacher(list1, "ktPhuong@gmail.com", "Khuat Thuy Phuong", "123456789"),
                new Teacher(list2, "vqTrung@gmail.com", "Vuong Quoc Trung", "112233445")
            };

            MarkTable markTable = new MarkTable();

            Class[] listCLS = new Class[100];

            listCLS[0] = new Class(100, "Java1", "001", "10/11/2016", listTeacher[0],
                    "8/8/2016", listSubjectcls1, listTeacher, listStudent, markTable);

            int numSessionJava = java.getNumOfLession() / 4;
            int numSessionLinux = linux.getNumOfLession() / 4;

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            boolean flag = true;
            while (flag == true) {
                System.out.println("Please choise task: ");
                System.out.println("1. Attendance Java\n2. Show Attendance Java "
                        + "\n3. Show Mark Java\n4. Add A Subject into Class\n5. Add new Class"
                        + "\n6 Add New Student in Subject");
                int choise = Integer.parseInt(input.readLine());

                if (choise == 1) {
                    
                    //Start Attendance each Student of class subject Java
                    DetailAttendance[] listdt = new DetailAttendance[numSessionJava];
                    for (int i = 0; i < listStudent.length; i++) {

                        if (listStudent[i] != null) {
                            for (int j = 0; j < numSessionJava; j++) {
                                System.out.println("Spell " + (j + 1) + ": ");
                                System.out.println("Choise Status: attendance(1) - late(2) - early(3) - miss(4)");
                                int choiseStatus = Integer.parseInt(input.readLine());
                                DetailAttendance dta = new DetailAttendance();
                                if (choiseStatus == 1) {
                                    dta = new DetailAttendance("", listStudent[i].getName(), "attendance");
                                } else if (choiseStatus == 2) {
                                    dta = new DetailAttendance("", listStudent[i].getName(), "late");
                                } else if (choiseStatus == 3) {
                                    dta = new DetailAttendance("", listStudent[i].getName(), "early");
                                } else if (choiseStatus == 4) {
                                    dta = new DetailAttendance("", listStudent[i].getName(), "miss");
                                }
                                listdt[j] = dta;
                            }
                            listStudent[i].setDetailAttendances(listdt);
                        }

                    }
                } else if (choise == 2) {
                    //Show List mark Attendance of student
                    for (int i = 0; i < listStudent.length; i++) {
                        if (listStudent[i] != null) {
                            System.out.println(listStudent[i].getName());
                            for (int j = 0; j < numSessionJava; j++) {
                                if (listStudent[i].detailAttendances[j] != null) {
                                    System.out.println("Session " + (j + 1) + ": "
                                            + listStudent[i].detailAttendances[j].getStatusAttendance()
                                            + " - Mark: " + listStudent[i].detailAttendances[j].getMark());
                                }
                            }
                        }
                    }
                } else if (choise == 3) {
                    //show final mark of student 
                    MarkExam meHs1 = new MarkExam(8, 8);
                    MarkSpells[] ls1 = {
                        new MarkSpells(8, 8, listStudent[0].detailAttendances[0]),
                        new MarkSpells(8, 8, listStudent[0].detailAttendances[1]),
                        new MarkSpells(8, 8, listStudent[0].detailAttendances[2])
                    };
                    Mark markStudent1 = new Mark(ls1, meHs1);
                    MarkExam meHs2 = new MarkExam(8.5, 7.5);
                    MarkSpells[] ls2 = {
                        new MarkSpells(7, 6, listStudent[1].detailAttendances[0]),
                        new MarkSpells(7, 6, listStudent[1].detailAttendances[1]),
                        new MarkSpells(7, 6, listStudent[1].detailAttendances[2])
                    };
                    Mark markStudent2 = new Mark(ls2, meHs2);
                    DetailMarkTable[] listDetailMarkTable = new DetailMarkTable[listStudent.length];
                    listDetailMarkTable[0] = new DetailMarkTable("good", listStudent[0], markStudent1, java);
                    listDetailMarkTable[1] = new DetailMarkTable("good", listStudent[1], markStudent2, java);
                    MarkTable markTablelJava = new MarkTable("java1", listDetailMarkTable, listCLS[0]);

                    System.out.println("Show list mark Java: ");
                    markTablelJava.showMarkStudent();
                } else if (choise == 4) {
                    //Add new subjec into a class
                    System.out.println("Input name Subject");
                    String name = input.readLine();
                    System.out.println("Input num of Seesion Of Subject");
                    int num = Integer.parseInt(input.readLine());
                    System.out.println("Input Start Date");
                    String start = input.readLine();
                    System.out.println("Input End Date");
                    String end = input.readLine();
                    Subject newSubject = new Subject(name, num, start, end);

                    int i = 0;
                    boolean flag1 = true;
                    while (flag1 == true) {
                        if (listSubjectcls1[i] == null) {
                            listSubjectcls1[i] = newSubject;
                            flag1 = false;
                        }
                        i++;
                    }
                    System.out.println("Add A Subject is susscess");
                } else if (choise == 5) {
                    //add a new class
                    System.out.println("Input Number of Session: ");
                    int num = Integer.parseInt(input.readLine());
                    System.out.println("Input Name of Class");
                    String nameClass = input.readLine();
                    System.out.println("Input Contract Number");
                    String contractNumber = input.readLine();
                    System.out.println("Input Start Date");
                    String start = input.readLine();
                    System.out.println("Input End Date");
                    String end = input.readLine();
                    Teacher leadeTeacher = new Teacher();
                    Student[] listStd = new Student[100];
                    Subject[] listSbj = new Subject[100];
                    Teacher[] listTc = new Teacher[100];
                    MarkTable m = new MarkTable();
                    Class newClass2 = new Class(choise, end, contractNumber, end, leadeTeacher, start, listSbj, listTc, listStd, m);
                    System.out.println("Add Class is Susscess");
                } else if (choise == 6) {

                    //add a new student in class
                    System.out.println("Input Class name add");
                    String nameClass = input.readLine();

                    System.out.println("input Id Student: ");
                    String id = input.readLine();
                    System.out.println("Input name student ");
                    String nameStd = input.readLine();
                    System.out.println("Input Date of Birth ");
                    String dateOfBirth = input.readLine();
                    System.out.println("Input Email");
                    String email = input.readLine();
                    System.out.println("Input Phone number");
                    String phone = input.readLine();
                    DetailAttendance[] ldt = new DetailAttendance[100];
                    Mark[] lm = new Mark[100];
                    Student newStudent = new Student(id, dateOfBirth, ldt, lm, email, nameStd, phone);

                    for (Class values : listCLS) {
                        if (values != null && values.getClassName().equalsIgnoreCase(nameClass) && values.markTable == null) {
                            int i = 0;
                            boolean flag1 = true;
                            while (flag1 == true) {
                                if (values.student[i] == null) {
                                    values.student[i] = newStudent;
                                    flag1 = false;
                                }
                            }
                        }
                    }
                } else if (choise == 7) {
                    flag = false;
                }
            }
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
