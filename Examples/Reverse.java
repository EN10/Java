public class Reverse{

    public static void main(String[] args){
    try {
            for (int i = args[0].length()-1; i >= 0; i--) {
            System.out.print(args[0].charAt(i));
            }
            System.out.println();
        }
    catch (IndexOutOfBoundsException e) {
        System.out.println("No args!");
        }
    }
}