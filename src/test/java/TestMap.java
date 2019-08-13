import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap {


    public static void main(String args[]) {
        Scanner dir = new Scanner(System.in);


        System.out.println("Enter sizeo of phone directory");
        int size = dir.nextInt();

        Map<String, Long> dir1 = new HashMap<String, Long>();

        for (int i = 0; i < size; i++) {


            System.out.println("Enter name");
            String name = dir.next();

            System.out.println("Enter phone number");
            long phonenumber = dir.nextLong();


            dir1.put(name, phonenumber);

            for (String j : dir1.keySet()) {
                System.out.println("Name: " + j + " " + "Phonenumber:" + dir1.get(j));

                System.out.print("Enter user name to get mobile number");

                System.out.print(dir1.get(dir.next()));
            }


        }


    }
}

