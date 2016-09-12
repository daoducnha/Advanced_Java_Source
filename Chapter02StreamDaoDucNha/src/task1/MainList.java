/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 12/9/2016
 * Class MainList to manage List String by Stream
 */
public class MainList {

    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Hello", "", "wold", "", "abc", "def", "Happy", "happy", "", "aaaaaddd");
        Stream<String> streamString = listString.stream();
        streamString.forEach(System.out::println);

        //count eloement == "" in list String
        int coutNull = (int) listString.stream().filter(string -> string.equals("")).count();
        System.out.println("Number element = '' is" + coutNull);

        //count eloement has lenght >=5 in list String
        int countLengtFive = (int) listString.stream().filter(string -> string.length() >= 5).count();

        System.out.println("Number element has lenght>=5 is: " + countLengtFive);

        //count element start = "a" in list String
        int startA = (int) listString.stream().filter(string -> string.startsWith("a")).count();
        System.out.println("Number element start by 'a' is: " + startA);

        //count element is Happy
        int countHappy = (int) listString.stream().filter(string -> string.equals("Happy")).count();
        System.out.println("Number element = 'Happy' is: " + countHappy);

        //create list 2 have not element null
        List<String> list2 = listString.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("List 2 is: " + list2);
        //output String list3 have lenght of element  >=3 and <= 5
        String list3 = listString.stream().filter(string -> string.length() >= 3 && string.length() <= 6).collect(Collectors.joining(", "));
        System.out.println("List 3 is: " + list3);

        //attach "happy" into each element
        List<String> list4 = listString.stream().map(string->string+"happy").collect(Collectors.toList());
        System.out.println("List 4 is: "+list4);
    }

}
