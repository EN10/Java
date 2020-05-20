import java.io.*;
import java.util.*;

public class scan{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("readline.java"));
        String line = s.next();
        System.out.println(line);
    }
}
/*
https://docs.oracle.com/javase/tutorial/essential/io/scanning.html

scanner can read datatypes E.G. s.nextInt()
white space delimited
*/
