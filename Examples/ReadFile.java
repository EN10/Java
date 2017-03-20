import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("HelloWorld.java"));
            String line;
            while ((line = inputStream.readLine()) != null)
            {   System.out.println(line);   }
        }
        catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }
}