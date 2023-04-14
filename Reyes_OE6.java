import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Reyes_OE6 {

    public static final int INSERTION_THRESHOLD = 10;

    public static void main(String[] args) throws Exception {

        int user_MenuInput;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.print("\033[H\033[2J");
            System.out.println("1. Hybrid Quicksort");
            System.out.println("2. Exit");
           
            System.out.print("\nSelect an Option: ");
            user_MenuInput = sc.nextInt();

            switch(user_MenuInput)
            {
                case 1:
                {

                    Scanner scanner = new Scanner(System.in);
        
                    System.out.println("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    
                    int[] arr = new int[n];
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    
                    // Uncomment the following lines to generate a random input
                    /*Random random = new Random();
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = random.nextInt(100);
                    }*/
                    
                    System.out.println("Original array:");
                    printArray(arr);
                    
                    quicksort(arr, 0, n-1);
                    
                    System.out.println("Sorted array:");
                    printArray(arr);
                    
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

    public static void promptAndWait() throws Exception {
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        String key;

        System.out.print("\nPress any key to continue");
        key = ab.readLine();

    }

    private static void quicksort(int[] arr, int left, int right) {
        if (right - left < INSERTION_THRESHOLD) {
            insertionSort(arr, left, right);
        } else {
            int pivotIndex = partition(arr, left, right);
            quicksort(arr, left, pivotIndex-1);
            quicksort(arr, pivotIndex+1, right);
        }
    }
    
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    
    private static void insertionSort(int[] arr, int left, int right) {
        for (int i = left+1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
