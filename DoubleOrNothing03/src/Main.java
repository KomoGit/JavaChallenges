import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int userPoints = 10;
    public static void main(String[] args) {
        while (userPoints!=0){
            GameLoop();
        }
    }
    private static void GameLoop(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wanna take a chance to see if you can double it?");
        System.out.println("Press A To Play, Press any other button to wuss out.");
        String userInput = sc.nextLine();
        if(userInput.equals("A")){
            DoubleOrNothing();
        }
        else{
            System.out.println("You left the game with "+ userPoints);
            userPoints = 0;
        }
    }
    private static void DoubleOrNothing(){
        Random random = new Random();
        int ranGen = random.nextInt(2);
        switch (ranGen){
            case 0:
                userPoints = userPoints * 2;
                System.out.println("You won, and currently have " + userPoints);
                break;
            case 1:
                userPoints = 0;
                System.out.println("You lost everything.");
                break;
        }
    }
}