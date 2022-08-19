import java.util.Scanner;

public class Main {
    public static double calculateWaterBill(double gallonsUsage) {
        final int CCFToGallon = 748;
        final double priceOfCCF = 9.42;
        final double CCFTax = 3.90;
        int currentCCF = (int) gallonsUsage / CCFToGallon;

        if(currentCCF >= 2){
            return currentCCF * priceOfCCF + CCFTax;
        }
        else{
            return currentCCF * priceOfCCF;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water " +
                "did you use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
    }
}