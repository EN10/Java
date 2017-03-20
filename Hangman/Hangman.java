import java.io.*;
import java.util.*;

public class Hangman{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int length = 0;
        do {
            System.out.println("Please enter a value for word length between 2-29");
            length = s.nextInt();
        } while(length < 2 || length >29);
        
        int guesses = 0;
        do {
            System.out.println("Please enter a value for your number of guesses: ");
            guesses = s.nextInt();
        } while(guesses < 1);
        
        ArrayList<String> dictionary = new ArrayList<String>();
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("dictionary.txt"));
            String line;
            while ((line = inputStream.readLine()) != null)
            {   if (line.length() == length) dictionary.add(line);   }
            System.out.println(dictionary.size());
        }
        catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
        
        String guesslist = "";
        String input = "";
        do {
            do {
            System.out.println("Input your single lowercase letter guess");
            input = s.next();
            input = input.toLowerCase();
            } while(input.length() != 1 || (int)input.charAt(0) < 97 || (int)input.charAt(0) > 122);
            
            System.out.println((int)input.charAt(0));
            guesses --;
            System.out.println(guesses + " Guess Left");
        } while(guesses > 0);
        
    }
}
/*
Step 5.4 
int with int without
check each word has char input
if yes increment with
if no incement without
at end of list return larger list
*/