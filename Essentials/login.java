class login{
    public static void main(String[] args){
       System.out.println("Welcome to the login system");
       System.out.println("Please enter your password");
       String password = System.console().readLine();
            
        if (password.equals("1234")){
            System.out.println("Welcome to the system");
        } else {
            System.out.println("ERROR: password not recognised");
        }
    }
}
