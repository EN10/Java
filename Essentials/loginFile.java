// Enio's Code
import java.io.*;   // imports File & FileWriter 
import java.util.*; // imports Scanner

class loginFile{
    public static void main(String[] args)throws IOException{
        System.out.println("Welcome to the login system");
        Scanner s = new Scanner(new File("password.txt"));
        String filePassword = s.nextLine();     // next reads a single string

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter your password");
            String password = System.console().readLine();

            if (password.equals(filePassword)){
                System.out.println("Welcome to the system");
                System.out.println("Would you like to change password: y/n ?");
                String change = System.console().readLine();

                if (change.equals("y")){
                    System.out.println("New Password: ");
                    String newPassword = System.console().readLine();

                    FileWriter fw = new FileWriter("password.txt");
                    fw.write(newPassword);
                    fw.close();
                    System.out.println("Password Updated!");
                }
                break;
                
            } else {
                System.out.println("ERROR: password not recognised");
                System.out.println(2-i + " attempts left");
            }
        }
    }
}
