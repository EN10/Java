import java.io.*;

public class readline{
    public static void main(String[] args) {
        Console c = System.console();
        String line = c.readLine;
        System.out.println(line);
    }
}

/*
https://docs.oracle.com/javase/tutorial/essential/io/cl.html

can use c.readPassword()
*/