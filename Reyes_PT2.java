import java.io.*;

public class Reyes_PT2 {

    public static void main(String[] args) throws Exception {

        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);
        Reyes_PT2 list = new Reyes_PT2();

        int menu_input;

        do{

            System.out.print("\033[H\033[2J");

            System.out.println("1. Insert(Create)");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(ab.readLine());

            switch(menu_input){

                case 1:
                {
                    
                    System.out.print("Enter the number of elements: ");
                    int n = Integer.parseInt(ab.readLine());
                    

                    System.out.println("Enter the elements:");
                    for (int i = 0; i < n; i++) {
                        double data = Double.parseDouble(ab.readLine());
                        list.addNode(data);
                    }

                    System.out.print("The doubly linked list is: ");
                    list.printList();

                    promptAndWait();
                    break;

                }

                case 2:
                {
                    System.out.print("Enter the element to delete: ");
                    double data = Double.parseDouble(ab.readLine());
                    list.deleteNode(data);
            
                    System.out.print("The doubly linked list after deletion is: ");
                    list.printList();
    
                    promptAndWait();
                    break;
                }

                case 3:
                {
                    System.out.print("Enter the element to search for: ");
                    double data = Double.parseDouble(ab.readLine());
                    boolean found = list.searchNode(data);
            
                    if (found) {
                        System.out.println(data + " is found in the doubly linked list.");
                    } else {
                        System.out.println(data + " is not found in the doubly linked list.");
                    }

                    promptAndWait();
                    break;
                }

                case 4:
                {
                    System.out.println("Enter '1' to traverse the list in forward order, or '2' to traverse it in reverse order:");
                    int option = Integer.parseInt(ab.readLine());
            
                    if (option == 1) {
                        list.traverseForward();
                    } else if (option == 2) {
                        list.traverseBackward();
                    } else {
                        System.out.println("Invalid option!");
                    }

                    
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

    
    // Node class for a doubly linked list
    private static class Node {
        double data;
        Node prev;
        Node next;

        Node(double data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Head and tail nodes of the doubly linked list
    private Node head;
    private Node tail;

    // Method to add a node to the end of the list
    private void addNode(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to print the list from head to tail
    private void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private void deleteNode(double data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    // Method to search for a node in the list
    private boolean searchNode(double data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to traverse and print the list in forward order
    private void traverseForward() {
        Node current = head;
        System.out.print("The doubly linked list in forward order is: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to traverse and print the list in reverse order
    private void traverseBackward() {
        Node current = tail;
        System.out.print("The doubly linked list in reverse order is: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
    
}
