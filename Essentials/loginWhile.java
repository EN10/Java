class loginWhile{
    public static void main(String[] args){
        System.out.println("Welcome to the login system");

        while(true){
            System.out.println("Please enter your password");
            String password = System.console().readLine();
            
            if (password.equals("1234")){
                System.out.println("Welcome to the system");
                break;
            } else {
                System.out.println("ERROR: password not recognised");
            }
        }
    }
}
