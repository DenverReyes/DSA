import java.io.*;
import java.util.Scanner;

public class Reyes_PT5 {

    public static void main(String[] args) throws Exception {

        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();


        int menu_input;


        do{

            System.out.print("\033[H\033[2J");

            System.out.println("1. In-order Traversal");
            System.out.println("2. Pre-order Traversal");
            System.out.println("3. Post-order Traversal");
            System.out.println("4. Exit");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(ab.readLine());

            switch(menu_input)
            {

                case 1:{

                    System.out.println("Enter the number of elements to insert into the binary tree:");
                    int n = scanner.nextInt();
            
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        int element = scanner.nextInt();
                        binaryTree.insert(element);
                    }
            
                    System.out.print("In-order traversal: ");
                    binaryTree.inorderTraversal(binaryTree.root);

                    promptAndWait();
                    break;

                }

                case 2:{

                    System.out.println("Enter the number of elements to insert into the binary tree:");
                    int n = scanner.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        int element = scanner.nextInt();
                        binaryTree.insert(element);
                    }

                    System.out.print("Pre-order traversal: ");
                    binaryTree.preorderTraversal(binaryTree.root);

                    promptAndWait();
                    break;
                }

                case 3:{
                    
                    System.out.println("Enter the number of elements to insert into the binary tree:");
                    int n = scanner.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        int element = scanner.nextInt();
                        binaryTree.insert(element);
                    }

                    System.out.print("Post-order traversal: ");
                    binaryTree.postorderTraversal(binaryTree.root);

                }

                case 4:{
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

   public static class Node {
        int data;
        Node left, right;
    
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    
   public static class BinaryTree {
        Node root;
    
        public BinaryTree() {
            root = null;
        }
    
        public void insert(int data) {
            root = insertNode(root, data);
        }
    
        private Node insertNode(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
    
            if (data < root.data)
                root.left = insertNode(root.left, data);
            else if (data > root.data)
                root.right = insertNode(root.right, data);
    
            return root;
        }
    
        public void inorderTraversal(Node root) {
            if (root != null) {
                inorderTraversal(root.left);
                System.out.print(root.data + " ");
                inorderTraversal(root.right);
            }
        }

        public void preorderTraversal(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
        }

        public void postorderTraversal(Node root) {
            if (root != null) {
                postorderTraversal(root.left);
                postorderTraversal(root.right);
                System.out.print(root.data + " ");
            }
        }
    }
}
