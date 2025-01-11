import com.sun.source.tree.ContinueTree;

import java.sql.SQLSyntaxErrorException;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double getTax(int income) {
        double tax;
        if (income > 100000) {
            tax = 0.3d;
        } else if (income > 60000) {
            tax = 0.15d;
        } else {
            tax = 0;
        }
        return income * tax;
    }

    public static void main(String[] args) {
        System.out.printf("Hello World");

        //try catch and get input
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your name");
            String b = scanner.next();
            System.out.println("enter your age");
            int a = scanner.nextInt();
            System.out.println("your name is " + b + ". you are " + a);
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        //String and string builder
        String a = "Hello World";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        String b = "            ";
        System.out.println(b.isBlank());
        System.out.println(b.isEmpty());

        StringBuilder c = new StringBuilder();
        c.append("a");
        c.append("b");
        c.append("c");
        System.out.println(c + "e");

        //array
        List<Integer> incomeList = new ArrayList<Integer>(List.of(100000, 70000, 20000));

        List<Double> taxList = incomeList.stream().map(income -> getTax(income)).collect(Collectors.toList()); //mutable
//        List<Double> taxList = incomeList.stream().map(income -> getTax(income)).toList(); //immutable
        System.out.println(taxList);

        int array[] = {1, 3, 5, 6, 34, 3, 3, 6, 7, 773, 1, 1};
//        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));

        // loop
        for (int i = 1; i <= 5; i++) {
            if (i == 4) continue;
            System.out.println("i = " + i);
        }

        int count = 0;
        while (count < 5) {
            System.out.println(count);
            if (count == 3) break;
            count++;
        }
    }

}