import java.io.*;
import java.util.*;

public class BracketsS{
    public static void main(String[] args) throws IOException {

        Scanner scanner = null;
        String word = "";
        String OPEN =  "{[(<";
        String CLOSE = "}])>";
        Stack stack = new Stack();
        String popTemp = "";

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("HelloWorld.java")));    
            while (scanner.hasNext()){
                word = scanner.next();
                for(int i=0; i<word.length(); i++) {
                    if (OPEN.indexOf(word.charAt(i)) != -1)
                    {   // System.out.print(word.charAt(i));
                        stack.push(word.charAt(i));
                    }
                    if (CLOSE.indexOf(word.charAt(i)) != -1)
                    {   popTemp = stack.pop().toString();
                        // System.out.print(word.charAt(i));
                        // System.out.print(popTemp);
                        if (OPEN.indexOf(popTemp) == CLOSE.indexOf(word.charAt(i)))
                        {   System.out.print("Match");
                            System.out.print(popTemp);
                            System.out.println(word.charAt(i));
                        }
                        else
                        {   System.out.print("Error");  
                            System.out.print(popTemp);
                            System.out.println(word.charAt(i));
                        }
                    }
                }
            }
        }   finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}