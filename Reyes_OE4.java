import java.io.*;


public class Reyes_OE4 {
    
    public static void main(String[] args) throws Exception {

        
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        int menu_input;

        do{

            System.out.print("\033[H\033[2J");

            System.out.println("1. Fibonacci Series Number");
            System.out.println("2. Factorial of a Number");
            System.out.println("3. Reverse a Number");
            System.out.println("4. Reverse a Word");
            System.out.println("5. Tower of Hanoi");
            System.out.println("6. Exit Program");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(ab.readLine());

            switch(menu_input){

                case 1:
                {
                    System.out.println("\nFibonacci Series Number");
                    System.out.print("Enter the number of Fibonacci numbers to generate: ");
                    int count = Integer.parseInt(ab.readLine());

                    System.out.print("Fibonacci Series of " + count + " numbers: ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(fibonacci(i) + " ");
                    }

                    promptAndWait();
                    break;
                }

                case 2:
                {
                    System.out.println("\nFactorial of a Number");
                    System.out.print("Enter a non-negative integer: ");
                    int n = Integer.parseInt(ab.readLine());
                    
                    if (n < 0) {
                        System.out.println("Error: Invalid input. Please enter a non-negative integer.");
                        return;
                    }
            
                    int result = factorial(n);
                    System.out.println(n + "! = " + result);

                    promptAndWait();
                    break;
                }

                case 3:
                {
                    System.out.println("\nReverse a Number");
                    System.out.print("Enter a positive integer: ");
                    int n = Integer.parseInt(ab.readLine());

                                
                    if (n < 0) {
                        System.out.println("Error: Invalid input. Please enter a positive integer.");
                        return;
                    }

                    int result = reverse(n);
                    System.out.println("The reverse of " + n + " is " + result);

                    promptAndWait();
                    break;
                }

                case 4:
                {
                    System.out.println("\nReverse a Word");
                    System.out.print("Enter a word: ");
                    String word = ab.readLine();

                    String reversedWord = reverse(word);
                    System.out.println("The reverse of " + word + " is " + reversedWord);

                    promptAndWait();
                    break;
                }

                case 5:
                {
                    System.out.println("\nTower of Hanoi");
                    System.out.print("Enter the number of disks: ");
                    int n = Integer.parseInt(ab.readLine());

                    if (n < 1) {
                        System.out.println("Error: Invalid input. Please enter a positive integer.");
                        return;
                    }

                    System.out.println("Steps to solve the Tower of Hanoi puzzle:");
                    solve(n, 'A', 'C', 'B');

                    promptAndWait();
                    break;
                }

                case 6:
                {
                    System.exit(0);
                    break;
                }
            }

        }while(true);


    }

    public static void promptAndWait() throws Exception {
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        String key;

        System.out.print("\nPress any key to continue");
        key = ab.readLine();

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        int lastDigit = n % 10;
        int remainingDigits = n / 10;
        int reversedRemainingDigits = reverse(remainingDigits);
        return lastDigit * (int) Math.pow(10, (int) Math.log10(reversedRemainingDigits) + 1) + reversedRemainingDigits;
    }

    public static String reverse(String word) {
        if (word.length() == 1) {
            return word;
        }
        return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
    }

    public static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);
            return;
        }
        solve(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        solve(n-1, aux, to, from);
    }
  
}
