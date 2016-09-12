/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import jdk.nashorn.internal.runtime.options.Option;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 12/09/2016
 * Class MainStudent to manage list student
 */
public class MainStudent {

    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();

        Student std1 = new Student("Phuong Khuat", 17, 8, 7);
        Student std2 = new Student("Hanh Nguyen", 18, 8.5, 7.5);
        Student std3 = new Student("Hoa Huynh", 18, 7.5, 6.5);
        Student std4 = new Student("Duyen Phan", 20, 7.5, 7.5);

        listStudent.add(std4);
        listStudent.add(std3);
        listStudent.add(std2);
        listStudent.add(std1);

        Stream<Student> stream = listStudent.stream();
        stream.forEach(std -> System.out.println(std.toString()));

        //count number student have old  >=18
        int countAge = (int) listStudent.stream().filter((Student a) -> a.getAge() >= 18).count();
        System.out.println("Count student have age > 18: " + countAge);
        //count number student hava first name start at 'H'
        int countH = (int) listStudent.stream().filter((Student a) -> a.getName().startsWith("H")).count();
        System.out.println("number student hava first name start at 'H' is :" + countH);
        Optional<Student> resutl = listStudent.stream().filter((Student a) -> a.getName().startsWith("H")).findFirst();
        System.out.println(resutl);

        //statistics the mark Average of list Student
        DoubleSummaryStatistics status = listStudent.stream().mapToDouble((x) -> x.avg()).summaryStatistics();
        System.out.println("Height Avg mark in list: " + status.getMax());
        System.out.println("Lowest Avg mark in list: " + status.getMin());
        System.out.println("Sum Avg mark in list: " + status.getSum());
        System.out.println("Average Avg mark in list: " + status.getAverage());

        //Create list1 from listStudent have mark Average >=8 
        List<Student> list1 = listStudent.stream().filter((Student a) -> a.avg() >= 8).collect(Collectors.toList());
        System.out.println("List of verry good Student: ");
        list1.stream().forEach(System.out::println);

    }
}
