import java.io.*;
import java.util.LinkedList;

public class Reyes_OE3 {

    public static void main(String[] args) throws Exception {

        LinkedList<String> words = new LinkedList<String>();
        String getwords;

        
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        //Menu

        do{

            int menu_input;

            System.out.print("\033[H\033[2J");

            System.out.println("1. Enter the 5 Initial Elements for the Linked List");
            System.out.println("2. Add Node at the beginning of the Linked List");
            System.out.println("3. Add Node at the end of the Linked List");
            System.out.println("4. Add Node after the specified Node in the Linked List");
            System.out.println("5. Exit Program");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(ab.readLine());


            switch(menu_input)
            {
                case 1:
                {
                    System.out.println("Enter 5 words to be stored in the Linked List");

                    for (int i = 0; i < 5; i++)
                    {          
                    getwords = ab.readLine();
                    words.add(getwords);
                    }

                    System.out.println("\n");
                    System.out.println(words);

                    promptAndWait();

                    break;
                }

                case 2:
                {
                    String first_word;

                    System.out.println("Enter a word to be add to the beginning of the Linked List");
                    first_word = ab.readLine();

                    words.addFirst(first_word);
                    System.out.println("\n");
                    System.out.println(words);

                    promptAndWait();

                    break;

                }

                case 3:
                {
                    String last_word;

                    System.out.println("Enter a word to be add to the end of the Linked List");
                    last_word = ab.readLine();

                    words.addLast(last_word);

                    System.out.println("\n");
                    System.out.println(words);

                    promptAndWait();

                    break;
                }

                case 4:
                {
                    String specific_word;
                    String specific_node;

                    System.out.println("Enter a word to be add after the specified Node in the Linked List");
                    specific_word = ab.readLine();

                    System.out.println("\n");
                    System.out.println(words);

                    System.out.println("Enter the specific word in the Linked List: ");
                    specific_node = ab.readLine();

                    int node_index =  words.indexOf(specific_node);

                    words.add(node_index+1, specific_word);

                    System.out.println("\n");
                    System.out.println(words);

                    promptAndWait();

                    break;
                    
                }

                case 5:
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
    
}
