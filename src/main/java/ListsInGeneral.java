import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsInGeneral {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size greater than 0 : ");

        int size;

        do {
            size = scanner.nextInt();
        }
        while (!(size < 7) || !(size > 0));

        int[] vars = new int[size]; // Initialization of array "int[] vars"
        System.out.println("list size is set to  : " + vars.length);

        for (int i = 0; i < vars.length; i++) {
            vars[i] = scanner.nextInt();
        }

        List<Integer> integer = new ArrayList<Integer>();
        for (Integer x : vars) {                                       //for (type variable : arrayname) {}


            integer.add(x);

        }

        integer.set(4, 5);
        System.out.println(" ");

        for (int i = 0; i < integer.size(); i++) {


            System.out.print(integer.get(i) + " ");
        }

        for (int i = 0; i < integer.size(); i++) {
            System.out.println(integer.get(i));


        }


    }
}






