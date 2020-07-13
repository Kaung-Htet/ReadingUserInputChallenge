import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //check if user input valid number or not
        boolean hasNextInt = scanner.hasNextInt();

        //to count number
        int count = 1;

        //to sum user input numbers
        int sum = 0;

        if (hasNextInt){
            while (count <= 10){
                System.out.println("Enter number #" + count);
                int userInput = scanner.nextInt();
                sum += userInput;
                count++;
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
