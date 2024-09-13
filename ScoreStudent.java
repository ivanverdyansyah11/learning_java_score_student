import java.util.Scanner;

public class ScoreStudent {
    public static void main(String[] args) {
        String serialNumber;
        char result = ' ';
        int score;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your serial number: ");
        serialNumber = input.nextLine();

        System.out.print("Enter your score: ");
        score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.print("Invalid input!");
        } else {
            if (score < 60) {
                result = 'F';
            } else if (score <= 69) {
                result = 'D';
            } else if (score <= 79) {
                result = 'C';
            } else if (score <= 89) {
                result = 'B';
            } else if (score <= 100) {
                result = 'A';
            }

            System.out.println("Serial number: " + serialNumber);
            System.out.println("Your score: " + score + " is " + result);
        }

        input.close();
    }
}