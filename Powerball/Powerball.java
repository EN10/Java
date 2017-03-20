import java.util.*;

public class Powerball{
    TreeSet whiteballs;
    int pb;
    
    public Powerball(){
        whiteballs = new TreeSet();
        Random rand = new Random();
    
        while (whiteballs.size() < 5)
        {   whiteballs.add(rand.nextInt(69) + 1);   }
            pb = rand.nextInt(26) + 1;
    }
    
    public String toString(){
        return whiteballs.toString() + "+" + pb;
    }
    
    public boolean equals(Powerball match){
        return this.toString().equals(match.toString());
    }
    
    public static void main(String[] args) {
        Powerball foo = new Powerball();
        Powerball bar = new Powerball();
        System.out.println(foo.toString());
        System.out.println(foo.equals(foo));
    }
}