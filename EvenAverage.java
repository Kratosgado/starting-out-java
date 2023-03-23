import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {
        int[] k = new int[20];
        Scanner read = new Scanner(System.in);

        int sum = 0; int prev_num = 0;

        System.out.println("Starting even numbers collection starting from 2");

        for (int i = 0; i < k.length; i++) {
            if (i < 10) {
                do {
                    System.out.print("Enter the least even number greater than "+ prev_num + ": ");
                    k[i] = read.nextInt();
                } while ((k[i]-2) != prev_num);
                System.out.println("entery received...");
                prev_num = k[i];
                sum += k[i];
            }
        }
        double average = sum/10.0;
        System.out.println("average = " + average);
    }
}
