import java.io.*;
import java.util.*;

public class BracketsBR{
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        String line = "";
        String OPEN =  "{[(<";
        String CLOSE = "}])>";
        Stack stack = new Stack();
        String popTemp = "";

        try {
            inputStream = new BufferedReader(new FileReader("HelloWorld.java"));            
            while ((line = inputStream.readLine()) != null){
                for(int i=0; i<line.length(); i++) {
                    if (OPEN.indexOf(line.charAt(i)) != -1)
                    {   // System.out.print(line.charAt(i));
                        stack.push(line.charAt(i));
                    }
                    if (CLOSE.indexOf(line.charAt(i)) != -1)
                    {   popTemp = stack.pop().toString();
                        // System.out.print(line.charAt(i));
                        // System.out.print(popTemp);
                        if (OPEN.indexOf(popTemp) == CLOSE.indexOf(line.charAt(i)))
                        {   System.out.print("Match");
                            System.out.print(popTemp);
                            System.out.println(line.charAt(i));
                        }
                        else
                        {   System.out.print("Error");  
                            System.out.print(popTemp);
                            System.out.println(line.charAt(i));
                        }
                    }
                }
            }
        }   finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}