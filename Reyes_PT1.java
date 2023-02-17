import java.io.*;

public class Reyes_PT1 {

    public static void main (String[] args) throws Exception {

        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        //Menu

        do{

            int menu_input;

            System.out.print("\033[H\033[2J");

            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Exit Program");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(ab.readLine());

            switch(menu_input){

                case 1:
                
                {
                    //Get User Input

                    int nums [] = new int [5];

                    System.out.println("Enter 5 elements of the array: ");
                    for (int i = 0; i < nums.length; i++) {
                        // reading array elements from the user
                        nums[i] = Integer.parseInt(ab.readLine());
                    }

                    //define a stack object
                    Stack stck = new Stack();
                    System.out.println("Initial Stack Empty : " + stck.isEmpty());

                    //push elements
                    stck.push(nums[0]);
                    stck.push(nums[1]);
                    stck.push(nums[2]);
                    stck.push(nums[3]);
                    stck.push(nums[4]);
                    System.out.println("After Push Operation...");

                    //print the elements
                    System.out.println("Element at the top of the stack " + stck.peek());
                    stck.display();
                    promptAndWait();

                    //pop two elements from stack
                    stck.pop();
                    stck.pop();
                    System.out.println("\nAfter Pop Operation...");
                    
                    //print the stack again
                    stck.display();

                    promptAndWait();

                    break;
                }

                case 2:
                {
                    //Get User Input

                    int nums [] = new int [4];

                    System.out.println("Enter 4 elements of the array: ");
                    for (int i = 0; i < nums.length; i++) {
                        // reading array elements from the user
                        nums[i] = Integer.parseInt(ab.readLine());
                    }

                    // Create a queue of capacity 4 
                    Queue q = new Queue(4); 
            
                    System.out.println("Initial Queue:");
                     // print Queue elements 
                    q.queueDisplay(); 
            
                    // inserting elements in the queue 
                    q.queueEnqueue(nums[0]); 
                    q.queueEnqueue(nums[1]); 
                    q.queueEnqueue(nums[2]); 
                    q.queueEnqueue(nums[3]); 
            
                    // print Queue elements 
                    System.out.println("Queue after Enqueue Operation:");
                    q.queueDisplay(); 
            
                    // print front of the queue 
                    q.queueFront(); 
                    
                    // insert element in the queue 
                    q.queueEnqueue(90); 
            
                    // print Queue elements 
                    q.queueDisplay(); 
            
                    q.queueDequeue(); 
                    q.queueDequeue(); 
                    System.out.printf("\nQueue after two dequeue operations:"); 
            
                    // print Queue elements 
                    q.queueDisplay(); 
            
                    // print front of the queue 
                    q.queueFront(); 

                    promptAndWait();

                    break;

                }

                case 3:
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

    //Stack class
    public static class Stack {  
    int top;            //define top of stack
    int maxsize = 5;    //max size of the stack  
    int[] stack_arry = new int[maxsize];  //define array that will hold stack elements
    
        Stack()
        {            //stack constructor; initially top = -1
            top = -1;  
        }    

        boolean isEmpty()
        {          //isEmpty () method
            return (top < 0);  
        }  

        boolean push (int val)
        {     //push () method  
                if(top == maxsize-1) 
                {  
                    System.out.println("Stack Overflow !!");  
                    return false;  
                }  
                else 
                 {  
                    top++;  
                    stack_arry[top]=val;  
                    return true;  
                }  
            }  

        boolean pop () 
        {            //pop () method
            if (top == -1) 
            {  
                System.out.println("Stack Underflow !!");  
                return false;  
            }  
            else   
            {  
                
                System.out.println("\nItem popped: " + stack_arry[top--]);  
                return true;  
            }  
        }  

        int peek()
        {
            return stack_arry[top];
        }

        void display () 
        {           //print the stack elements  
            System.out.println("Printing stack elements .....");  
            for(int i = top; i>=0;i--) 
            {  
                System.out.print(stack_arry[i] + " ");  
            }  
         }  

    }  

    //Queue class
    public static class Queue { 
        private static int front, rear, capacity; 
        private static int queue[]; 
       
        Queue(int size) { 
            front = rear = 0; 
            capacity = size; 
            queue = new int[capacity]; 
        } 
       
        // insert an element into the queue
        static void queueEnqueue(int item)  { 
            // check if the queue is full
            if (capacity == rear) { 
                System.out.printf("\nQueue is full\n"); 
                return; 
            } 
       
            // insert element at the rear 
            else { 
                queue[rear] = item; 
                rear++; 
            } 
            return; 
        } 
       
        //remove an element from the queue
        static void queueDequeue()  { 
            // check if queue is empty 
            if (front == rear) { 
                System.out.printf("\nQueue is empty\n"); 
                return; 
            } 
       
            // shift elements to the right by one place uptil rear 
            else { 
                for (int i = 0; i < rear - 1; i++) { 
                    queue[i] = queue[i + 1]; 
                } 
       
           
          // set queue[rear] to 0
                if (rear < capacity) 
                    queue[rear] = 0; 
       
                // decrement rear 
                rear--; 
            } 
            return; 
        } 
       
        // print queue elements 
        static void queueDisplay() 
        { 
            int i; 
            if (front == rear) { 
                System.out.printf("Queue is Empty\n"); 
                return; 
            } 
       
            // traverse front to rear and print elements 
            for (i = front; i < rear; i++) { 
                System.out.printf(" %d = ", queue[i]); 
            } 
            return; 
        } 
       
        // print front of queue 
        static void queueFront() 
        { 
            if (front == rear) { 
                System.out.printf("Queue is Empty\n"); 
                return; 
            } 
            System.out.printf("\nFront Element of the queue: %d", queue[front]); 
            return; 
        } 
    } 

}
