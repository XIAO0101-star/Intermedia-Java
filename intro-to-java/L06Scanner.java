import java.util.Scanner;

public class L06Scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Enter your weight (in kg): ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height (in m): ");
        double height = sc.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("Your BMI is " + BMI);
    }
}
