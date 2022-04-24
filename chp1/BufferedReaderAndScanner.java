import java.util.*;
import java.io.*;

class BufferedReaderAndScanner{
  public static void main(String[] args) throws IOException{

    //Difference?
    //Scanner PARSES (by using regex) input data, BufferedReader does NOT

    System.out.println("With Scanner");
     Scanner inp = new Scanner(System.in);

     //Scanner uses rexp to tell datatypes apart
     //On line 14, Scanner knows when to "stop" when it sees a non-integer character. System.in will continue having input until the next() method is called
     System.out.println("Enter a integer");
     int a = inp.nextInt();

     System.out.println("Enter a string");
     String b = inp.nextLine();

      System.out.println("You have entered: " + a + " and name " + b);

      /////////////////////////////

    System.out.println("With BufferedReader");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //A runtime error will appear if the user types a non-integer character in System.in
    System.out.println("Enter an integer");
    a = Integer.parseInt(br.readLine());

    System.out.println("Enter a string");
    b = br.readLine();

     System.out.println("You have entered: " + a + " and name " + b);
  }
}
