// Your name
// This program will calculate the date easter falls on given a year after 1583.
import java.util.*;
public class Easter{
    public static void main(String[] args) {
        //code goes  k m mj      
        Scanner scanner = new Scanner(System.in); //this allows you to read input from the user.
        int y = scanner.nextInt(); // reads the next number the user types. 
        int a = y % 19;
        int b = y /100;
        
        System.out.println("a = "+a);

    }
}
