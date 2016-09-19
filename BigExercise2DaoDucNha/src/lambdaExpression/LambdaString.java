/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author NHA
 */
public class LambdaString {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("Apple");
        listString.add("Google");
        listString.add("Facebook");
        listString.add("Yahoo");
        
        System.out.println("Sort By Alphabet");
        sortByAlphabet(listString);
        System.out.println("===========================");
        System.out.println("Sort by short to long");
        sortShortToLong(listString);
        System.out.println("===========================");
        System.out.println("Sort by long to short");
        sortLongToShort(listString);
    }
    
    public static void sortByAlphabet(List<String> lstString) {        
        Collections.sort(lstString);
        lstString.stream().forEach(s->System.out.println(s));
    }
    
    public static void sortLongToShort(List<String> lstString) {
        Collections.sort(lstString, (o1,o2)->Integer.compare(o2.length(), o1.length()));
        lstString.stream().forEach(s->System.out.println(s));
    }
    
    public static void sortShortToLong(List<String> lstString) {
        Collections.sort(lstString, (o1,o2)->Integer.compare(o1.length(), o2.length()));
        lstString.stream().forEach(s->System.out.println(s));
    }
}
