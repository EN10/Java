import java.io.*;
class fileWrite{

    public static void main(String args[])throws IOException{
            FileWriter out = new FileWriter("file.txt");
            out.write("text to file");
            out.close();
    }

}
//https://www.tutorialspoint.com/java/java_files_io.htm
