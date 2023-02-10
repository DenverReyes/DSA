import java.io.*;
import java.util.Arrays;

public class Reyes_Prelim {

    public static void main (String [] args) throws Exception{
       
        String str[] = new String[4];
	    String temp;

        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        do{ 
            int menu_input;

            
            //Main Menus

            System.out.print("\033[H\033[2J");

            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Exit Program");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(ab.readLine());

            switch(menu_input)
            {

                case 1:{

                    System.out.println("Enter the elements of the array: ");  
                    for(int i=0; i<str.length; i++)  
                    {  
                        //reading array elements from the user   
                        str[i]=ab.readLine();
                    }  

                    System.out.print("\033[H\033[2J");

                    System.out.println("Unsorted Array : ");

                    for(int i=0; i<str.length; i++)
                    {
                        System.out.print("["+ str[i]+ "]");
                    }

                    System.out.println("\n");

                    System.out.println("Strings in sorted order using Bubble Sort:");
                    for (int j = 0; j < str.length; j++) {

                        for (int i = j + 1; i < str.length; i++) {
                            // comparing adjacent strings
                            if (str[i].compareTo(str[j]) < 0) {
                                temp = str[j];
                                str[j] = str[i];
                                str[i] = temp;
                            }
                        }

                        System.out.print( "[" + str[j]+ "]");
                        
                    }

                    System.out.println("\n");
                    
                    promptAndWait();
                    break;
                }

                case 2:{

                    System.out.println("Enter the elements of the array: ");  
                    for(int i=0; i<str.length; i++)  
                    {  
                        //reading array elements from the user   
                        str[i]=ab.readLine();
                    }  

                    System.out.print("\033[H\033[2J");

                    System.out.println("Unsorted Array : ");

                    for(int i=0; i<str.length; i++)
                    {
                        System.out.print("[" + str[i]+ "]");
                    }

                    System.out.println("\n");


                    for (int i = 1; i < str.length; i++) 
                    
                    {
                        String key = str[i];
                        int j = i - 1;
                        while (j >= 0 && str[j].compareTo(key) > 0) {
                           str[j + 1] = str[j];
                           j = j - 1;
                        }
                        str[j + 1] = key;

                    }

                    System.out.println("\nSorted String using Insertion sort: ");
                    for (int i = 0; i < str.length; i++) 
                    {
                        System.out.print("[" + str[i] + "]");
                    }

                    System.out.println("\n");

                    
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
