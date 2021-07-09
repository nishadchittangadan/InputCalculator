
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 0;
        int avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        while (true) {
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int value = sc.nextInt();
                sum += value;
                count++;
            } else {
                if (count == 0){
                    System.out.println("SUM = 0 AVG = 0");
                } else {
                    avg = sum/count;
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                }
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}