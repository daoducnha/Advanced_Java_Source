package lambdaExpression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 19-9-2016 Class LambdaString to sort list String
 */
public class LambdaString {

    public static void main(String[] args) throws IOException, NumberFormatException {
        List<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("Apple");
        listString.add("Google");
        listString.add("Facebook");
        listString.add("Yahoo");
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            boolean flag = true;
            while (flag == true) {
                System.out.println("1. Sort By Alphabet: ");
                System.out.println("2. Sort by length string short to long: ");
                System.out.println("3. Sort by length string long to short: ");
                System.out.println("4. Exit");
                System.out.println("Input your choise: ");
                int choise = Integer.parseInt(input.readLine());
                switch (choise) {
                    case 1:
                        //sort list string by Alphabet
                        System.out.println("Sort By Alphabet");
                        sortByAlphabet(listString);
                        System.out.println("=========================");
                        break;
                    case 2:
                        //sort list string by Long To Short
                        System.out.println("Sort by short to long");
                        sortShortToLong(listString);
                        System.out.println("=========================");
                        break;
                    case 3:
                        //sort list string Short by To Long 
                        System.out.println("Sort by long to short");
                        sortLongToShort(listString);
                        System.out.println("=========================");
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("Choise wrong");

                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    //sort list string by Alphabet
    public static void sortByAlphabet(List<String> lstString) {
        Collections.sort(lstString);
        lstString.stream().forEach(s -> System.out.println(s));
    }

    //sort list string by Long To Short
    public static void sortLongToShort(List<String> lstString) {
        Collections.sort(lstString, (o1, o2) -> Integer.compare(o2.length(), o1.length()));
        lstString.stream().forEach(s -> System.out.println(s));
    }

    //sort list string Short by To Long 
    public static void sortShortToLong(List<String> lstString) {
        Collections.sort(lstString, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        lstString.stream().forEach(s -> System.out.println(s));
    }
}
