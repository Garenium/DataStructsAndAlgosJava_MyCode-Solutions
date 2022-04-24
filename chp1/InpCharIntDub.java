import java.io.*;


class InpCharIntDub{

  static BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

  //Everything inside the static mehtod has to be 
  //static (in accordance to the book, getChar() is static) 
  //The code will not compile if inp is not static because static 
  //methods only accept static objects/members/methods
  static String getString() throws IOException{
    String returnString = inp.readLine();
    return returnString;
  }

  public static char getChar() throws IOException{
    String s = getString();
    return s.charAt(0);

  }

  public int getInt() throws IOException{
    String s = getString();  
    return Integer.parseInt(s);
  }

  public double getDouble() throws IOException{
    String s = getString();
    Double aDub = Double.valueOf(s); //Converts to Double type (wrapper)
    return aDub.doubleValue(); //Converts to to double (primitive)
  }

  public float getFloat() throws IOException{
    String s = getString();
    Float aFlo = Float.valueOf(s);
    return aFlo.floatValue();
  }

  public static void main(String[] args) throws IOException{

    System.out.println("getChar()");
    System.out.println("Returns: "+getChar()); 

    System.out.println("getInt()");
    InpCharIntDub ici = new InpCharIntDub();
    System.out.println("Returns: " +ici.getInt());

    System.out.println("getDouble()");
    System.out.println("Returns: " +ici.getDouble());

    System.out.println("getFloat()");
    System.out.println("Returns: " +ici.getFloat());


  }
}
