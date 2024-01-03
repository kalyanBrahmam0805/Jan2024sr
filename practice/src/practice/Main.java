package practice;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int p = scanner.nextInt(); // Total score for a participant
            int result = findProblemsSolved(p);
            System.out.println(result);
        }
    }

    static int findProblemsSolved(int totalScore) {
        for (int x = 0; x <= 1000; x++) {
            for (int y = 0; y <= 1000; y++) {
                if (11 * x + 100100 * y == totalScore) {
                    return x + y;
                }
            }
        }
        return -1;
    }
}
