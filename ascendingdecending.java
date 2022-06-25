package functions.Arrays;

import java.util.Scanner;

public class ascendingdecending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // taking input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();

        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                System.out.println("descending order");
            } else {
                System.out.println("ascending order");
            }

        }
        

    }
}
