import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
    Scanner inputNumbers=new Scanner(System.in);

    System.out.print("Enter number: ");
    int num1=inputNumbers.nextInt();
    
    System.out.print("Enter number: ");
    int num2=inputNumbers.nextInt();

        System.out.println("Sum is "+(num1+num2));
    }
}
