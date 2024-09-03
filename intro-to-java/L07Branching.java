import java.util.Scanner;

public class L07Branching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println("Password = " + password);

        if (password.equals("snow white")){
            System.out.println("User has logged in successfully.");
        } else{
            System.out.println("Invalid password");
        }
    }
}
