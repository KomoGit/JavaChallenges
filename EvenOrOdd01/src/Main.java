import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = sc.nextInt();
        ReturnAnswer(evenOrOdd(userInput));
    }

    private static boolean evenOrOdd(int userInput){
        int result = userInput % 2;
        return result == 0;
    }
    private static void ReturnAnswer(boolean evenOrOdd){
        if(evenOrOdd){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number isn't even");
        }
    }
}