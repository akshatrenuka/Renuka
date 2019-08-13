import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapInJava {
    public static void main(String arg[])
    {
        Scanner userInput = new Scanner(System.in);
        int size;
        Map<String ,Long> myDir = new HashMap<String, Long>();
        for(int i = 0; i< 3 ;i++) {

            System.out.println("Enter Name : ");
            String name = userInput.next();

            System.out.println("Enter phone number :");
            long mobileNo = userInput.nextLong();

            myDir.put(name,mobileNo);
            for(String j : myDir.keySet())
            {
                System.out.println("Name: " + j + " Mobilenumner: " + myDir.get(j));
            }
        }

        System.out.println("Enter name to get the phone number from phone book : ");
        for(int j=0; j<3; j++)

        System.out.println(myDir.get(userInput.next()));
    }

