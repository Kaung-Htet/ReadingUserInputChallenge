import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //to count number
        int count = 1;

        //to sum user input numbers
        int sum = 0;

        while (count <= 10) {

            System.out.println("Enter number #" + count + ":");

            //check if user input valid number or not
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int userInput = scanner.nextInt();
                //sum valid user input numbers
                sum += userInput;
                //count valid user input
                count++;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); //handle end of line (Enter key)
        }
        scanner.close();
        System.out.println("Total sum numbers = " + sum);
    }
}
