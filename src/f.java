import java.util.Scanner;

class f {
    public static void main(String[] args) {

        /*************************************************************
         Note: Start your count variable at 0 and make your max
         times 10 to get the same result. In coding, counters usually
         start at 0. We'll go more into that when we cover arrays later.
         ***************************************************************/

  /*
  Use a DO WHILE LOOP for the question below. If you like, limit
  how many times you can print to the console with an IF ELSE STATEMENT or WHILE LOOP.
  */

        int count = 0;
        int maxTimes = 10;
        Scanner scanner = new Scanner(System.in);
        int userInput;

        // With a DO WHILE LOOP the code will run at least once before it test the condition
        do {

            // Ask user to provide input based on question.
            System.out.println("How many times has this printed?");
            count++;
        }
        while (count < maxTimes);

        // Get user input
        userInput = scanner.nextInt();

        // Test answer
        if (userInput == maxTimes) {
            System.out.println("Correct. This will print " + userInput + " times.");
        }
        else {
            System.out.println("Not correct. Check your max times.");
        }

        // Close scanner
        scanner.close();
    }
}
