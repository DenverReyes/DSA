import java.io.*;

public class Reyes_OE2 {

    public static void main (String [] args) throws Exception{
       
        int length;
        int iterationCounter = 1;
    
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        do{ 
            int menu_input;


            System.out.print("\033[H\033[2J");
            System.out.print("Enter the size of the array: ");
            length = Integer.parseInt(ab.readLine());

            int[] nums = new int [length];


            System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<length; i++)  
            {  
                //reading array elements from the user   
                nums[i]=Integer.parseInt(ab.readLine()); 
            }  
            
            //Main Menus

            System.out.println("1. Insertion Sort");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Exit Program");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(ab.readLine());

            switch(menu_input)
            {

                case 1:{

                    for (int i = 1; i < length; ++i) 
                    {
                        int key = nums[i];
                        int j = i - 1;
             
                        /* Move elements of arr[0..i-1], that are
                           greater than key, to one position ahead
                           of their current position */
                        while (j >= 0 && nums[j] > key) 
                        {
                            nums[j + 1] = nums[j];
                            j = j - 1;
                        }
                        nums[j + 1] = key;

                        System.out.print("\nIteration No." +(i+1)+ " ->  ");
                        for(j=0; j<length; j++)
                        {
                           System.out.print(nums[j]+ " ");
                        }
                    }
                    

                    System.out.println("\nFinal sorted array is:");
                    for(int i=0; i<length; i++)
                    {
                        System.out.print(nums[i]+ " ");
                    }

                    promptAndWait();
                    break;
                }

                case 2:{

                    for(int i=0; i<(length-1); i++)
                    {
                       for(int j=0; j<(length-i-1); j++)
                       {
                          if(nums[j]>nums[j+1])
                          {
                             int temp = nums[j];
                             nums[j] = nums[j+1];
                             nums[j+1] = temp;
                          }
                       }
                       System.out.print("\nIteration No." +(i+1)+ " ->  ");
                       for(int j=0; j<length; j++)
                       {
                          System.out.print(nums[j]+ " ");
                       }

                       
                    }

                    System.out.println("\nFinal sorted array is:");
                    for(int i=0; i<length; i++)
                    {
                        System.out.print(nums[i]+ " ");
                    }

                    promptAndWait();
                    break;
                }

                case 3:{
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
}
