import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestList {


    public static  void main(String args[]) {
        System.out.println("enter a number");

        Scanner userInput = new Scanner(System.in);
        int size;
        do {
            size = userInput.nextInt();

        }
        while (!(size > 0) || !(size < 5));


        int[] vars = new int[size];
        System.out.println("List size is set to :" + vars.length);

        for (int i = 0; i < vars.length; i++) {
            vars[i] = userInput.nextInt();

        }

        List<Integer> integers = new ArrayList<Integer>();
        for (int x : vars) {
            integers.add(x);
        }
        integers.set(2, 5);

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("List is " + integers.get(i));
        }
    }










    }


