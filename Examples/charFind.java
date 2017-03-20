public class charFind{

    public static void main(String[] args){
    try {
        for (int i=0; i < args[0].length(); i++) {
            if (args[0].charAt(i) == args[1].charAt(0))
            {   System.out.println("Match found at : " + i);   }
            else
            {   System.out.println("No Match at : " + i);   }
        }
    }
    catch (IndexOutOfBoundsException e) 
    {   System.out.println("No args!");     }
    }
}