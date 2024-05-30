import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berapa data array: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai data: ");
            numbers[i] = input.nextInt();
        }

        while (true) {
            System.out.println("1. Mean\n2. Median\n3. Exit");
            System.out.print("Masukkan pilihan:");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    double mean = findMean(numbers);
                    System.out.println("Mean: " + mean);
                    break;
                case 2:
                    double median = findMedian(numbers);
                    System.out.println("Median: " + median);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Menu not found");

            }
            System.out.println();
        }
    }

    public static double findMedian(int[] numbers) {
        Arrays.sort(numbers);

        int n = numbers.length;

        if (n % 2 != 0) {
            return numbers[n / 2];
        } else {
            return (numbers[(n / 2) - 1] + numbers[n / 2]) / 2.0;
        }
    }

    public static double findMean(int[] numbers) {
        double total = 0;
        double xi = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        xi = total / numbers.length;

        return xi;
    }

}
