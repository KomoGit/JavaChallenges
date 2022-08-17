import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static boolean inputTaken = false;
    private static final String criteria = "Your password should contain : \nUppercase Letter(s)" +
            "\nLowercase letter(s)" +
            "\nNumber(s)" +
            "\nSpecial Character(s)" +
            "\nAnd should be 8 units long.";

    public static void main(String[] args) {
        while (!inputTaken){
            insertPassword();
        }
    }
    private static void insertPassword(){
        System.out.println("Please enter your password: " + criteria);
        String userInput = sc.nextLine();
        if(!userInput.equals("")){
            inputTaken = true;
            ConventionCheck(checkString(userInput));
        }
    }
    private static boolean checkString(String str) {
        char ch;
        int length = str.length();
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean lengthFlag = false;

        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            if (length >= 16 ) {
                lengthFlag = true;
            }
            if(numberFlag && capitalFlag && lowerCaseFlag && lengthFlag && specialCharacterFlag(str))
                return true;
        }
        return false;
    }
    public static boolean specialCharacterFlag(String str){
        if(str != null){
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher hasSpecial = special.matcher(str);
            return hasSpecial.find();
        }else{
            return false;
        }
    }
    private static void ConventionCheck(boolean con){
        if(con){
            System.out.println("Password is set");
        }
        else {
            System.out.println("Your password doesn't meet the criteria!");
            insertPassword();
        }
    }
}