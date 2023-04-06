import java.io.*;
import java.util.Scanner;

public class Reyes_OE5 {
    public static void main(String[] args) throws Exception {

        int user_MenuInput;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.print("\033[H\033[2J");
            System.out.println("1. Input number");
            System.out.println("2. Exit");
           
            System.out.print("\nSelect an Option: ");
            user_MenuInput = sc.nextInt();

            switch(user_MenuInput)
            {
                case 1:
                {
                    System.out.print("Enter the number of elements: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements: ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }

                    quickSort(arr, 0, n-1);

                    System.out.println("Sorted array: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    promptAndWait();
                    break;
                }

                case 2:
                {
                    System.exit(0);
                    break;
                }


            }

        }while(true);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }
    
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }

    public static void promptAndWait() throws Exception {
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        String key;

        System.out.print("\nPress any key to continue");
        key = ab.readLine();

    }
}



