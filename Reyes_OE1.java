import java.io.*;

public class Reyes_OE1 {

    public static void main(String[] args) throws Exception {

    InputStreamReader a = new InputStreamReader(System.in);
    BufferedReader ab = new BufferedReader(a);

    int nums [] = new int[10];

   
    do{
      //Main Menu

      nums[0] = 10;
      nums[1] = 20;
      nums[2] = 30;
      nums[3] = 40;
      nums[4] = 50;
      nums[5] = 60;
      nums[6] = 70;
      nums[7] = 80;
      nums[8] = 90;
      nums[9] = 100;

      int search_num;
      int delete_num;
      int position = 0;
      
      int length = nums.length;
  
      int menu_input;
      int add_element;
  

      System.out.print("\033[H\033[2J");
      System.out.println("1. Display Original Array Elements");
      System.out.println("2. Add New Element at the End of the Array");
      System.out.println("3. Search an Element in the Array");
      System.out.println("4. Delete an Element in the Array");
      System.out.println("5. Exit");

      System.out.print("\nSelect an Option: ");
      menu_input = Integer.parseInt(ab.readLine());



      switch(menu_input){

        case 1:{

          for(int index = 0; index < nums.length; index++) {
            int num = nums[index];
            System.out.println(num);
          }

          String key;
  
          System.out.print("\nPress any key to continue");
          key = ab.readLine();
          
          break;
        }

        case 2:{

          int n = 10;

          int nums_2 [] =  new int[11];
          nums_2[0] = 10;
          nums_2[1] = 20;
          nums_2[2] = 30;
          nums_2[3] = 40;
          nums_2[4] = 50;
          nums_2[5] = 60;
          nums_2[6] = 70;
          nums_2[7] = 80;
          nums_2[8] = 90;
          nums_2[9] = 100;

          System.out.print("Enter an element to add to the end of the array: ");
          add_element = Integer.parseInt(ab.readLine());
        
          nums_2[n] = add_element;

          System.out.print("\n");

          for(int index = 0; index < nums_2.length; index++) {
            int num = nums_2[index];
            System.out.println(num);
          }

          String key;
  
          System.out.print("\nPress any key to continue");
          key = ab.readLine();

          break;
        }

        case 3:{

          System.out.print("Enter a number to search in the array: ");
          search_num = Integer.parseInt(ab.readLine());

          for (int i = 0; i < length; i++){
              if (nums[i] == search_num){

                position = i;
              }
          }

          System.out.println("The position of the number in the array is : " + position);

          String key;

          System.out.print("\nPress any key to continue");
          key = ab.readLine();
            
          break;
        }

        case 4: {

          System.out.print("Enter the number in the array that you want to delete: ");
          delete_num = Integer.parseInt(ab.readLine());

          
          int delete_position;
         
          //Find position of element to be deleted
          for (int i = 0; i < length; i++){
            if (nums[i] == delete_num){

              position = i;
            }
          }

          // Deleting element
          for (int i = position; i < length - 1; i++){
            nums[i] = nums[i + 1];

          }

          length = length-1;

          for (int i = 0; i < length; i++){
            System.out.print(nums[i] + " ");
          }

          String key;
  
          System.out.print("\nPress any key to continue");
          key = ab.readLine();

          break;
        }

        case 5:{

          System.exit(0);
          break;
        }

      }
    } while(true);
    
  }
}
